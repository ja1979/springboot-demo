package ec.sevolutivo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.applet.*;


@SpringBootApplication
@RestController
public class DemoApplication {

    @Value("${application.serviceUrl}")
    private String serviceUrl;

    public DemoApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/api")
    public String home() {
        return "Calling service: " + this.serviceUrl;
    }

}
