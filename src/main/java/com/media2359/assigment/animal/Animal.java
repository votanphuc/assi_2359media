package main.java.com.media2359.assigment.animal;

import main.java.com.media2359.assigment.behavior.FlyBehavior;
import main.java.com.media2359.assigment.behavior.SingBehavior;
import main.java.com.media2359.assigment.behavior.SwimBehavior;
import main.java.com.media2359.assigment.behavior.WalkBehavior;
import main.java.com.media2359.assigment.behavior.impl.ItWalk;

public abstract class Animal {
    protected FlyBehavior flyBehavior;
    protected WalkBehavior walkBehavior;
    protected SingBehavior singBehavior;
    protected SwimBehavior swimBehavior;

    protected Animal() {
        walkBehavior = new ItWalk();
    }

    public void walk() {
        System.out.println(walkBehavior.walk());
    }

    public void swim(){
        System.out.println(swimBehavior.swim());
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public WalkBehavior getWalkBehavior() {
        return walkBehavior;
    }

    public SingBehavior getSingBehavior() {
        return singBehavior;
    }

    public SwimBehavior getSwimBehavior() {
        return swimBehavior;
    }
}