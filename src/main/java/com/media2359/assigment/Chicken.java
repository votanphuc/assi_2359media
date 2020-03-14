package main.java.com.media2359.assigment;

public class Chicken extends Bird {
    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Chicken cannot fly");
    }
}
