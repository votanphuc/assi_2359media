package main.java.com.media2359.assigment.animal.bird;

import main.java.com.media2359.assigment.animal.Animal;
import main.java.com.media2359.assigment.behavior.impl.ItFly;
import main.java.com.media2359.assigment.behavior.impl.ItSing;

public class Bird extends Animal {

    public Bird() {
        flyBehavior = new ItFly();
        singBehavior = new ItSing();
    }

    public void fly() {
        System.out.println(flyBehavior.fly());
    }

    public void sing() {
        System.out.println(singBehavior.sing());
    }

    protected void say(String sound) {
        System.out.println(sound);
    }
}