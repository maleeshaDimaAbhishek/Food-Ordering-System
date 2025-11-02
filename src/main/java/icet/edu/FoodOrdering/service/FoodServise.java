package icet.edu.FoodOrdering.service;

import icet.edu.FoodOrdering.model.Foods;

import java.sql.SQLException;
import java.util.List;

public interface FoodServise {
    List<Foods> getAvailabeFoods() throws SQLException;
}
