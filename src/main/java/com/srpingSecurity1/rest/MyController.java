package com.srpingSecurity1.rest;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/security1")
public class MyController {

    @GetMapping("/greet")
    public ResponseEntity<String> greet(@RequestParam String name){
        String message="Hello "+name+" , Very Good Morning !";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(){
        String message="Welcome, To Spring Basic Security !";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PostMapping("/invite")
    public ResponseEntity<String> invite(){
        String message=" Hey "+"name"+ " , You are invited to participate!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @PostMapping("/request")
    public ResponseEntity<String> request(){
        String message="Hello "+"name"+", your request of "+"request"+" has been Successfully accepted";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
