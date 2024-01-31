package org.example;
//Subclass of Game
public class LevelOne extends Game {
    //Constructor
    //Super calls the constructor of Game (String[] wordGuesses, int lives)
    public LevelOne() {
        super(new String[]{"butterfly", "moon", "cat", "cloud", "apple", "purple", "lion", "avenue"}, 12);
    }
}
