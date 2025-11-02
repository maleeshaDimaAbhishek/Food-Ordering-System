package icet.edu.FoodOrdering.controller;

import icet.edu.FoodOrdering.model.Foods;
import icet.edu.FoodOrdering.service.FoodServise;
import icet.edu.FoodOrdering.service.FoodServiseImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@RequestMapping("/food")
@RestController
public class FoodController {
    FoodServise foodServise=new FoodServiseImpl();
    @GetMapping("/availableFood")
    public List<Foods> getAvailableFood(){
        try {
            return foodServise.getAvailabeFoods();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
