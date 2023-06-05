package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface CarControllerInter {
    @GetMapping(value = "/cars")
    public String getCar (Model model, @RequestParam(value = "count", required = false) Integer id);
}
