package main.java.com.media2359.assigment.animal.bird;

public class RoosterNoneInherit {
    private Chicken chicken = new Chicken();

    public void fly() {
        chicken.fly();
    }

    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}