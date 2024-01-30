package org.example;

import java.util.Random;

public class Words {
    //*****VARIABLES
    private String[] wordGuesses;

    public Words(String[] wordGuesses) {

        this.wordGuesses = wordGuesses;
    }

    public String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(wordGuesses.length);
        return wordGuesses[index].toUpperCase();
    }
}
