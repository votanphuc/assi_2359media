package main.java.com.media2359.assigment.animal.bird;

public class Parrot extends Bird {
    protected String sound;

    public Parrot() {
    }

    public Parrot(String sound) {
        this.sound = sound;
    }

    public void say() {
        super.say(sound);
    }
}