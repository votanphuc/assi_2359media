package main.java.com.media2359.assigment;

import main.java.com.media2359.assigment.animal.bird.*;
import main.java.com.media2359.assigment.animal.butterfly.Butterfly;
import main.java.com.media2359.assigment.animal.butterfly.Caterpillar;
import main.java.com.media2359.assigment.animal.fish.Clownfish;
import main.java.com.media2359.assigment.animal.fish.Dolphin;
import main.java.com.media2359.assigment.animal.fish.Fish;
import main.java.com.media2359.assigment.animal.fish.Shark;
import main.java.com.media2359.assigment.util.Language;
import main.java.com.media2359.assigment.util.Locale;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        Duck duck = new Duck();
        duck.swim();
        duck.say();

        Chicken chicken = new Chicken();
        chicken.fly();
        chicken.say();

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

        Fish fish = new Fish();
        fish.swim();

        Shark shark = new Shark();
        System.out.println(shark.getSize());
        System.out.println(shark.getColor());
        shark.eat();

        Clownfish clownfish = new Clownfish();
        System.out.println(shark.getSize());
        System.out.println(shark.getColor());
        clownfish.joke();

        Dolphin dolphin = new Dolphin();
        dolphin.swim();

        Butterfly butterfly = new Butterfly();
        butterfly.fly();
        butterfly.sing();

        Caterpillar caterpillar = new Caterpillar();
        caterpillar.walk();
        caterpillar.fly();

        Language.locale = Locale.DUTCH;
        Rooster rooster1 = new Rooster();
        rooster1.say();
    }
}