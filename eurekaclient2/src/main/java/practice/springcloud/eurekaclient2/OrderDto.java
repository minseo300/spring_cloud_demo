package practice.springcloud.eurekaclient2;

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