package com.ohj4.triviagame;

import java.awt.Color;

public class Player implements Comparable<Player> {

    private String nickname;
    private Integer totalScore = 0;
    //private List lifelines;
    private Integer lastAnswerScore;
    private String lastAnswerString;
    private Color gameColor;

    public Player(String nickname, boolean usingTokens, Color gameColor) {
        if (usingTokens) {
            // enable lifelines
        }
        this.gameColor = gameColor;
        this.nickname = nickname;
        //this.lifelines = 
    }

    public int compareTo(Player anotherPlayer) {
        return this.totalScore - anotherPlayer.totalScore;
    }

    public Integer getScore() {
        return totalScore;
    }

    public void setGameColor(Color gameColor) {
        this.gameColor = gameColor;
    }

    public Color getGameColor() {
        return gameColor;
    }

    public Integer getLastAnswerScore() {
        return lastAnswerScore;
    }

    public String getLastAnswerString() {
        return lastAnswerString;
    }

    public void setLastAnswerString(String lastAnswerString) {
        this.lastAnswerString = lastAnswerString;
    }

    public void addToScore(Integer i) {
        lastAnswerScore = i;
        totalScore += i;
    }

    public String getName() {
        return nickname;
    }
}
