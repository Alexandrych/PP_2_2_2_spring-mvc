package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", 2010, "Россия"));
        cars.add(new Car("ЗИЛ", 1980, "СССР"));
        cars.add(new Car("Citroen", 2004, "Франция"));
        cars.add(new Car("Ford", 2019, "США"));
        cars.add(new Car("Honda", 1989, "Япония"));

        model.addAttribute("cars", CarService.count(cars, count));
        return "cars";
    }
}
