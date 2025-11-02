package icet.edu.FoodOrdering.service.ServiceImpl;

import icet.edu.FoodOrdering.model.Foods;
import icet.edu.FoodOrdering.repository.FoodRepository;
import icet.edu.FoodOrdering.repository.RepositoryImpl.FoodRepositoryImpl;
import icet.edu.FoodOrdering.service.FoodServise;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodServiseImpl implements FoodServise {
    FoodRepository foodRepository=new FoodRepositoryImpl();
    @Override
    public List<Foods> getAvailabeFoods() throws SQLException {
        List<Foods> foodsList=new ArrayList<>();
        ResultSet resultSet=foodRepository.getAvailableFoods();
        while (resultSet.next()){
            foodsList.add(new Foods(
                    resultSet.getInt("food_id"),
                    resultSet.getString("food_name"),
                    resultSet.getString("description"),
                    resultSet.getDouble("price"),
                    resultSet.getString("category"),
                    resultSet.getInt("amount")
            ));
        }
        return foodsList;
    }
}
