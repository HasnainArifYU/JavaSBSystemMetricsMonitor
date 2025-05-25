package com.hasnain.JavaSBSystemMetricsMonitor.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service  // 💡 Marks this class as a Spring "service" — meaning it's business logic, and Spring will auto-manage it as a bean
public class MetricService {

    private double cpuUsage;  // 🔢 Simulated CPU usage (will get updated every few seconds)

    public MetricService() {
        this.cpuUsage = 0.0;  // 🔧 Set initial value to 0 (clean startup)
    }

    @Scheduled(fixedRate = 5000)  // ⏱️ This method runs every 5000 milliseconds (5 seconds) — like heartbeat updates
    public void updateCpuUsage() {
        // 🔁 Randomly generate a CPU usage value between 20% and 95%
        this.cpuUsage = ThreadLocalRandom.current().nextDouble(20.0, 95.0);

        // 📟 Log it to terminal so we can visually confirm updates (optional in real prod apps)
        System.out.println("Updated CPU usage: " + cpuUsage + "%");
    }

    // 💡 Expose the latest CPU usage value — our controller will call this
    public double getCpuUsage() {
        return cpuUsage;
    }
}
