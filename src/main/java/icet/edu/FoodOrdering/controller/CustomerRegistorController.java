package icet.edu.FoodOrdering.controller;

import icet.edu.FoodOrdering.service.CustomerRegisterService;
import icet.edu.FoodOrdering.service.CustomerRegisterServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class CustomerRegistorController {
    CustomerRegisterService customerRegisterService=new CustomerRegisterServiceImpl();
    @PostMapping("/register")
    public String registerCustomer(){
        return
    }
}
