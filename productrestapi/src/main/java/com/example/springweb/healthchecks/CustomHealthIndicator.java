package com.example.springweb.healthchecks;

import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {
	
	@Override
	public Health health()
	{
		boolean error = true;
		if(error)
			return Health.down().withDetail("Error Key", 123).build();
		
		return Health.up().build();
	}

}
