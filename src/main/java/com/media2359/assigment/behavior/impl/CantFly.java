package main.java.com.media2359.assigment.behavior.impl;

import main.java.com.media2359.assigment.behavior.Flys;

public class CantFly implements Flys {
    @Override
    public String fly() {
        return "I can't fly";
    }
}
