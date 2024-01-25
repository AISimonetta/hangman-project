package org.example;

public class ResultsDisplay {

    /// to displayWord : "_ _ _ _ _ _"
    public void displayWord(String[] wordArray) {
        for (String letter : wordArray) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

//show lives
    public void displayLives(int lives) {
        System.out.println("Lives left: " + lives);
    }
}
