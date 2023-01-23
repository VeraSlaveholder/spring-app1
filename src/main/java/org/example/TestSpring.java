package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContex.xml"
        );

        RockMusic rockMusic1=context.getBean("musicBean1",RockMusic.class);
        System.out.println(rockMusic1.getSong());


//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer1==musicPlayer2);
        context.close();
    }
}
