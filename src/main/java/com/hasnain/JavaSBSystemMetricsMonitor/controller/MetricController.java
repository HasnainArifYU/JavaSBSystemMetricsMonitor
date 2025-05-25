package com.hasnain.JavaSBSystemMetricsMonitor.controller;
import com.hasnain.JavaSBSystemMetricsMonitor.model.CpuMetric;
import com.hasnain.JavaSBSystemMetricsMonitor.service.MetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/metrics")
public class MetricController {

    private final MetricService metricService;

    @Autowired
    public MetricController(MetricService metricService) {
        this.metricService = metricService;
    }






}
