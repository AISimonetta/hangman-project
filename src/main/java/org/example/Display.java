package org.example;

public class Display {

    public void displayWord(String[] wordArray) {
        System.out.println("* GUESS MY WORD : ");
        for (String letter : wordArray) {
            System.out.print( letter + " ");
        }
        System.out.println();
    }

    public void displayLives(int lives) {
        System.out.println("* Lives left: " + lives);
    }
}
