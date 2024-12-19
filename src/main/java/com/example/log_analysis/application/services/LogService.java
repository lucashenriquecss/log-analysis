package com.example.log_analysis.application.services;

import com.example.log_analysis.application.dto.LogRequest;
import com.example.log_analysis.domain.entities.Log;
import com.example.log_analysis.domain.ports.LogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
    private final LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public List<Log> getLogs(String level, String source, String startDate, String endDate) {
        return logRepository.findLogs(level, source, startDate, endDate);
    }

    public Log createLog(LogRequest logRequest) {
        Log log = new Log(logRequest.getLevel(), logRequest.getSource(), logRequest.getMessage());
        return logRepository.save(log);
    }
}