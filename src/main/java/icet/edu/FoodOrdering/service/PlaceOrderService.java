package icet.edu.FoodOrdering.service;

import icet.edu.FoodOrdering.model.PlaceOrderRequest;

import java.sql.SQLException;

public interface PlaceOrderService {
    boolean placeOrder(PlaceOrderRequest placeOrderRequest) throws SQLException;
}
