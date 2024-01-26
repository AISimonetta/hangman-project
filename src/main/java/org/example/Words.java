package org.example;

import java.util.Random;

public class Words {

    String wordGuesses[] = { "Butterfly" , "Jupiter", "Whale", "Moon", "Cat", "Architecture", "Diamond"};

    public Words(String[] wordGuesses) {
        this.wordGuesses = wordGuesses;
    }

    public String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(wordGuesses.length);
        return wordGuesses[index].toUpperCase();
    }
}
