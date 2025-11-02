package icet.edu.FoodOrdering.repository;

import com.mysql.cj.protocol.Resultset;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface FoodRepository {
    ResultSet getAvailableFoods() throws SQLException;
}
