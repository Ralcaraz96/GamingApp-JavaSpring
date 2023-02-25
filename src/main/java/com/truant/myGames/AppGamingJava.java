package com.truant.myGames;

import com.truant.myGames.game.GameRunner;
import com.truant.myGames.game.MarioGame;
import com.truant.myGames.game.PackManGame;
import com.truant.myGames.game.SuperContraGame;

public class AppGamingJava {
    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PackManGame();

        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
