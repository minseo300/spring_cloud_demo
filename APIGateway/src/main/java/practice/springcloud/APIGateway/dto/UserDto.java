package practice.springcloud.APIGateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDto {
    private int userId;
    private String userName;
    private String userEmail;
}