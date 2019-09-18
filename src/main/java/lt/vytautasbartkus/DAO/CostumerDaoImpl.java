package lt.vytautasbartkus.DAO;

import lt.vytautasbartkus.Entities.Costumer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CostumerDaoImpl implements CostumerDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public List<Costumer> getCostumerList() {
        return sessionFactory.getCurrentSession().createQuery("from Costumer").list();
    }
    @Transactional
    @Override
    public Costumer getCostumerById(Integer id) {
        return sessionFactory.getCurrentSession().get(Costumer.class, id);
    }
    @Transactional
    @Override
    public void saveCostumer(Costumer costumer) {
        sessionFactory.getCurrentSession().saveOrUpdate(costumer);
    }
    @Transactional
    @Override
    public void deleteCostumerById(Integer id) {
        sessionFactory.getCurrentSession().delete(this.getCostumerById(id));
    }
}
