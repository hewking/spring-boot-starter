package com.hewking.resetservice.controller;

import com.hewking.resetservice.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName GreetController.java
 * @Description TODO
 * @createTime 2020年02月26日 20:32:00
 */
@RestController
public class GreetController {

    private final AtomicLong id = new AtomicLong();
    private static final String template = "Hello %1s";

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "hello") String name){
        return new Greeting(id.incrementAndGet(),String.format(template,name));
    }

}
