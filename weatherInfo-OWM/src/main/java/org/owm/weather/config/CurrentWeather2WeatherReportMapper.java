package org.owm.weather.config;

import org.owm.weather.domain.WeatherInfo;
import org.springframework.stereotype.Component;
import net.aksingh.owmjapis.model.CurrentWeather;
import java.util.Optional;
@Component
public class CurrentWeather2WeatherReportMapper {
	public Optional<WeatherInfo> map(CurrentWeather cwd) {
		WeatherInfo weatherInfo = new WeatherInfo();
		weatherInfo.setCityId(cwd.getCityId());
		weatherInfo.setCityName(cwd.getCityName());
		weatherInfo.setWeatherDesc(cwd.getWeatherList().get(0).getDescription());
		weatherInfo.setWeatherIconName(cwd.getWeatherList().get(0).getMainInfo());
		weatherInfo.setWeatherName(cwd.getWeatherList().get(0).getMoreInfo());
		weatherInfo.setWeatherCode(cwd.getWeatherList().get(0).getIconCode());
		weatherInfo.setWeatherIconLink(cwd.getWeatherList().get(0).getIconLink());	
		weatherInfo.setTempInFahrenheit(Double.valueOf(cwd.getMainData().getTemp()));
		weatherInfo.setDateToday(cwd.getDateTime());
		weatherInfo.setTimeAtSunrise(cwd.getSystemData().getSunriseDateTime());
		weatherInfo.setTimeAtSunset(cwd.getSystemData().getSunsetDateTime());
		weatherInfo.setCountryCode(cwd.getSystemData().getCountryCode());
		weatherInfo.setWeatherMessage(cwd.getSystemData().getMessage());
		weatherInfo.setType(cwd.getSystemData().getType());
		weatherInfo.setSysId(cwd.getSystemData().getId());
		weatherInfo.setCloudsAll(cwd.getCloudData().getCloud());
		weatherInfo.setPercentageOfClouds(cwd.getCloudData().hasCloud());
		weatherInfo.setWindDegree(cwd.getWindData().getDegree());
		weatherInfo.setWindSpeed(cwd.getWindData().getSpeed());
		weatherInfo.setWindGuest(cwd.getWindData().getGust());
		weatherInfo.setLatitude(cwd.getCoordData().getLatitude());
		weatherInfo.setLongitude(cwd.getCoordData().getLongitude());
		weatherInfo.setHumidity(cwd.getMainData().getHumidity());
		weatherInfo.setMaxTemp(cwd.getMainData().getTempMax());
		weatherInfo.setMinTemp(cwd.getMainData().getTempMin());
		weatherInfo.setPressure(cwd.getMainData().getPressure());
		weatherInfo.setBase(cwd.getBaseStation());
		return Optional.of(weatherInfo);
	}

}
