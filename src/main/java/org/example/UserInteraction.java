package org.example;

import java.util.Scanner;

public class UserInteraction {
    private Scanner scanner = new Scanner(System.in);

    public char getGuessCharacter () {
        System.out.println("Please enter a letter: ");
        return scanner.next().charAt(0);
    }
}
