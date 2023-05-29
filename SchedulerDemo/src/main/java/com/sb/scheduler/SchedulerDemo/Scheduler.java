package com.sb.scheduler.SchedulerDemo;

import java.time.LocalDateTime;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

public class Scheduler {
	org.slf4j.Logger logger = LoggerFactory.getLogger(SchedulerDemoApplication.class);


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
	public void job4() {
		logger.info("job4 current time" + LocalDateTime.now());
	}
	@Scheduled(cron = "*/2 * * * * *")
	public void job5() {
		logger.info("job5 current time" + LocalDateTime.now());
	}
}
