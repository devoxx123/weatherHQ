package org.owm.weather.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class WeatherConfig {

	@Autowired
	private Environment env;

	@Bean(name = "openWeatherMapApiKey")
	public String openWeatherMapApiKey() {
		return env.getProperty("open.weather.map.api.key");
	}
}
