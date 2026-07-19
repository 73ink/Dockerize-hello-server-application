package Hello.World;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return "Hello World from Spring Boot on Linux VM";
    }

    @GetMapping("/test")
    public String test() {
        return "Spring Boot JAR is running successfully";
    }
}