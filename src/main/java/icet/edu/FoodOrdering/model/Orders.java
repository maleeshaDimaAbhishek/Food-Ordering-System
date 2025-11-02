package icet.edu.FoodOrdering.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orders {
    private int id;
    private int custId;
    private double total;

}
