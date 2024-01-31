package org.example;
//Subclass of Game

public class LevelThree extends Game{
    //Constructor
    //Super calls the constructor of Game (String[] wordGuesses, int lives)
    public LevelThree() {
        super(new String[]{"fuchsia", "walkway", "wristwatch", "yachtsman","galaxy","pneumonia","jigsaw","avenue"}, 8);
    }

}
