package sample.camel;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.AbstractApplicationContext;


@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("applicationContext-camel.xml")   //used to link external Spring-DSL camel route
public class SampleAmqApplication {

    public static void main(String[] args) {
    	
        SpringApplication.run(SampleAmqApplication.class, args);
       
    }
}