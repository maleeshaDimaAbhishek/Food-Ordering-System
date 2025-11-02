package icet.edu.FoodOrdering.controller;

import icet.edu.FoodOrdering.model.PlaceOrderRequest;
import icet.edu.FoodOrdering.service.PlaceOrderService;
import icet.edu.FoodOrdering.service.ServiceImpl.PlaceOrderServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;


@RequestMapping("/placeOrder")
@RestController
public class PlaceOrderController {
    @PostMapping
    public void placeOrder(@RequestBody PlaceOrderRequest placeOrderRequest){
        PlaceOrderService placeOrderService=new PlaceOrderServiceImpl();
        try {
            boolean result=placeOrderService.placeOrder(placeOrderRequest);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
