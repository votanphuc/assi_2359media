package main.java.com.media2359.assigment;

import main.java.com.media2359.assigment.animal.bird.*;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        Chicken chicken = new Chicken();
        chicken.fly();

        Rooster rooster = new Rooster();
        rooster.say();

        RoosterNoneInherit roosterNoneInherit = new RoosterNoneInherit();
        rooster.say();

        Parrot parrot;
        parrot = new ParrotLiveWithDog();
        parrot.say();
        parrot = new ParrotLiveWithCat();
        parrot.say();
        parrot = new ParrotLiveWithRooster();
        parrot.say();

    }
}