package practice.springcloud.APIGateway;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class LBControllerWebClient {
    private final WebClient.Builder loadBalancedWebClientBuilder;
    private final ReactorLoadBalancerExchangeFilterFunction lbFunction;

//    @RequestMapping("/user-service/{userId}")
//    public Mono<String> getUserbyUserId(@PathVariable(name = "userId") int userId) {
//        return loadBalancedWebClientBuilder.build().get().uri("lb://USER")
//                .retrieve().bodyToMono(String.class)
//                .map(greeting -> String.format("%s, %d!", greeting, userId));
//    }

    @RequestMapping("/user-service/{userId}")
    public Mono<String> hello(@PathVariable(name = "userId") int userId) {
        return WebClient.builder()
                .filter(lbFunction)
                .build().get().uri("lb://USER/user/1")
                .retrieve().bodyToMono(String.class)
                .map(UserDto -> String.format("%s, %d!", UserDto, userId));
    }
//
//    @RequestMapping("/user/{userId}")
//    public Mono<String> hello(@RequestParam(value = "name", defaultValue = "John") String name) {
//        return WebClient.builder()
//                .filter(lbFunction)
//                .build().get().uri("lb://USER")
//                .retrieve().bodyToMono(String.class)
//                .map(greeting -> String.format("%s, %s!", greeting, name));
//    }

}