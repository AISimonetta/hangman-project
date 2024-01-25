package org.example;

public class Main {
    private String wordToGuess;
    private String[] guessedWord;
    private String guessedLetters = "";
    private int lives;
    private RandomWords randomWords;
    private ResultsDisplay resultDisplay;
    private UserInteraction userInteraction;

    public Main(String wordToGuess, String[] guessedWord, String guessedLetters, int lives) {
        this.wordToGuess = wordToGuess;
        this.guessedWord = guessedWord;
        this.guessedLetters = guessedLetters;
        this.lives = lives;
    }

    public Main(String[] wordGuesses) {
        startGame(wordGuesses);
    }

    //method to start game
    private void startGame(String[] wordGuesses) {
        randomWords = new RandomWords(wordGuesses);
        resultDisplay = new ResultsDisplay();
        userInteraction = new UserInteraction();
        wordToGuess = randomWords.getRandomWord();
        guessedWord = new String[wordToGuess.length()];
        lives = 10;
        //start word with __
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = "_";
        }
    }

    //method to play game while still having lives
    public void playGame() {
        while (lives > 0 && !isWordGuessed()) {
            displayGameStatus();
            char guess = userInteraction.getGuessCharacter();
            checkGuess(guess); // error with or without char..ask charlie
        }
        displayGameResult();
    }

    //to check if word is guessed by the _ left
    private boolean isWordGuessed() {
        return false;
    }


    //show status of my user interaction methods :displayWord,displayGuessedLetters & displayLives
    private void displayGameStatus() {
    }

    // keep track guesses and lives
    private void checkGuess(char guess) {
    }

    //show results if winning or loosing
    private void displayGameResult() {
    }

}