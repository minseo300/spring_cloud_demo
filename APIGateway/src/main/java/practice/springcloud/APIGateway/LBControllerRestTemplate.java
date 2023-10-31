package practice.springcloud.APIGateway;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import practice.springcloud.APIGateway.dto.OrderDto;
import practice.springcloud.APIGateway.dto.UserDto;
import reactor.core.publisher.Mono;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class LBControllerRestTemplate {
    private final RestTemplate restTemplate;

    private final ReactorLoadBalancerExchangeFilterFunction lbFunction;

//    @GetMapping("/user-service/{userId}")
//    public String getUserbyUserId(@PathVariable(name = "userId") int userId) {
//        log.info("userId {}", userId);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.set("KEY", "VALUE");
//
//        HttpEntity<String> entity = new HttpEntity<String>("", headers);
//
//        String url = String.format("lb://USER/user/%d", 1);
//        log.info("here2");
//        ResponseEntity<OrderDto> ret = restTemplate.exchange(url, HttpMethod.GET, entity, OrderDto.class);
////        ResponseEntity ret = null;
//        return "hello";
//    }


//    @RequestMapping("/user-service")
//    public ResponseEntity<UserDto> getOrderByOrderId(@PathVariable("userId") int userId) {
//        return RestTemplate.builder()
//                .filter(lbFunction)
//                .build().get().uri("lb://USER")
//                .retrieve().bodyToMono(String.class)
//                .map(greeting -> String.format("%s, %s!", greeting, name));
//
//        String url = String.format("lb://USER/%d", userId);
//        ResponseEntity<List<UserDto>> response = restTemplate.exchange(url, HttpMethod.GET, null,
//                new ParameterizedTypeReference<List<UserDto>>() {
//                });
//        List<UserDto> orders = response.getBody();
//    }
}