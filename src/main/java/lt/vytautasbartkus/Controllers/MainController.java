package lt.vytautasbartkus.Controllers;


import lt.vytautasbartkus.DAO.CostumerDAO;
import lt.vytautasbartkus.DAO.ServiceTimeDAO;
import lt.vytautasbartkus.DAO.SpecialistDAO;
import lt.vytautasbartkus.Entities.Costumer;
import lt.vytautasbartkus.Entities.ServiceTime;
import lt.vytautasbartkus.Entities.Specialist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MainController {
    @Autowired
    private CostumerDAO costumerDAO;
    @Autowired
    private SpecialistDAO specialistDAO;
    @Autowired
    private ServiceTimeDAO serviceTimeDAO;

    @GetMapping(value = "/")
    public String home(){

        return "home.jsp";
    }
}
