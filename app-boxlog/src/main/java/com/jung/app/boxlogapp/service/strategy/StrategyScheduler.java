package com.jung.app.boxlogapp.service.strategy;

import com.jung.client.api.ApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class StrategyScheduler {
    private final Job job;
    private final JobLauncher jobLauncher;
    private final ApiClient apiClient;

//    1일마다 실행
    @Scheduled(fixedDelay = 86400 * 1000L)
//    @Scheduled(fixedDelay = 60 * 1000L)
    public void executeJob(){
        try {
            jobLauncher.run(
                    job,
                    new JobParametersBuilder()
                            .addString("datetime", LocalDateTime.now().toString())
                            .toJobParameters()  // job parameter 설정
            );
        } catch (JobExecutionException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }


}
