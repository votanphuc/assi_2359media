package main.java.com.media2359.assigment.animal.butterfly;

import main.java.com.media2359.assigment.animal.Animal;
import main.java.com.media2359.assigment.behavior.impl.CantSing;
import main.java.com.media2359.assigment.behavior.impl.ItFly;

public class Butterfly extends Animal {

    public Butterfly() {
        flyBehavior = new ItFly();
        singBehavior = new CantSing();
    }
}
