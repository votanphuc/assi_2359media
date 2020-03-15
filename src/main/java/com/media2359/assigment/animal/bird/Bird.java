package main.java.com.media2359.assigment.animal.bird;

import main.java.com.media2359.assigment.animal.Animal;
import main.java.com.media2359.assigment.behavior.Flys;
import main.java.com.media2359.assigment.behavior.impl.ItFlys;

public class Bird extends Animal {
    protected Flys flyingType;

    public Bird() {
        flyingType = new ItFlys();
    }

    public void fly() {
        System.out.println(flyingType.fly());
    }

    public void sing() {
        System.out.println("I am singing");
    }

    protected void say(String sound) {
        System.out.println(sound);
    }
}