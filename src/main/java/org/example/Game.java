package org.example;

public class Game {
    private String[] wordGuesses;
    private int lives;
    private int level;

    public Game(String[] wordGuesses, int lives) {
        this.wordGuesses = wordGuesses;
        this.lives = lives;
    }

//    // New method to set wordGuesses
    public void setWordGuesses(String wordToGuess) {
}

    // New method to get lives
    public int getLives() {
        return lives;
    }

    // New method to decrement lives
    public void decrementLives() {
        lives--;
    }

    // Existing method to get level
    public int getLevel() {
        return level;
    }
}