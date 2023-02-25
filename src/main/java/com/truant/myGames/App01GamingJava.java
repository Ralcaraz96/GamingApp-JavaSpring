package com.truant.myGames;

import com.truant.myGames.game.GameRunner;
import com.truant.myGames.game.PackManGame;

public class App01GamingJava {
    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PackManGame();

        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
