package com.rishabh.springbootprojects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EntryRestController {

    @GetMapping("/getSomething")
    @WithRateLimitProtection
    ResponseEntity<String> getRateLimit(){
        return ResponseEntity.ok().build();
    }

}
