package com.example.log_analysis.domain.ports;
import com.example.log_analysis.domain.entities.Log;

import java.util.List;
public interface LogRepository {
    void saveLog(Log log);

    List<Log> findByFilters(String level, String date, String source);
}