package com.truant.myGames.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PackManGame implements GamingConsole{
    public void up() {
        System.out.println("Goes up");
    }

    public void down() {
        System.out.println("Goes down");
    }

    public void left() {
        System.out.println("Goes left");
    }

    public void right() {
        System.out.println("Goes right");
    }
}
