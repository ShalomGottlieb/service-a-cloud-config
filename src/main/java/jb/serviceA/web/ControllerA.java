package jb.serviceA.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerA {

@HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("service/a")
    private String handleA() {
    RestTemplate client=new RestTemplate();
    String url="http://localhost:51200/service/b";  //---need to fill up by yourself after running server-b
    return "Service A calling service B: "+ client.getForObject(url,String.class);

    }
    public String fallback(Throwable th) {
        return "Service A: Fallback Message - Service B is not available";
    }
}
