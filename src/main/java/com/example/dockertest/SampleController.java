package com.example.dockertest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @Value("${sample.value}")
    private String sample;

    @GetMapping
    private String getSample() {
        return sample;
    }
}
