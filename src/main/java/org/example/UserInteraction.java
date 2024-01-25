package org.example;

import java.util.Scanner;

public class UserInteraction {
    private Scanner scanner = new Scanner(System.in);

    ////need to accept only letters not numbers. if numbers diplay error messahe
    public char getGuessCharacter() {
        System.out.println("--------------------------------------------------");
        System.out.println("* Please enter a letter: ");

        char guess = scanner.next().charAt(0);

        if (guess) {
            return guess;
        } else {
            System.out.println("* INCORRECT INPUT, that is not a letter ");
        }
    }
}
