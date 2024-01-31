package org.example;

public class Display {

    //Print state of guessed word in console.
    public void displayWord(String[] wordArray) {
        System.out.println("* GUESS MY WORD : ");
        for (String letter : wordArray) {
            System.out.print( letter + " ");
        }
        System.out.println();
    }
    //Print numbers of lives left
    public void displayLives(int lives) {
        System.out.println("* Lives left: " + lives);
    }
}
