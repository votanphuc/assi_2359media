package main.java.com.media2359.assigment.behavior.impl;

import main.java.com.media2359.assigment.behavior.FlyBehavior;

public class CantFly implements FlyBehavior {
    @Override
    public String fly() {
        return "I can't fly";
    }
}
