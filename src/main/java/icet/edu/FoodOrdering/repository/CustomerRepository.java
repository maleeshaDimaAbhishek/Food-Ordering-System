package icet.edu.FoodOrdering.repository;

import icet.edu.FoodOrdering.model.Customer;

import java.sql.SQLException;

public interface CustomerRepository {
    boolean registerCustomer(Customer customer) throws SQLException;
}
