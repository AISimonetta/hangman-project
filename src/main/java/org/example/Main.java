package org.example;

public class Main {

    private String wordToGuess;
    private String[] guessedWord;
    private String guessedLetters = "";
    private int lives;

    public Main(String wordToGuess, String[] guessedWord, String guessedLetters, int lives) {
        this.wordToGuess = wordToGuess;
        this.guessedWord = guessedWord;
        this.guessedLetters = guessedLetters;
        this.lives = lives;
    }
}
