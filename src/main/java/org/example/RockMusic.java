package org.example;

public class RockMusic implements Music {
    private RockMusic(){}

    public static RockMusic getRockMusic(){
        return new RockMusic();
    }
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
}
