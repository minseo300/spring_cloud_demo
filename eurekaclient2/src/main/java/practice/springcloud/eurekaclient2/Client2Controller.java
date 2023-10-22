package practice.springcloud.eurekaclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Client2Controller {
    @Value("${springcloudconfig}")
    private String springcloudconfig;

    @RequestMapping("/client2")
    public String printHelloWorld() {
        return "Hello MSA World! : 2nd Client " + springcloudconfig;
    }
}