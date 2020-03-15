package main.java.com.media2359.assigment;

public class Parrot extends Bird {
    private String sound;

    @Override
    public void sing() {
        System.out.println(sound);
    }

    public Parrot(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
