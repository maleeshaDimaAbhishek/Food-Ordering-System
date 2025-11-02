package icet.edu.FoodOrdering.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDeails {
    private String id;
    private String orderId;
    private String foodId;
    private int quantity;
    private double price;
}
