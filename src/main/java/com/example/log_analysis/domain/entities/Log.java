package com.example.log_analysis.domain.entities;

import java.time.LocalDateTime;

public class Log {
    private String id;
    private String level;
    private String source;
    private String message;
    private LocalDateTime timestamp;

    public Log(String level, String source, String message) {
        this.level = level;
        this.source = source;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

}
