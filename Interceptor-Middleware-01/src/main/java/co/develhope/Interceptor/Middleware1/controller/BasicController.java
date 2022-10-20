package co.develhope.Interceptor.Middleware1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping("")
    public LocalDate printTime(){
        LocalDate localDate = LocalDate.now();
        return localDate;
    }
}
