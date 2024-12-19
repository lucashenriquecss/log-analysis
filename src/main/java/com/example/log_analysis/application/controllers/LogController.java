package com.example.log_analysis.application.controllers;

import com.example.log_analysis.application.dto.LogRequest;
import com.example.log_analysis.domain.entities.Log;
import com.example.log_analysis.application.services.LogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class LogController {
    private final LogService logService;

    public LogController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping
    public ResponseEntity<List<Log>> getLogs(
            @RequestParam(required = false) String level,
            @RequestParam(required = false) String source,
            @RequestParam(required = false) String startDate,
            @RequestParam(required = false) String endDate) {
        return ResponseEntity.ok(logService.getLogs(level, source, startDate, endDate));
    }

    @PostMapping
    public ResponseEntity<Log> createLog(@RequestBody LogRequest logRequest) {
        return ResponseEntity.ok(logService.createLog(logRequest));
    }
}
