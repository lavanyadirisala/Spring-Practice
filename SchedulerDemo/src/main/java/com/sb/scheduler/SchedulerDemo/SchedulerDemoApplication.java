package com.sb.scheduler.SchedulerDemo;

import java.sql.Date;
import java.time.LocalDateTime;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class SchedulerDemoApplication {

	org.slf4j.Logger logger = LoggerFactory.getLogger(SchedulerDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SchedulerDemoApplication.class, args);
	}
	
	//without async we can use 
	public TaskScheduler taskScheduler() {
		ThreadPoolTaskScheduler threadpooltaskSchedular = new ThreadPoolTaskScheduler();
		threadpooltaskSchedular.setPoolSize(5);
		threadpooltaskSchedular.setThreadNamePrefix("ThreadPoolTaskScheduler");
		return threadpooltaskSchedular;
	}

	// Fixedrate time btw method execution (priority is fixedrate time does not
	// consider Thread sleep)
	@Scheduled(fixedRate = 5000)
	public void job1() {
		logger.info("job current time " + LocalDateTime.now());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// fixeddelay time btw method execution + thread.sleep
	@Scheduled(fixedDelay = 4000, initialDelay = 1000)
	public void job2() {
		logger.info("job2 current time" + LocalDateTime.now());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	// PT - period of Time
	// S sec - M min - H Hours
	@Async
	@Scheduled(fixedDelayString = "PT2S")
	public void job3() {
		logger.info("job3 current time" + LocalDateTime.now());
	}

	// Cron - expression - 6 paremeters (- - - - - - )
	// */2 seconds
	
	@Scheduled(cron = "*/2 * * * * *")
	//@Scheduled(cron = "${cron.expression.value}")
	public void job4() {
		logger.info("job4 current time" + LocalDateTime.now());
	}
	@Scheduled(cron = "*/2 * * * * *")
	public void job5() {
		logger.info("job5 current time" + LocalDateTime.now());
	}
}
