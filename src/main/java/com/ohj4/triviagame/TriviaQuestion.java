package com.ohj4.triviagame;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TriviaQuestion {

    private String questionString;
    private String answerString;
    private List<String> incorrectAnswers;

    public TriviaQuestion(JSONObject question) {

        try {
            questionString = "<html>" + question.getString("question") + "</html>";
            answerString = "<html>" + question.getString("correct_answer") + "</html>";
            JSONArray incorrectArray = question.getJSONArray("incorrect_answers");
            incorrectAnswers = new ArrayList<String>();
            for (int i = 0; i < incorrectArray.length(); i++) {
                incorrectAnswers.add("<html>" + incorrectArray.getString(i) + "</html>");
            }

        } catch (JSONException e) {
            System.out.println("---ERROR---:" +e.getMessage());
        }

    }

    public String getQuestion() {
        return questionString;
    }
    
    public String getAnswer() {
        return answerString;
    }

    public List<String> getIncorrectAnswers() {
        return incorrectAnswers;
    }
}