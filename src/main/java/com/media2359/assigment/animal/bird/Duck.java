package main.java.com.media2359.assigment.animal.bird;

import main.java.com.media2359.assigment.behavior.impl.ItSwim;

public class Duck extends Bird {

    public Duck() {
        swimBehavior = new ItSwim();
    }

    public void say() {
        super.say("Quack, quack");
    }
}
