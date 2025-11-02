package icet.edu.FoodOrdering.service;

import icet.edu.FoodOrdering.model.Customer;

import java.sql.SQLException;

public interface CustomerService {
    boolean registerCustomer(Customer customer) throws SQLException;
}
