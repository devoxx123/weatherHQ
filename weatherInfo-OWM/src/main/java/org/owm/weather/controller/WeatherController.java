package org.owm.weather.controller;

import net.aksingh.owmjapis.api.APIException;

import java.io.IOException;

import org.json.JSONException;
import org.owm.weather.domain.WeatherInfo;
import org.owm.weather.exception.OpenWeatherMapServiceException;
import org.owm.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private WeatherService IWeatherService;

    @Autowired
    public WeatherController(WeatherService IWeatherService) {
        this.IWeatherService = IWeatherService;
    }
    @ApiOperation(value = "SEARCH BY ANY CITY NAME")
    @RequestMapping(value = { "/current/{cityName}" }, method = RequestMethod.GET)
    public WeatherInfo getCurrentWeatherForCityName(@PathVariable(value="cityName") String cityName) throws OpenWeatherMapServiceException, JSONException, IOException, APIException{
		return IWeatherService.getCurrentWeatherForCityName(cityName).orElseThrow(()-> new OpenWeatherMapServiceException("Weather data unavailable"));
    	
    }
}
