package org.example;
//Subclass of Game
public class LevelTwo extends Game{
    //Constructor
    //Super calls the constructor of Game (String[] wordGuesses, int lives)
    public LevelTwo() {
        super(new String[]{"matrix", "jupiter", "diamond", "iguana","skirt","medicine","monster","truck"}, 10);
    }
}
