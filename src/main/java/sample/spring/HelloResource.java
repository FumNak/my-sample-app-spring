package sample.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.domain.Person;

@RestController
@RequestMapping("/api")
public class HelloResource {

    private Person person;

    @Value("${config.val}")
    private String configValue;

    @GetMapping("/hello")
    public String hello() {
        person = new Person();
        person.setName("MyName");
        person.setAge(38);

        return "Hello! name:" + person.getName() + "age:" + person.getAge();
    }
}
