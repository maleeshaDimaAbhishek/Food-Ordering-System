package icet.edu.FoodOrdering.controller;

import icet.edu.FoodOrdering.model.Foods;
import icet.edu.FoodOrdering.service.FoodServise;
import icet.edu.FoodOrdering.service.ServiceImpl.FoodServiseImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

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
