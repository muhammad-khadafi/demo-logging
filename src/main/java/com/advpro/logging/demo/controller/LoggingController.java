package com.advpro.logging.demo.controller;

/**
 * @author muhammad.khadafi
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@RestController
public class LoggingController {

    private static final Logger logger = LogManager.getLogger(LoggingController.class);

    @GetMapping("/log")
    public String index() {
        logger.info("Pesan log INFO");
        logger.error("Pesan log ERROR");
        logger.warn("Pesan log WARNING");
        logger.debug("Pesan log DEBUG");
        logger.trace("Pesan log TRACE");

        return "Lihat log untuk detailnya!";
    }
}

