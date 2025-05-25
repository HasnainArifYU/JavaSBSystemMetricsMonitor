package com.hasnain.JavaSBSystemMetricsMonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class JavaSbSystemMetricsMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSbSystemMetricsMonitorApplication.class, args);
	}

}
