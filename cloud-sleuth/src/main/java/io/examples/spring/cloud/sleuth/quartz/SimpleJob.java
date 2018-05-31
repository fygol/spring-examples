package io.examples.spring.cloud.sleuth.quartz;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.stereotype.Component;

@Component
@DisallowConcurrentExecution
@Slf4j
public class SimpleJob implements Job {
    @NewSpan("job")
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("Execute job {}", SimpleJob.class.getSimpleName());
    }
}
