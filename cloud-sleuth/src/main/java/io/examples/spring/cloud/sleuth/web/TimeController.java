package io.examples.spring.cloud.sleuth.web;

import io.examples.spring.cloud.sleuth.service.TimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    private static final Logger log = LoggerFactory.getLogger(TimeController.class.getName());

    private TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String getTime() {
        log.info("Handle time request");
        return timeService.getLocalTime();
    }
}
