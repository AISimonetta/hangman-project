package org.example;

import java.util.Random;

public class Words implements  RandomWord {
    //*****VARIABLES
    private String[] wordGuesses;

    // Initialize wordGuesses
    public Words() {
        this.wordGuesses = new String[]{"default", "default"};
    }

    //overloading example with parameter
    public Words(String[] wordGuesses) {
        this.wordGuesses = wordGuesses;
    }

    @Override
    public String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(wordGuesses.length);
        return wordGuesses[index].toUpperCase();
    }
}