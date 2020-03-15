package main.java.com.media2359.assigment.animal.fish;

import main.java.com.media2359.assigment.animal.Animal;
import main.java.com.media2359.assigment.behavior.impl.CantSing;
import main.java.com.media2359.assigment.behavior.impl.CantWalk;
import main.java.com.media2359.assigment.behavior.impl.ItSwim;

public class Fish extends Animal {
    public Fish(){
        walkBehavior = new CantWalk();
        singBehavior = new CantSing();
        swimBehavior = new ItSwim();
    }
}
