package com.trly.gradlebuild.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GradleController {
    @GetMapping("/hello/{name}")
    
    public Mono<String> sayHello(@PathVariable String name) {
        return Mono.just("Hello " + name);
    }
}