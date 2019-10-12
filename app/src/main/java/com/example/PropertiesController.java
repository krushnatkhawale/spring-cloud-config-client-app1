package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesController.class);

    @Value("${application-public-name:defautAppName}")
    private String applicationPublicName;
    @Value("${server.port:-1}")
    private String port;
    @GetMapping
    public void showProperties() {
        LOGGER.info("This is config client app1, below are properties fetched from config server");
        LOGGER.info("application-public-name: {}, server.port: {}", applicationPublicName, port);
    }
}
