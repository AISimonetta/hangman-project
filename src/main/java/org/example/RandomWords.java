package org.example;

import java.util.Random;

public class RandomWords {

    String wordGuesses[] = { "Butterfly" , "Jupiter", "Whale", "Moon", "Cat", "Architecture", "Diamond"};
    public String getRandomWord() {
        Random random = new Random();
        System.out.println("hola");

        int index = random.nextInt(wordGuesses.length);
        return wordGuesses[index].toUpperCase();
    }
}
