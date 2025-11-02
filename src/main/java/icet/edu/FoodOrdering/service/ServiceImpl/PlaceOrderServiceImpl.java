package icet.edu.FoodOrdering.service.ServiceImpl;

import icet.edu.FoodOrdering.model.OrderItem;
import icet.edu.FoodOrdering.model.PlaceOrderRequest;
import icet.edu.FoodOrdering.repository.FoodRepository;
import icet.edu.FoodOrdering.repository.RepositoryImpl.FoodRepositoryImpl;
import icet.edu.FoodOrdering.repository.PlaceOrderRepository;
import icet.edu.FoodOrdering.repository.RepositoryImpl.PlaceOrderRepositoryImpl;
import icet.edu.FoodOrdering.service.PlaceOrderService;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlaceOrderServiceImpl implements PlaceOrderService {
    PlaceOrderRepository placeOrderRepository=new PlaceOrderRepositoryImpl();
    FoodRepository foodRepository=new FoodRepositoryImpl();
    double total=0.0;
    @Override
    public boolean placeOrder(PlaceOrderRequest placeOrderRequest) throws SQLException {
        double price=0.0;
        for(OrderItem orderItem1:placeOrderRequest.getItems()){
            ResultSet resultSet=placeOrderRepository.getUnitPriceByid(orderItem1.getFoodId());
            while (resultSet.next()){
                price=resultSet.getInt("price");
            }
            total=orderItem1.getQuantity()*price;
        }
        boolean b=placeOrderRepository.placeOrder(total,placeOrderRequest);
        for(OrderItem orderItem1:placeOrderRequest.getItems()){

            boolean c=placeOrderRepository.addOrderDetails(placeOrderRequest,orderItem1.getQuantity(),orderItem1.getFoodId(),total);

        }

        return b;
    }
}
