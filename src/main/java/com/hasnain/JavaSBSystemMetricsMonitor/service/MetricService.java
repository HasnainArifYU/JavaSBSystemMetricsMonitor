package com.hasnain.JavaSBSystemMetricsMonitor.service;


import com.hasnain.JavaSBSystemMetricsMonitor.model.CpuMetric;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class MetricService {

    private double cpuUsage = 0.0;

    private LocalDateTime lastUpdated = LocalDateTime.now();

    // Runs every 5 seconds and simulates an updated CPU usage value
    @Scheduled(fixedRate = 5000)
    public void updateCpuUsage() {
        this.cpuUsage = ThreadLocalRandom.current().nextDouble(20.0, 95.0);
        this.lastUpdated = LocalDateTime.now();
        System.out.println("Updated CPU usage: " + cpuUsage + "%");
    }

    // Returns the most recent CPU usage as a full CpuMetric object
    public CpuMetric getCurrentCpuUsage() {
        return new CpuMetric(cpuUsage, lastUpdated);
    }
}

