package icet.edu.FoodOrdering.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlaceOrderRequest {
        private Integer customerId;
        private List<OrderItem> items;
}
