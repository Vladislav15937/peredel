package web.controller;

import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarControllerInter;
import web.servise.CarService;
import web.servise.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController implements CarControllerInter {
    @Override
    public String getCar(Model model, @RequestParam(value = "count", required = false) Integer id) {
        CarServiceImpl carDAO = new CarServiceImpl();
        if (id == null) {
            int bb = -1;
            model.addAttribute("spisokmashin", carDAO.getCarCount(bb));
        } else {
            int gg = id;
            model.addAttribute("car", carDAO.getCarCount(gg));
        }
        return "/cars";
    }

}
