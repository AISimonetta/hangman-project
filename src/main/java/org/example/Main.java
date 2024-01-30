package org.example;

public class Main {
    private Game currentGame;
    private String wordToGuess;
    private String[] guessedWord;
    private String guessedLetters = "";
    private Words randomWords;
    private Display resultDisplay;
    private UserInteraction userInteraction;

    public Main() {
        initializeGame();
    }

    public void initializeGame() {
        userInteraction = new UserInteraction();
        resultDisplay = new Display();
        wordToGuess = "";
        guessedWord = new String[]{};
    }

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

    public void playGame() {
        while (currentGame.getLives() > 0 && !isWordGuessed()) {
            displayGameStatus();
            char guess = userInteraction.getGuessCharacter();
            checkGuess(guess);
        }
        displayGameResult();
    }

    private boolean isWordGuessed() {
        for (String letter : guessedWord) {
            if (letter.equals("_")) {
                return false;
            }
        }
        return true;
    }

    private void displayGameStatus() {
        resultDisplay.displayWord(guessedWord);
        resultDisplay.displayLives(currentGame.getLives());
    }

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

    private void updateGuessedWord(char guess) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                guessedWord[i] = String.valueOf(guess);
            }
        }
    }

    private void displayGameResult() {
        if (isWordGuessed()) {
            System.out.println("* BRAVO! Your guessed word is " + wordToGuess);
        } else {
            System.out.println("* SORRY, you do not have any more lives left. The word was: " + wordToGuess);
        }
    }

    public static void main(String[] argv) {
        Main game = new Main();
        do {
            game.startGame();
            game.playGame();
        } while (game.userInteraction.playAgain());
    }
}