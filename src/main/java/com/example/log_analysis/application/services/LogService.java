package com.example.log_analysis.application.services;

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

    public List<Log> getLogsByFilter(String level, String date, String source) {
        // Implementar consulta com filtros
        return logRepository.findByFilters(level, date, source);
    }
}