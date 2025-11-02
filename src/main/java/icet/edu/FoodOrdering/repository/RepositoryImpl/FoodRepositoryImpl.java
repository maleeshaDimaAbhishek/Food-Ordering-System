package icet.edu.FoodOrdering.repository.RepositoryImpl;


import icet.edu.FoodOrdering.db.DBConnection;
import icet.edu.FoodOrdering.repository.FoodRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FoodRepositoryImpl implements FoodRepository {
    Connection connection;
    {
        connection = DBConnection.getInstance().getConnection();
    }
    @Override
    public ResultSet getAvailableFoods() throws SQLException {
        return connection.prepareStatement("SELECT * FROM food_details WHERE amount > 0;").executeQuery();
    }
}
