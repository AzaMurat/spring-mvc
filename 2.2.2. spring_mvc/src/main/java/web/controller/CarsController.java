package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceCarImpl;

@Controller
@RequestMapping("/cars")
public class CarsController {

    public final ServiceCarImpl serviceCar;
    @Autowired
    public CarsController(ServiceCarImpl serviceCar) {
        this.serviceCar = serviceCar;
    }
    @GetMapping
    public String getCar(Model model){
        model.addAttribute("cars1",serviceCar.getAllCar());
        return "getAllCar";
    } @GetMapping("/")
    public String getAllNum(@RequestParam("count")int count, Model model){
        model.addAttribute("cars2",serviceCar.getByNum(count));
        return "getByNumCar";
    }
}