package fr.eni.formation.geometrie.business;

import java.io.Serializable;

public class Carre implements Serializable {

    private long id;

    private Point origine;

    private double cote;

    public Carre() {
    }

    public Carre(Point origine, double cote){
        this.setOrigine(origine);
        this.setCote(cote);
    }

    public double aire() {
        return getCote() * getCote();
    }

    public double perimetre() {
        return 4 * getCote();
    }

    public void deplacer(double dx, double dy){
        origine.deplacer(dx,dy);
    }

    @Override
    public String toString() {
        return String.format("Carre[%s; %6.1f]", getOrigine(), getCote());
    }

    public Point getOrigine() {
        return origine;
    }

    public void setOrigine(Point origine) {
        this.origine = origine;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
