package com.example.carslisting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {

    @Autowired
    CategoryRepository categoryRepository;
    // why do we have two repositories, but only autowire the owner?

    @RequestMapping("/")
    public String index(Model model){
        // I will need to change this from handcode to user input
        // How do I put this in the hands of the user?

        // Category
        Category category = new Category();

        category.setName("Old Cars");

        // Car
        Car car = new Car();
        car.setManufacturer("Mazda");
        car.setModel("Mazda2");
        car.setYear("2013");
        car.setMsrp("$5,000");

        // add the car to an empty list
        Set<Car> cars = new HashSet<Car>();
        cars.add(car);

        // another car. I will need to make a form with inputs that lets
        // the user set these.
        // I'll look at the TodoList; that should let me see how to add with HTML

        car = new Car();
        car.setManufacturer("BMW");
        car.setModel("Vintage");
        car.setYear("1985");
        car.setMsrp("$500");
        cars.add(car);

        // add the list of cars to the category's car list
        category.setCars(cars);

        // Save the category to the database
        categoryRepository.save(category);

        // Grab all the categories from the database and send them to the template
        model.addAttribute("categories", categoryRepository.findAll());
        return "index";
    }
}
