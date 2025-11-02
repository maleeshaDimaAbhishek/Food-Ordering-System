package icet.edu.FoodOrdering.repository.RepositoryImpl;

import icet.edu.FoodOrdering.db.DBConnection;
import icet.edu.FoodOrdering.model.Customer;
import icet.edu.FoodOrdering.repository.CustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerRepositoryImpl implements CustomerRepository {
    Connection connection;

    {
        connection = DBConnection.getInstance().getConnection();
    }
    @Override
    public boolean registerCustomer(Customer customer) throws SQLException {
        String sql = "INSERT INTO customer_details (full_name, email, phone_number, address, password) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO customer_details (full_name, email, phone_number, address, password) VALUES (?, ?, ?, ?, ?);");
        preparedStatement.setObject(1,customer.getFull_name());
        preparedStatement.setObject(2,customer.getEmail());
        preparedStatement.setObject(3,customer.getPhone_number());
        preparedStatement.setObject(4,customer.getAddress());
        preparedStatement.setObject(5,customer.getPassword());
        return preparedStatement.executeUpdate()>0;
    }
}
