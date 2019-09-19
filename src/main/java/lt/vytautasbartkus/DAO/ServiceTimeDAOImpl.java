package lt.vytautasbartkus.DAO;

import lt.vytautasbartkus.Entities.ServiceTime;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class ServiceTimeDAOImpl implements ServiceTimeDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public List<ServiceTime> getServiceTimeList() {
        return sessionFactory.getCurrentSession().createQuery("from ServiceTime").list();
    }
    @Transactional
    @Override
    public List<ServiceTime> getServiceTimeList(int limit) {
        return sessionFactory.getCurrentSession().createQuery("from ServiceTime").setMaxResults(limit).list();
    }

    @Transactional
    @Override
    public ServiceTime getServiceTimeById(Integer id) {
        return sessionFactory.getCurrentSession().get(ServiceTime.class, id);
    }
    @Transactional
    @Override
    public void saveServiceTime(ServiceTime serviceTime) {
        sessionFactory.getCurrentSession().saveOrUpdate(serviceTime);
    }
    @Transactional
    @Override
    public void deleteServiceTimeById(Integer id) {
        sessionFactory.getCurrentSession().delete(this.getServiceTimeById(id));
    }
}
