package fr.eni.formation.geometrie.data.entity;

import fr.eni.formation.geometrie.business.Carre;
import fr.eni.formation.geometrie.business.Point;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Carre")
public class CarreEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Embedded
    private PointEntity origine;

    private double cote;

    public PointEntity getOrigine() {
        return origine;
    }

    public void setOrigine(PointEntity origine) {
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

    public Carre toModel(){
        Carre carre = new Carre(
                new Point(origine.getX(),origine.getY()),
                cote
        );
        carre.setId(id);
        return carre;
    }

    public void fromModel(Carre carre){
        PointEntity origine = new PointEntity();
        this.setOrigine(origine);
        this.setId(carre.getId());
        this.setCote(carre.getCote());
        origine.setX(carre.getOrigine().getX());
        origine.setY(carre.getOrigine().getY());
    }

    public static CarreEntity encode(Carre carre){
        CarreEntity carreEntity = new CarreEntity();
        carreEntity.fromModel(carre);
        return carreEntity;
    }

}
