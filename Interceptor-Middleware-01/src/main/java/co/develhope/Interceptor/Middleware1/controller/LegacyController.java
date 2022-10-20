package co.develhope.Interceptor.Middleware1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {

    @GetMapping("")
    public void print(){
        System.out.println("this is just old code");
    }
}
