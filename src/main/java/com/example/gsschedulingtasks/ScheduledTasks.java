package com.example.gsschedulingtasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    @Scheduled(fixedRate = 5000)
//    @Scheduled(cron = "0/45 * * * * *") // w 0 i 45 sekundzie
//    @Scheduled(cron = "0 0 8 * * *") // o 8:00 kazdego dnia
    @Scheduled(cron = "*/15 * * * * *") // w kazdej sekundzie podzielnej przez 15
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
