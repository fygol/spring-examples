package io.examples.spring.cloud.sleuth.service;

import brave.Span;
import brave.Tracer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class DefaultTimeService implements TimeService {
    private static final Logger log = LoggerFactory.getLogger(DefaultTimeService.class);
    private Tracer tracer;

    public DefaultTimeService(Tracer tracer) {
        this.tracer = tracer;
    }

    @Transactional(readOnly = true)
    @Override
    public String getLocalTime() {
        log.info("Get local time");

//        Span span = tracer.newTrace().name("new_span").start();
        Span span = tracer.nextSpan();
        try (Tracer.SpanInScope spanInScope = tracer.withSpanInScope(span.start())) {
            log.info("inside span");
            return LocalDateTime.now().toString();
        } finally {
            span.finish();
        }
    }
}
