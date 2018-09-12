Introduction
WeatherHQ - This application will return current weather data from OpenWeatherMap.org, based on a city name chosen by the user.

Source of Data
Weather data is read from http://openweathermap.org/ using API http://api.openweathermap.org/data/2.5/weather?q={cityName}&appid={apiKey}

Pre-requisite
To use this app, you need to register an API Key on http://openweathermap.org/ service. Update API url and key in src/main/resources/application.properties

How to run
This app has embedded tomcat server. In order to run this website execute below maven command mvn spring-boot:run

It will start the embedded tomcat server on default port 8080

How to Use
Access the website using http://localhost:8080/weather/current/{cityName}
Enter the City Name
Hit Submit button
It will display Weather information...

Technologies used
RESTful,
Spring Boot,
Swagger UI--Documentation REST API's,
Maven,
Embedded Tomcat Server..
