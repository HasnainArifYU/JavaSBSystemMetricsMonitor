package com.hasnain.JavaSBSystemMetricsMonitor.model;

import java.time.LocalDateTime;

public class CpuMetric {

    private double usage;

    private LocalDateTime timestamp;

    private CpuMetric(double usage, LocalDateTime timestamp) {
        this.usage = usage;
        this.timestamp = timestamp;
    }

    public double getUsage() {
        return usage;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setUsage(double usage) {
        this.usage = usage;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
