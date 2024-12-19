package com.example.log_analysis.application.controllers;

import com.example.log_analysis.application.services.LogService;
import com.example.log_analysis.domain.entities.Log;
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
    public List<Log> getLogs(@RequestParam(required = false) String level,
                             @RequestParam(required = false) String date,
                             @RequestParam(required = false) String source) {
        return logService.getLogsByFilter(level, date, source);
    }
}