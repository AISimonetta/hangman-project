package org.example;

public class Main {
    //VARIABLES
    private Game currentGame; //Instance of Game class
    private String wordToGuess; // Random word selected
    private String[] guessedWord; // Word Array representing quessed letters in the word
    private String guessedLetters = "";
    private Words randomWords; //Instance of Word class
    private Display resultDisplay;//Instance of Display class
    private UserInteraction userInteraction; //Instance of UserInteraction class


    public Main() {
        initializeGame();
    }

    // To initialize game and objects
    public void initializeGame() {
        userInteraction = new UserInteraction();
        resultDisplay = new Display();
        wordToGuess = "";
        guessedWord = new String[]{};
    }

    //User can choose level and the game will be set up accordingly
    public void startGame() {
        int levelChoice = userInteraction.chooseALevel();
        switch (levelChoice) {
            case 1:
                currentGame = new LevelOne();
                break;
            case 2:
                currentGame = new LevelTwo();
                break;
            case 3:
                currentGame = new LevelThree();
                break;
            default:
                System.out.println("Not valid");
                currentGame = new LevelOne();
                break;
        }

        // Set word guesses based on the level choice
        randomWords = new Words(currentGame.getWordGuesses());

        wordToGuess = randomWords.getRandomWord();
        guessedWord = new String[wordToGuess.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = "_";
        }
        currentGame.setWordGuesses(wordToGuess);
    }

    //the user will make guesses till the game ends and no mpre lives
    public void playGame() {
        while (currentGame.getLives() > 0 && !isWordGuessed()) {
            displayGameStatus();
            char guess = userInteraction.getGuessCharacter(); //Gets the letter from user
            checkGuess(guess);
        }
        displayGameResult();
    }

    //If the word is guessed returns T otherwise is F
    private boolean isWordGuessed() {
        for (String letter : guessedWord) {
            if (letter.equals("_")) { // if it is "_" the letter was no guessed so= F.
                return false;
            }
        }
        return true;
    }
//shows state of the game
    private void displayGameStatus() {
        resultDisplay.displayWord(guessedWord);
        resultDisplay.displayLives(currentGame.getLives());
    }

    //This methods checks if guessed letter is correct  and updates game
    private void checkGuess(char guess) {
        char guessUppercase = Character.toUpperCase(guess);
        guessedLetters += guess + " ";
        if (!wordToGuess.toUpperCase().contains(String.valueOf(guessUppercase))) {
            currentGame.decrementLives();
            System.out.println("* SORRY, it's not a match.");
        } else {
            updateGuessedWord(guessUppercase);
            System.out.println("* WELL DONE!, It is a match!");
        }
    }

    //updates the word (array)  based on the correct guesses from the user
    private void updateGuessedWord(char guess) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                guessedWord[i] = String.valueOf(guess);
            }
        }
    }

    //Shows is users wins or not.
    private void displayGameResult() {
        if (isWordGuessed()) {
            System.out.println("* BRAVO! Your guessed word is " + wordToGuess);
        } else {
            System.out.println("* SORRY, you do not have any more lives left. The word was: " + wordToGuess);
        }
    }

    //needed/compulsory for the game to be initiated
    public static void main(String[] argv) {
        Main game = new Main();
        do {
            game.startGame();
            game.playGame();
        } while (game.userInteraction.playAgain());
    }
}