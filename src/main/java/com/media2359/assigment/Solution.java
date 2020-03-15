package main.java.com.media2359.assigment;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        Chicken chicken = new Chicken();
        try {
            chicken.fly();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Message: " + e.getMessage());
        }

        Rooster rooster = new Rooster();
        rooster.sing();

        RoosterNoneInherit roosterNoneInherit = new RoosterNoneInherit();
        rooster.sing();

        Parrot parrot;
        parrot = new ParrotLiveWithDog();
        parrot.sing();
        parrot = new ParrotLiveWithCat();
        parrot.sing();
        parrot = new ParrotLiveWithRooster();
        parrot.sing();

    }
}