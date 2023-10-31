package practice.springcloud.eurekaclient1;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class UserController {

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserDto> getUserByUserId(@PathVariable(name="userId") int userId) {
        UserDto result = new UserDto(userId, "userA", "userA@gmail.com");

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}