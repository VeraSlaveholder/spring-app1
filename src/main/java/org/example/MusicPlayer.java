package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(MusicalGenres musicalGenres) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (musicalGenres == MusicalGenres.CLASSICAL) {
            System.out.println(music2.getSong().get(randomNumber));

        } else System.out.println(music1.getSong().get(randomNumber));

    }
}

