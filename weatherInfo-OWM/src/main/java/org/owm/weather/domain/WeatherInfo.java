package org.owm.weather.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

import org.owm.weather.config.CustomDateSerializer;
import org.owm.weather.config.CustomTimeSerializer;

public class WeatherInfo {

	private Integer cityId;
	private String cityName;
	private String weatherDesc;
	private Double tempInFahrenheit;
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date dateToday;
	@JsonSerialize(using = CustomTimeSerializer.class)
	private Date timeAtSunrise;
	@JsonSerialize(using = CustomTimeSerializer.class)
	private Date timeAtSunset;
	private String weatherIconName;
	private Double cloudsAll;
	private Double latitude;
	private Double longitude;
	private String weatherName;
	private Double humidity;
	private Double maxTemp;
	private Double minTemp;
	private String countryCode;
	private Double pressure;
	private boolean rain;
	private String weatherCode;
	private String weatherIconLink;
	private String base;
	private boolean percentageOfClouds;
	private Double windDegree;
	private Double windSpeed;
	private Double windGuest;
	private Double weatherMessage;
	private int type;
	private int sysId;
	
	public WeatherInfo() {}

	public WeatherInfo(Integer cityId, String cityName, String weatherDesc, Double tempInFahrenheit, Date dateToday,
			Date timeAtSunrise, Date timeAtSunset, String weatherIconName, Double cloudsAll, Double latitude,
			Double longitude, String weatherName, Double humidity, Double maxTemp, Double minTemp, String countryCode,
			Double pressure, boolean rain, String weatherCode, String weatherIconLink, String base,
			boolean percentageOfClouds, Double windDegree, Double windSpeed, Double windGuest, Double weatherMessage,
			int type, int sysId, Long cityPopulation) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.weatherDesc = weatherDesc;
		this.tempInFahrenheit = tempInFahrenheit;
		this.dateToday = dateToday;
		this.timeAtSunrise = timeAtSunrise;
		this.timeAtSunset = timeAtSunset;
		this.weatherIconName = weatherIconName;
		this.cloudsAll = cloudsAll;
		this.latitude = latitude;
		this.longitude = longitude;
		this.weatherName = weatherName;
		this.humidity = humidity;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.countryCode = countryCode;
		this.pressure = pressure;
		this.rain = rain;
		this.weatherCode = weatherCode;
		this.weatherIconLink = weatherIconLink;
		this.base = base;
		this.percentageOfClouds = percentageOfClouds;
		this.windDegree = windDegree;
		this.windSpeed = windSpeed;
		this.windGuest = windGuest;
		this.weatherMessage = weatherMessage;
		this.type = type;
		this.sysId = sysId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getWeatherDesc() {
		return weatherDesc;
	}

	public void setWeatherDesc(String weatherDesc) {
		this.weatherDesc = weatherDesc;
	}

	public Double getTempInFahrenheit() {
		return tempInFahrenheit;
	}

	public void setTempInFahrenheit(Double tempInFahrenheit) {
		this.tempInFahrenheit = tempInFahrenheit;
	}

	public Date getDateToday() {
		return dateToday;
	}

	public void setDateToday(Date dateToday) {
		this.dateToday = dateToday;
	}

	public Date getTimeAtSunrise() {
		return timeAtSunrise;
	}

	public void setTimeAtSunrise(Date timeAtSunrise) {
		this.timeAtSunrise = timeAtSunrise;
	}

	public Date getTimeAtSunset() {
		return timeAtSunset;
	}

	public void setTimeAtSunset(Date timeAtSunset) {
		this.timeAtSunset = timeAtSunset;
	}

	public String getWeatherIconName() {
		return weatherIconName;
	}

	public void setWeatherIconName(String weatherIconName) {
		this.weatherIconName = weatherIconName;
	}

	public Double getCloudsAll() {
		return cloudsAll;
	}

	public void setCloudsAll(Double cloudsAll) {
		this.cloudsAll = cloudsAll;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getWeatherName() {
		return weatherName;
	}

	public void setWeatherName(String weatherName) {
		this.weatherName = weatherName;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	public Double getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(Double maxTemp) {
		this.maxTemp = maxTemp;
	}

	public Double getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(Double minTemp) {
		this.minTemp = minTemp;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Double getPressure() {
		return pressure;
	}

	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}

	public boolean isRain() {
		return rain;
	}

	public void setRain(boolean rain) {
		this.rain = rain;
	}

	public String getWeatherCode() {
		return weatherCode;
	}

	public void setWeatherCode(String weatherCode) {
		this.weatherCode = weatherCode;
	}

	public String getWeatherIconLink() {
		return weatherIconLink;
	}

	public void setWeatherIconLink(String weatherIconLink) {
		this.weatherIconLink = weatherIconLink;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public boolean isPercentageOfClouds() {
		return percentageOfClouds;
	}

	public void setPercentageOfClouds(boolean percentageOfClouds) {
		this.percentageOfClouds = percentageOfClouds;
	}

	public Double getWindDegree() {
		return windDegree;
	}

	public void setWindDegree(Double windDegree) {
		this.windDegree = windDegree;
	}

	public Double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Double getWindGuest() {
		return windGuest;
	}

	public void setWindGuest(Double windGuest) {
		this.windGuest = windGuest;
	}

	public Double getWeatherMessage() {
		return weatherMessage;
	}

	public void setWeatherMessage(Double weatherMessage) {
		this.weatherMessage = weatherMessage;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getSysId() {
		return sysId;
	}

	public void setSysId(int sysId) {
		this.sysId = sysId;
	}

	@Override
	public String toString() {
		return "{ cityId:\"" + cityId + "\", cityName:\"" + cityName + "\", weatherDesc:\"" + weatherDesc
				+ "\", tempInFahrenheit:\"" + tempInFahrenheit + "\", dateToday:\"" + dateToday + "\", timeAtSunrise:\""
				+ timeAtSunrise + "\", timeAtSunset:\"" + timeAtSunset + "\", weatherIconName:\"" + weatherIconName
				+ "\", cloudsAll:\"" + cloudsAll + "\", latitude:\"" + latitude + "\", longitude:\"" + longitude
				+ "\", weatherName:\"" + weatherName + "\", humidity:\"" + humidity + "\", maxTemp:\"" + maxTemp
				+ "\", minTemp:\"" + minTemp + "\", countryCode:\"" + countryCode + "\", pressure:\"" + pressure
				+ "\", rain:\"" + rain + "\", weatherCode:\"" + weatherCode + "\", weatherIconLink:\"" + weatherIconLink
				+ "\", base:\"" + base + "\", percentageOfClouds:\"" + percentageOfClouds + "\", windDegree:\""
				+ windDegree + "\", windSpeed:\"" + windSpeed + "\", windGuest:\"" + windGuest + "\", weatherMessage:\""
				+ weatherMessage + "\", type:\"" + type + "\", sysId:\"" + sysId + "}";
	}

	
}
