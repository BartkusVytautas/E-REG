package lt.vytautasbartkus.DAO;

import lt.vytautasbartkus.Entities.Costumer;

import java.util.List;

public interface CostumerDAO {
    List<Costumer> getCostumerList();
    List<Costumer> getCostumerList(int limit);
    Costumer getCostumerById (Integer id);
    void saveCostumer(Costumer costumer);
    void deleteCostumerById(Integer id);
}
