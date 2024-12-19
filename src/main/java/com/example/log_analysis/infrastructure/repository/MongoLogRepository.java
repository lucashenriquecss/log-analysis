package com.example.log_analysis.infrastructure.repository;

import com.example.log_analysis.domain.entities.Log;
import com.example.log_analysis.domain.ports.LogRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MongoLogRepository implements LogRepository {
    @Override
    public List<Log> findLogs(String level, String source, String startDate, String endDate) {
        return List.of(); 
    }

    @Override
    public Log save(Log log) {
        return log; 
    }
}
