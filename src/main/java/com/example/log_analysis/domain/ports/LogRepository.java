package com.example.log_analysis.domain.ports;
import com.example.log_analysis.domain.entities.Log;

import java.util.List;
public interface LogRepository {
    List<Log> findLogs(String level, String source, String startDate, String endDate);
    Log save(Log log);
}