package com.example.log_analysis.domain.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "logs")

@Entity
@Table(name = "orders")
public class Log {

    @Id
    private String id;
    private String level;
    private String message;
    private String source;
    private String timestamp;

    // Getters and Setters
}
