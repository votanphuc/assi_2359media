package main.java.com.media2359.assigment.behavior.impl;

import main.java.com.media2359.assigment.behavior.SingBehavior;

public class CantSing implements SingBehavior {
    @Override
    public String sing() {
        return "I can't sing";
    }
}
