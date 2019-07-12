package fr.eni.formation.geometrie.data.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PointEntity implements Serializable {

    private double x;
    private double y;

    public PointEntity() {
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
