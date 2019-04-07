package main;

import engine.GameHandler;

public class Main {

    /**
     * Main method for game, instantiate and execute game from here.
     * This is a comment that describes the main method of the program.
     *
     * @param args argument description goes here
     */
    public static void main(String[] args) {

        GameHandler gh = new GameHandler();

        gh.init();
        gh.run();
    }
}


