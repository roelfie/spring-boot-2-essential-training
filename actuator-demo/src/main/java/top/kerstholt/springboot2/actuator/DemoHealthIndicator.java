package top.kerstholt.springboot2.actuator;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * This is a custom health indicator (exposed by actuator/health).
 *
 * We hard-coded it to return a DOWN state,
 * to illustrate what bad health looks like in the health endpoint.
 */
@Component
public class DemoHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.down().withDetail("reason", "testing").build();
    }
}
