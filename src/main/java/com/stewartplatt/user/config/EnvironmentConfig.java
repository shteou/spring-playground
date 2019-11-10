package com.stewartplatt.user.config;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class EnvironmentConfig {
    private String databaseUrl;

    public EnvironmentConfig() {
        System.out.println("Creating databaseUrl");
        this.databaseUrl = System.getenv("DATABASE_URL");
        System.out.println(this.databaseUrl);
    }
}