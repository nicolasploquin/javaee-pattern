package fr.eni.formation.geometrie.data;

import fr.eni.formation.geometrie.business.Carre;

import javax.enterprise.inject.Default;
import java.util.LinkedList;
import java.util.List;

@Default
public class GeometrieMemDao { // implements GeometrieDao {
    private List<Carre> carres = new LinkedList<>();

//    @Override
    public List<Carre> readAll(){
        return carres;
    }

//    @Override
    public Carre read(long id) {
        return carres.stream()
                .filter(carre -> carre.getId() == id)
                .findFirst()
                .orElse(null);
    }

//    @Override
    public Carre create(Carre carre) {
        long id = carres.stream()
                .mapToLong(Carre::getId)
                .max()
                .orElse(0L)
                + 1;
        carre.setId(id);
        carres.add(carre);
        return carre;
    }

}
