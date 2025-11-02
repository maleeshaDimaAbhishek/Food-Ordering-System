package icet.edu.FoodOrdering.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Foods {
    private int id;
    private String name;
    private String description;
    private double price;
    private String category;
    private int amount;
}
