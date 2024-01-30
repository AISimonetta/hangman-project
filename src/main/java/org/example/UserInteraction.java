package org.example;

import java.util.Scanner;
public class UserInteraction {
    private Scanner scanner = new Scanner(System.in);

    // Accept only letters, display an error message for other inputs
    public char getGuessCharacter() {
        System.out.println("--------------------------------------------------");
        System.out.println("* Please enter a letter: ");

        char guess = scanner.next().charAt(0);

        if (Character.isLetter(guess)) {
            return guess;
        }

        System.out.println("* INCORRECT INPUT, that is not a letter ");
        return getGuessCharacter();
    }
    // Ask player to choose level of difficulty.
    public int chooseALevel() {
        System.out.println("* Please choose a level (1, 2, or 3): ");
        int level = scanner.nextInt();
        return level;
    }
}
