package fr.eni.formation.geometrie.business;

import java.util.List;

public interface Service {

    Carre creerCarre(double x, double y, double cote);

    Carre creerCarre(Carre carre);

    void deplacerCarre(Carre carre, double dx, double dy);

    List<Carre> listeCarres();

    Carre rechercheCarre(long id);
}
