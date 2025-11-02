package icet.edu.FoodOrdering.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    private String full_name;
    private String email;
    private String phone_number;
    private String address;
    private String password;
}
