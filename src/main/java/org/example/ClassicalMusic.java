package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> musicList = new ArrayList<>();

    {
        musicList.add("Hungarian Rhapsody");
        musicList.add("Beethoven's 5th Symphony");
        musicList.add("1812 Overture");
    }

    @Override
    public List<String> getSong() {
        return musicList;
    }
}
