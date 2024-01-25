package org.example;

import java.util.Scanner;

public class UserInteraction {
    private Scanner scanner = new Scanner(System.in);

  //char for single character , there will be other method to check not only index 0.
    public char getGuessCharacter () {
        System.out.println("Please enter a letter: ");
        return scanner.next().charAt(0);
    }
}
