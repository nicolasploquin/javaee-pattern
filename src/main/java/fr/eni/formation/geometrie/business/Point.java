package fr.eni.formation.geometrie.business;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Point implements Serializable {

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public void deplacer(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return String.format("Point(%3.1f;%3.1f)", getX(), getY());
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


}
