package fr.eni.formation.geometrie.data;

import fr.eni.formation.geometrie.business.Carre;
import fr.eni.formation.geometrie.data.entity.CarreEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class GeometrieJpaDao implements GeometrieDao {

    @PersistenceContext(unitName="localhost-mysql-geometrie")
    EntityManager em;

//    @Override
    public List<Carre> readAll() {
        return em.createQuery("from CarreEntity", CarreEntity.class)
                .getResultStream()
                .map(entity -> entity.toModel())
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

//    @Override
    public Carre read(long id) {
        return em.find(CarreEntity.class, id).toModel();
    }

//    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Carre create(Carre carre) {

        em.persist(CarreEntity.encode(carre));

        return carre;
    }
}
