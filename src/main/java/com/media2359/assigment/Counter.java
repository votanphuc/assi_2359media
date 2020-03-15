package main.java.com.media2359.assigment;

import main.java.com.media2359.assigment.animal.Animal;
import main.java.com.media2359.assigment.animal.bird.*;
import main.java.com.media2359.assigment.animal.butterfly.Butterfly;
import main.java.com.media2359.assigment.animal.butterfly.Caterpillar;
import main.java.com.media2359.assigment.animal.fish.Clownfish;
import main.java.com.media2359.assigment.animal.fish.Dolphin;
import main.java.com.media2359.assigment.animal.fish.Fish;
import main.java.com.media2359.assigment.animal.fish.Shark;
import main.java.com.media2359.assigment.behavior.impl.ItFly;
import main.java.com.media2359.assigment.behavior.impl.ItSing;
import main.java.com.media2359.assigment.behavior.impl.ItSwim;
import main.java.com.media2359.assigment.behavior.impl.ItWalk;

public class Counter {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Butterfly(),
                new Caterpillar()
        };
        int flyableCounter = 0;
        int walkableCounter = 0;
        int singableCounter = 0;
        int swimableCounter = 0;

        for (Animal a: animals) {
            if (a.getFlyBehavior() instanceof ItFly) flyableCounter++;
            if (a.getWalkBehavior() instanceof ItWalk) walkableCounter++;
            if (a.getSingBehavior() instanceof ItSing) singableCounter++;
            if (a.getSwimBehavior() instanceof ItSwim) swimableCounter++;
        }

        System.out.println("Can Fly: " + flyableCounter);
        System.out.println("Can Walk: " + walkableCounter);
        System.out.println("Can Sing: " + singableCounter);
        System.out.println("Can Swim: " + swimableCounter);
    }
}
