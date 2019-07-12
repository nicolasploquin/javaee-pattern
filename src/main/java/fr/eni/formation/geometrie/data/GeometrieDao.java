package fr.eni.formation.geometrie.data;

import fr.eni.formation.geometrie.business.Carre;

import java.util.LinkedList;
import java.util.List;

public interface GeometrieDao {

    List<Carre> readAll();
    Carre read(long id);
    Carre create(Carre carre);

}
