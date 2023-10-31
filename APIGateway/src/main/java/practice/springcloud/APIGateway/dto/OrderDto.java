package practice.springcloud.APIGateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OrderDto {
    private int orderId;
    private int itemId;
    private String itemName;
    private String address;
}