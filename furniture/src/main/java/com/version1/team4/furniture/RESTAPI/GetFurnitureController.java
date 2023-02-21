package com.version1.team4.furniture.RESTAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GetFurnitureController {

    private static final String template = "%s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/api/getfurniture")
    public GetFurniture greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new GetFurniture(counter.incrementAndGet(), String.format(template, name));
    }

}