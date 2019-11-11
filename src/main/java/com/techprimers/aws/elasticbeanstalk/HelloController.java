package com.techprimers.aws.elasticbeanstalk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloController {

@GetMapping
public String hello(){
    return "Hello from AWS CI CD!!!!";
}
}


