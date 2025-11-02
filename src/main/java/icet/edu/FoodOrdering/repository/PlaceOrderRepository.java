package icet.edu.FoodOrdering.repository;

import icet.edu.FoodOrdering.model.PlaceOrderRequest;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface PlaceOrderRepository {
    ResultSet getUnitPriceByid(int foodId) throws SQLException;
    boolean placeOrder(double total, PlaceOrderRequest placeOrderRequest) throws SQLException;

    boolean addOrderDetails(PlaceOrderRequest placeOrderRequest, int quantity, int foodId, double price) throws SQLException;
}
