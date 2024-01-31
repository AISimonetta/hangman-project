package org.example;

//Superclass
public class Game {
    // This array contains word to guess
    private String[] wordGuesses;
    // Show lives user has
    private int lives;

    //Constructor
    public Game(String[] wordGuesses, int lives) {
        this.wordGuesses = wordGuesses;
        this.lives = lives;
    }

    //Function that will set the word to guess
    public void setWordGuesses(String wordToGuess) {
    }

    //Function that returns the lives left
    public int getLives() {
        return lives;
    }

    //Function that decrements the lives by 1.
    public void decrementLives() {
        lives--;
    }

    //Function that will return the array with the words that can be guessed.
    public String[] getWordGuesses() {
        return wordGuesses;
    }

}