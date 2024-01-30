package org.example;

public class Game {
    private String[] wordGuesses;
    private int lives;

    public Game(String[] wordGuesses, int lives) {
        this.wordGuesses = wordGuesses;
        this.lives = lives;
    }
    public void setWordGuesses(String wordToGuess) {
    }

    public int getLives() {
        return lives;
    }

    public void decrementLives() {
        lives--;
    }

    public String[] getWordGuesses() {
        return wordGuesses;
    }
}