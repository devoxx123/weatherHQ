package org.owm.weather.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidCityNameException extends RuntimeException {
	public InvalidCityNameException() {
        super("Invalid city name.");
    }
	

}
