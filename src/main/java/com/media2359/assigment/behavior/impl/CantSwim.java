package main.java.com.media2359.assigment.behavior.impl;

import main.java.com.media2359.assigment.behavior.SwimBehavior;

public class CantSwim implements SwimBehavior {
    @Override
    public String swim() {
        return "I can't swim";
    }
}
