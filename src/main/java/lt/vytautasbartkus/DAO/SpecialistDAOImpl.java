package lt.vytautasbartkus.DAO;

import lt.vytautasbartkus.Entities.Specialist;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class SpecialistDAOImpl implements SpecialistDAO{

    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    @Override
    public List<Specialist> getSpecialistList() {
        return sessionFactory.getCurrentSession().createQuery("from Specialist").list();
    }
    @Transactional
    @Override
    public Specialist getSpecialistById(Integer id) {
        return sessionFactory.getCurrentSession().get(Specialist.class, id);
    }
    @Transactional
    @Override
    public void saveSpecialist(Specialist specialist) {
        sessionFactory.getCurrentSession().saveOrUpdate(specialist);
    }
    @Transactional
    @Override
    public void deleteSpecialistById(Integer id) {
        sessionFactory.getCurrentSession().delete(this.getSpecialistById(id));
    }
}
