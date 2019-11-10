package com.stewartplatt.user.config;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class EnvironmentConfig {
    private String databaseUrl;

    public EnvironmentConfig() {
        this.databaseUrl = System.getenv("DATABASE_URL");
    }
}