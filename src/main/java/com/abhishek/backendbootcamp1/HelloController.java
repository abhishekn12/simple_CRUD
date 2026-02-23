package com.abhishek.backendbootcamp1;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Abhishek, Backend Journey Begins!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/user")
    public User getUser() {
        return new User("Abhishek", 26);
    }


}
