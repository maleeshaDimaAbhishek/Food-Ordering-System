package icet.edu.FoodOrdering.repository.RepositoryImpl;

import icet.edu.FoodOrdering.db.DBConnection;
import icet.edu.FoodOrdering.model.PlaceOrderRequest;
import icet.edu.FoodOrdering.repository.PlaceOrderRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlaceOrderRepositoryImpl implements PlaceOrderRepository {
    Connection connection;
    {
        connection = DBConnection.getInstance().getConnection();
    }
    @Override
    public ResultSet getUnitPriceByid(int foodId) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT price FROM food_details WHERE food_id = ?");
        preparedStatement.setInt(1, foodId);
        return preparedStatement.executeQuery();

    }

    @Override
    public boolean placeOrder(double total, PlaceOrderRequest placeOrderRequest) throws SQLException {
        PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO orders (customer_id,total_price) VALUES (?, ?);");
        preparedStatement.setObject(1,placeOrderRequest.getCustomerId());
        preparedStatement.setObject(2,total);
        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean addOrderDetails(PlaceOrderRequest placeOrderRequest, int quantity, int foodId, double total) throws SQLException {
        PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO order_details (customer_id, food_id, quantity, total_price) VALUES (?, ?, ?, ?);");
        preparedStatement.setObject(1,placeOrderRequest.getCustomerId());
        preparedStatement.setObject(2,foodId);
        preparedStatement.setObject(3,quantity);
        preparedStatement.setObject(4,foodId);

        PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE food_details SET amount = amount - ? WHERE food_id = ? ;");
        preparedStatement.setObject(1,quantity);
        preparedStatement.setObject(2,foodId);
        return preparedStatement.executeUpdate()>0;
    }
}
