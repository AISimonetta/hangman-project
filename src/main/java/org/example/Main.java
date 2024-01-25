package org.example;

public class Main {

    //*****VARIABLES
    private String wordToGuess;
    private String[] guessedWord;
    private String guessedLetters = "";
    private int lives;
    private RandomWords randomWords;
    private ResultsDisplay resultDisplay;
    private UserInteraction userInteraction;

    //*****CONSTRUCTORS
    public Main(String wordToGuess, String[] guessedWord, String guessedLetters, int lives) {
        this.wordToGuess = wordToGuess;
        this.guessedWord = guessedWord;
        this.guessedLetters = guessedLetters;
        this.lives = lives;
    }

    public Main(String[] wordGuesses) {
        startGame(wordGuesses);
    }

    //******METHODS
    //method to start game
    private void startGame(String[] wordGuesses) {
        randomWords = new RandomWords(wordGuesses);
        resultDisplay = new ResultsDisplay();
        userInteraction = new UserInteraction();
        wordToGuess = randomWords.getRandomWord();
        guessedWord = new String[wordToGuess.length()];
        lives = 10;
        //start words with __
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = "_";
        }
    }

    //method to play game while still having lives
    public void playGame() {
        while (lives > 0 && !isWordGuessed()) {
            displayGameStatus();
            char guess = userInteraction.getGuessCharacter();
            checkGuess(guess);
        }
        displayGameResult();
    }

    //to check if word is guessed by the _ left
    private boolean isWordGuessed() {
        for (String letter : guessedWord) {
            if (letter.equals("_")) {
                return false;
            }
        }
        return true;
    }


    //show status of my user interaction methods :displayWord,displayGuessedLetters & displayLives
    private void displayGameStatus() {
        resultDisplay.displayWord(guessedWord);
        resultDisplay.displayLives(lives);
    }

    // keep track guesses and lives
    //IntelliJ recommended wrapping guess in valaueof

    private void checkGuess(char guess) {
        char guessUppercase = Character.toUpperCase(guess);
        guessedLetters += guess + " ";
        if (!wordToGuess.toUpperCase().contains(String.valueOf(guessUppercase))) {
            lives--;
            System.out.println("Sorry, it's not a match.");
        } else {
            updateGuessedWord(guessUppercase);
        }
    }


    //update guess word if match
    private void updateGuessedWord(char guess){
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                guessedWord[i] = String.valueOf(guess);
            }
        }
    }

        //show results if winning or loosing
    private void displayGameResult() {
        if (isWordGuessed()) {
            System.out.println("Bravo! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("Sorry, you do not have any more lives left. The word was: " + wordToGuess);
        }
    }

    // needed to run programme
    public static void main(String[] argv) {
        String[] wordGuesses = { "Butterfly" , "Jupiter", "Whale", "Moon", "Cat", "Architecture", "Diamond"};
        Main game = new Main(wordGuesses);
        game.playGame();
    }
}