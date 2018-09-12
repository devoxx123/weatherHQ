package org.owm.weather.service;

import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.model.CurrentWeather;

import org.json.JSONException;
import org.owm.weather.config.CurrentWeather2WeatherReportMapper;
import org.owm.weather.domain.WeatherInfo;
import org.owm.weather.exception.InvalidCityNameException;
import org.owm.weather.utils.ValidationUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Optional;

@Service
public class WeatherService {

	private OWM owm;

	private CurrentWeather2WeatherReportMapper mapper;

	private ValidationUtils validationUtils;

	public WeatherService(String openWeatherMapApiKey, CurrentWeather2WeatherReportMapper mapper,
			ValidationUtils validationUtils) {
		this.owm = new OWM(openWeatherMapApiKey);
		this.mapper = mapper;
		this.validationUtils = validationUtils;
	}
	public Optional<WeatherInfo> getCurrentWeatherForCityName(String cityName) throws JSONException, IOException, APIException {
		if (!validationUtils.isValidCityName(cityName)) {
			throw new InvalidCityNameException();
		}
		CurrentWeather cwm = owm.currentWeatherByCityName(String.valueOf(cityName));
		return (validationUtils.isValidWeatherResponses(cwm)) ? mapper.map(cwm) : Optional.empty();
	}

}