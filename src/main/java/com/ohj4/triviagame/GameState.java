package com.ohj4.triviagame;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.awt.Color;

public class GameState {

    private static GameState singleton;

    private List<Player> gamePlayers;
    private List<TriviaQuestion> gameQuestions;
    private Map<String, Integer> categories;
    private Integer questionCounter = 0;
    private Integer gameRounds;
    private Integer roundCounter;
    private Player currentPlayer;
    private boolean gameConcluded;
    private Integer timer;

    public static synchronized GameState getInstance() {
        if (null == singleton) {
            singleton = new GameState();
        }
        return singleton;
    }

    public Integer getTimerValue(){
        return timer;
    }

    public boolean initializeGame(int numQuestions, List<String> names, Object cat, String difficulty, int timerValue) {

        List<Color> colorList = new ArrayList<Color>();

        colorList.add(new java.awt.Color(226, 78, 66));
        colorList.add(new java.awt.Color(233, 176, 0));
        colorList.add(new java.awt.Color(0, 143, 149));
        colorList.add(new java.awt.Color(11, 60, 93));

        endGame(); // erase potential old players and settings
        gameConcluded = false;

        gamePlayers = new ArrayList<Player>();
        gameRounds = numQuestions;
        roundCounter = 1;
        timer = timerValue;

        for (int i = 0; i < names.size(); i++) {
            gamePlayers.add(new Player(names.get(i), true, colorList.get(i)));
        }

        // initialize to first player
        currentPlayer = gamePlayers.get(0);
        // need an extra question per player for chip use, pass boolean back for error display
        return fetchQuestions(numQuestions * names.size() + names.size(), categories.get(cat.toString()), difficulty);
    }

    public void fetchCategories() {

        try {

            categories = new HashMap<>();
            URL getCategories = new URL("https://opentdb.com/api_category.php");

            JSONTokener tokener = new JSONTokener(getCategories.openStream());
            JSONObject obj = new JSONObject(tokener);
            
            if (obj.has("trivia_categories")) {
                JSONArray categoryArray = new JSONArray(obj.getJSONArray("trivia_categories"));

                for (int i = 0; i < categoryArray.length(); i++) {
                    JSONObject o = categoryArray.getJSONObject(i);
                    categories.put(o.getString("name"), o.getInt("id"));
                }
            }
        }
        catch (JSONException | IOException e) {
            System.out.println("exception: " + e.getMessage());
        }
        
    }

    public Set<String> getCategories() {
        if (categories == null)
            fetchCategories();
        return categories.keySet();
    }

    //public 

    private boolean fetchQuestions(Integer numQuestions, Integer category, String difficulty) {

        // Basic api call implemented, parametrized by number of questions and category

        try {

            String APIString = "https://opentdb.com/api.php?amount=" + String.valueOf(numQuestions)
                            +"&category=" + String.valueOf(category) + "&difficulty=" + difficulty + "&type=multiple";
            URL questionAPI = new URL(APIString);

            JSONTokener tokener = new JSONTokener(questionAPI.openStream());
            JSONObject obj = new JSONObject(tokener);
            System.out.println(obj);
            if (obj.getInt("response_code") == 0) {
                
                gameQuestions = new ArrayList<TriviaQuestion>();
                JSONArray questionArray = new JSONArray(obj.getJSONArray("results"));

                for(Integer i=0;i<questionArray.length();i++){
                    TriviaQuestion q = new TriviaQuestion(questionArray.getJSONObject(i));
                    gameQuestions.add(q);

                }
                
                return true;
            }
            else {
                return false;
            }

        } catch (JSONException | IOException e) {
            System.out.println("exception: " + e.getMessage());
            return false;
        }

    }

    public boolean submitAnswer(String playerAnswer) {

        if (playerAnswer.equals(gameQuestions.get(questionCounter).getAnswer())) {
            currentPlayer.addToScore(100);
            currentPlayer.setLastAnswerString(playerAnswer);
            return true;
        }
        else {
            currentPlayer.addToScore(0);
            currentPlayer.setLastAnswerString(playerAnswer);
            return false;
        }
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public String getQuestionString() {
        return gameQuestions.get(questionCounter).getQuestion();
    }

    public List<String> getAnswerOptions() {
        List<String> answerOptions = new ArrayList<String>();
        answerOptions.add(gameQuestions.get(questionCounter).getAnswer());
        for (String s : gameQuestions.get(questionCounter).getIncorrectAnswers()) {
            answerOptions.add(s);
        }
        Collections.shuffle(answerOptions);
        return answerOptions;
    }

    public List<Player> getPlayerNamesAndScores() {

        List<Player> players = new ArrayList<Player>(gamePlayers);
        Collections.sort(players, Collections.reverseOrder());
        
        if (players.size() < 4) {
            for (int x = players.size(); x <= 4; x++) {
                players.add(new Player("", true, new Color(0,0,0)));
            }
        }
        return players;
    }

    public String getRoundDisplay() {
        return String.valueOf(roundCounter) + "/" + String.valueOf(gameRounds);
    }

    public Integer getGameLength() {
        return gameRounds;
    }

    public String getCurrentPlayerName() {
        return currentPlayer.getName();
    }

    public boolean getGameConcluded() {
        return gameConcluded;
    }

    public boolean endTurn() {

        questionCounter++;
        for (int x = 0; x < gamePlayers.size(); x++) {
            if (currentPlayer.equals(gamePlayers.get(x))) {
                if (x < gamePlayers.size()-1) {
                    currentPlayer = gamePlayers.get(++x);
                }
                else {
                    currentPlayer = gamePlayers.get(0);
                    roundCounter++;
                }
            }
        }
        
        if (roundCounter > gameRounds) {
            gameConcluded = true;
            return false;
        }
        else {
            return true;
        }
    }

    public void endGame() {
        gamePlayers = null;
        gameQuestions = null;
        questionCounter = 0;
        gameRounds = null;
        roundCounter = null;
    }
}