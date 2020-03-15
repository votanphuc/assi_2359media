package main.java.com.media2359.assigment.animal.bird;

import main.java.com.media2359.assigment.behavior.impl.CantFly;

public class Chicken extends Bird {

    public Chicken() {
        flyingType = new CantFly();
    }

    public void say() {
        super.say("Cluck, cluck");
    }
}