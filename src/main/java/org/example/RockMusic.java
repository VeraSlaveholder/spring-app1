package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> musicList = new ArrayList<>();

    {
        musicList.add("Wind cries Mary");
        musicList.add("Creep");
        musicList.add("Yellow");
    }

    @Override
    public List<String> getSong() {
        return musicList;
    }
}
