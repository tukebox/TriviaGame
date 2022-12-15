package com.ohj4.triviagame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutManager {

    private static CardLayoutManager singleton = null;
    private static JPanel cards;
    private static JFrame frame;


    public static synchronized CardLayoutManager getInstance() {
        if (null == singleton) {
            singleton = new CardLayoutManager();
            createAndShowGUI();
        }
        return singleton;
    }

    private static void createAndShowGUI() {
        
        frame = new JFrame("Trivia Game");
        frame.setSize(1200, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setBackground(Color.CYAN);
        frame.setResizable(false);

        StartScreen start = new StartScreen();
        ScoresScreen scores = new ScoresScreen();
        NewGameScreen newGame = new NewGameScreen();
        GameScreen gameScreen = new GameScreen();
        BetweenQuestionsScreen betweenQuestions = new BetweenQuestionsScreen();

        cards = new JPanel(new CardLayout());
        cards.add(start.getPanel(), "STARTSCREEN");
        cards.add(scores.getPanel(), "SCORES");
        cards.add(newGame.getPanel(), "NEWGAMESCREEN");
        cards.add(gameScreen.getPanel(), "GAMESCREEN");
        cards.add(betweenQuestions.getPanel(), "ANSWERSCREEN");

        frame.add(cards);
        frame.setVisible(true);
    }

    public void setScreen (ActionEvent e) {
        
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)e.getActionCommand());
    }

    public void setScreen (String screen) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, screen);
    }

    private CardLayoutManager() {}

}