//package practice.springcloud.eurekaclient2;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class DelayController {
//
//    @GetMapping("/delay/{sec}")
//    public String delay(@PathVariable(name = "second") String second) throws InterruptedException {
//        Thread.sleep(Integer.parseInt(second) * 1000);
//        return "Done!";
//    }
//}