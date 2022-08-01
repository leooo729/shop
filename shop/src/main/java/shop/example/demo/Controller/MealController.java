package shop.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import shop.example.demo.Model.Meal;
import shop.example.demo.Service.MealService;

@Controller

@RequestMapping(value="/meal")
public class MealController {

    @Autowired
    MealService mealService;

    @GetMapping()
    public String getMealByName(@RequestParam String name, Model model){
        Meal meal=this.mealService.getMealByName(name);
        model.addAttribute("meal",meal);
        return "meal";
    }


}
