package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContex.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicalGenres.ROCK);
        musicPlayer.playMusic(MusicalGenres.CLASSICAL);

        context.close();
    }
}
