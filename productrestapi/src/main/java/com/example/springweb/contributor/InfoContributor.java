package com.example.springweb.contributor;

import org.springframework.boot.actuate.info.Info.Builder;

public class InfoContributor implements org.springframework.boot.actuate.info.InfoContributor {

	@Override
	public void contribute(Builder builder) {
		// TODO Auto-generated method stub
		builder.withDetail("appName", "Product Rest api");
		builder.withDetail("version", "0.0.6");
		builder.withDetail("activeUsers", getActiveUserCount());
	}

	private int getActiveUserCount()
	{
		return 6;
	}
}
