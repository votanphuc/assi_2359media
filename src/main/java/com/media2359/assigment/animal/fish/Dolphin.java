package main.java.com.media2359.assigment.animal.fish;

import main.java.com.media2359.assigment.animal.Animal;
import main.java.com.media2359.assigment.behavior.impl.CantWalk;
import main.java.com.media2359.assigment.behavior.impl.ItSwim;

public class Dolphin extends Animal {

    public Dolphin() {
        swimBehavior = new ItSwim();
        walkBehavior = new CantWalk();

    }
}
