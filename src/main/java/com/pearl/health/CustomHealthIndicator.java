package com.pearl.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class CustomHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return null;
    }
}
