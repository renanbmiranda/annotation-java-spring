package com.example.annotation.controller;

import com.example.annotation.log.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    @Log
    public ResponseEntity<Void> hello() {
        System.out.println("Meio da execução");
        return ResponseEntity.ok().build();
    }
}
