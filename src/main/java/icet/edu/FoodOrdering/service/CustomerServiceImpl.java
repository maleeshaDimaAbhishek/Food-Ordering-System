package icet.edu.FoodOrdering.service;

import icet.edu.FoodOrdering.model.Customer;
import icet.edu.FoodOrdering.repository.CustomerRepository;
import icet.edu.FoodOrdering.repository.CustomerRepositoryImpl;

import java.sql.SQLException;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository=new CustomerRepositoryImpl();
    @Override
    public boolean registerCustomer(Customer customer) throws SQLException {
        return customerRepository.registerCustomer(customer);
    }
}
