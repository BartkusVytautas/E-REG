package lt.vytautasbartkus.DAO;

import lt.vytautasbartkus.Entities.Specialist;

import java.util.List;

public interface SpecialistDAO {
    List<Specialist> getSpecialistList();
    Specialist getSpecialistById (Integer id);
    void saveSpecialist(Specialist specialist);
    void deleteSpecialistById(Integer id);
}
