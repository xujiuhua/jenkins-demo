package com.example.jenkinsdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("first")
    public ResponseEntity first() {
        return ResponseEntity.ok("Hello Jenkins...");
    }

}
