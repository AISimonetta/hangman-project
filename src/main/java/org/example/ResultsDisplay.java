package org.example;

public class ResultsDisplay {

    /// to displayWord : "_ _ _ _ _ _"
    public void displayWord(String[] wordArray) {
        System.out.println("* WORD TO GUESS : ");
        for (String letter : wordArray) {
            System.out.print( letter + " ");
        }
        System.out.println();
    }

//show lives
    public void displayLives(int lives) {
        System.out.println("* Lives left: " + lives);
    }
}
