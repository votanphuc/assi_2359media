package main.java.com.media2359.assigment.animal.butterfly;

import main.java.com.media2359.assigment.animal.Animal;
import main.java.com.media2359.assigment.behavior.impl.CantFly;
import main.java.com.media2359.assigment.behavior.impl.ItWalk;

public class Caterpillar extends Animal {

    public Caterpillar() {
        flyBehavior = new CantFly();
        walkBehavior = new ItWalk();
    }
}
