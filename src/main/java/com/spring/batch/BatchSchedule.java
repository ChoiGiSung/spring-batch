package com.spring.batch;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BatchSchedule {

    private final BatchService batchService;

    @Scheduled(cron = "*/10 * * * * *")
    public void schedule(){
        batchService.run();
    }
}
