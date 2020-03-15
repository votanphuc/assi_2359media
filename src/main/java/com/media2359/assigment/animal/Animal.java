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
        if (walkBehavior != null) {
            System.out.println(walkBehavior.walk());
        }
    }

    public void swim() {
        if (swimBehavior != null) {
            System.out.println(swimBehavior.swim());
        }
    }

    public void fly() {
        if (flyBehavior != null) {
            System.out.println(flyBehavior.fly());
        }
    }

    public void sing() {
        if (singBehavior != null) {
            System.out.println(singBehavior.sing());
        }
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