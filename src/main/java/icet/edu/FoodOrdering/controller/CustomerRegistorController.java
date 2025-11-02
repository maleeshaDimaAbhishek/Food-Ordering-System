package icet.edu.FoodOrdering.controller;

import icet.edu.FoodOrdering.model.Customer;
import icet.edu.FoodOrdering.service.CustomerService;
import icet.edu.FoodOrdering.service.CustomerServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RequestMapping("/customer")
@RestController
public class CustomerRegistorController {
    CustomerService customerRegisterService=new CustomerServiceImpl();
    @PostMapping("/register")
    public String registerCustomer(@RequestBody Customer customer){
        try {
            if(customer.getAddress()!=null &&
               customer.getEmail()!=null &&
               customer.getFull_name()!=null &&
               customer.getPhone_number()!=null &&
               customer.getPassword()!=null
            ){
                boolean result= customerRegisterService.registerCustomer(customer);
                if(result){
                    return "Registration Successfull...";
                }

            }else {
                return "Some Customer Information are missing...";
            }
            return "Registration Failed...";

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
