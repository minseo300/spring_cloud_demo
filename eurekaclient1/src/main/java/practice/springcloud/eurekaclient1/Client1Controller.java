package practice.springcloud.eurekaclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Client1Controller {

    @Value("${springcloudconfig}")
    private String springcloudconfig;

    @RequestMapping("/client1")
    public String printHelloWorld() {
        return "Hello MSA World! : 1st Client " + springcloudconfig;
    }
}