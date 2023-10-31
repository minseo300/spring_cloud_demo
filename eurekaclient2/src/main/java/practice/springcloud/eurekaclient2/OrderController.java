package practice.springcloud.eurekaclient2;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {
    @GetMapping("/order/{orderId}")
    public ResponseEntity<OrderDto> getUserByUserId(@PathVariable(name="orderId") int orderId) {
        OrderDto result = new OrderDto(orderId, 11, "order1 - item1", "aaa address");

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}