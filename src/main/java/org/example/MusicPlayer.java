package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;


public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;


    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playMusic() {
        return "Playing " + classicalMusic.getSong()+ ", "+rockMusic.getSong();
    }
}

