package lt.vytautasbartkus.DAO;

import lt.vytautasbartkus.Entities.ServiceTime;

import java.util.List;

public interface ServiceTimeDAO {
    List<ServiceTime> getServiceTimeList();
    ServiceTime getServiceTimeById (Integer id);
    void saveServiceTime(ServiceTime serviceTime);
    void deleteServiceTimeById(Integer id);
}
