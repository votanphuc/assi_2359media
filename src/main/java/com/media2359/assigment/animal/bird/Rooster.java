package main.java.com.media2359.assigment.animal.bird;

import main.java.com.media2359.assigment.util.RoosterLang;

public class Rooster extends Chicken {
    @Override
    public void say() {
        super.say(RoosterLang.getSound());
    }
}