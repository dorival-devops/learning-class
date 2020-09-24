package com.silva.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class LearningController {

    @GetMapping()
    public String hello() throws UnknownHostException {
        return "Hello Lerning from: " + InetAddress.getLocalHost().getHostAddress();
    }

    @GetMapping("/hello/{nome}")
    public String hello(@PathVariable(name = "nome")String nome) throws UnknownHostException {
        return "Hello " + nome  +" from "+ InetAddress.getLocalHost().getHostAddress() + " Canary";
    }
}
