package crash.course.thymleaf.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello world!");
        return "helloworld";
    }

    @GetMapping("/demo")
    public String demo() {
        return "add-css-js-demo";
    }

    @GetMapping("/bootstrap")
    public String bootstrap() {
        return "add-bootstrap";
    }

    @GetMapping("/iteration")
    public String iter(Model model) {
        Employee john = new Employee("John", "Martin", "John@email.com");
        Employee mark = new Employee("Mark", "Heli", "Mark@email.com");
        Employee sam = new Employee("Sam", "Sung", "Sam@email.com");
        List<Employee> employees = new ArrayList<>(Arrays.asList(john, mark, sam));
        model.addAttribute("employees", employees);
        return "iteration";
    }

    @GetMapping("/if-unless")
    public String if_unless(Model model) {
        User john = new User("John", "John@email.com", "ADMIN");
        User mark = new User("Mark", "Mark@email.com", "USER");
        List<User> users = new ArrayList<>(Arrays.asList(john, mark));
        model.addAttribute("users", users);
        return "if-unless";
    }

    @GetMapping("/switch")
    public String switch_case(Model model) {
        User admin =  new User("John", "John@email.com", "ADMIN");
        User mark = new User("Mark", "Mark@email.com", "USER");
        User crown = new User("Bill", "Bill@email.com", "CROWN");
        User unknown = new User("Bill", "Bill@email.com", "UNKNOWN");
//        model.addAttribute("user", admin);
//         model.addAttribute("user", mark);
//        model.addAttribute("user", crown);
        model.addAttribute("user", unknown);
        return "switch-case";

    }
}
