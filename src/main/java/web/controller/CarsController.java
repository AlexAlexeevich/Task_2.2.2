package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.Car;
import web.service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class CarsController {

    @Autowired
    private CarServiceImp carService;

    @GetMapping("/cars")
    //@RequestMapping(value = "cars", method = RequestMethod.GET)
    public String printCars(ModelMap model, HttpServletRequest request) {

        List carList = carService.getCars();
        model.addAttribute("carsFromList", carList);
        return "cars";
    }
}
