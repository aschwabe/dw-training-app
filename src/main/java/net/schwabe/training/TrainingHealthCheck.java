package net.schwabe.training;

import com.codahale.metrics.health.HealthCheck;
import com.codahale.metrics.health.HealthCheck.Result;

public class TrainingHealthCheck extends HealthCheck {

	private final String template;
	
	public TrainingHealthCheck(String template) {
        this.template = template;
    }
	
	@Override
    protected Result check() throws Exception {
        final String greeting = String.format(template, "TEST");
        if (!greeting.contains("TEST")) {
            return Result.unhealthy("template doesn't include a name");
        }
        return Result.healthy();
    }

}
