package jb.serviceA;

import jb.serviceA.utils.Art;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class ServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
		System.out.println(Art.HEADER);

//		RestTemplate client=new RestTemplate();
//		String url="http://localhost:56425/service/b";
//		System.out.println(client.getForObject(url,String.class));
	}


}
