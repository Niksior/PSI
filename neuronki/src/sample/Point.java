package sample;

import java.util.Random;

public class Point {
    private double x;
    private double y;
    private boolean label;

    public Point() {
        Random rand = new Random(); //zmienic podzial zeby sam wygnereowal linie
        this.x = rand.nextDouble() * 10 - 5;
        this.y = rand.nextDouble() * 10 - 5;
        this.label = rand.nextBoolean();
    }

    public void activate() {
        if(label)
            this.y = -1;
        else
            this.y = 1;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setLabel(boolean label) {
        this.label = label;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean getLabel() {
        return label;
    }


}
