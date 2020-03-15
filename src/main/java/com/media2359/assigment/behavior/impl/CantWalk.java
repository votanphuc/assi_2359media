package main.java.com.media2359.assigment.behavior.impl;

import main.java.com.media2359.assigment.behavior.WalkBehavior;

public class CantWalk implements WalkBehavior {
    @Override
    public String walk() {
        return "I can't walk";
    }
}
