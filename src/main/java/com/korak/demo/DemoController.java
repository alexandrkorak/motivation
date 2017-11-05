package com.korak.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by osarapul on 05.11.2017.
 */
@RestController
public class DemoController {

    @RequestMapping("/api/test")
    public String test() {
        return "Test";
    }
}
