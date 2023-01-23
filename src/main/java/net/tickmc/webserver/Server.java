package net.tickmc.webserver;

import net.tickmc.helpers.Base64Helper;
import net.tickmc.webserver.controllers.controllers.HelloWorldFactoryImplementation;
import net.tickmc.webserver.controllers.controllers.StringFactory;
import net.tickmc.webserver.models.IHelloWorldFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        IHelloWorldFactory factory = HelloWorldFactoryImplementation.getInstance();
        return Base64Helper.encode(StringFactory.getInstance().createString(factory.createHelloWorld().generateChars()));
    }
}
