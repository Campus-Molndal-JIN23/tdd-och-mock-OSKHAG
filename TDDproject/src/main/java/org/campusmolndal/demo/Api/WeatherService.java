package org.campusmolndal.demo.Api;

public class WeatherService {
    private WeatherApiClient weatherApiClient;

    public WeatherService(WeatherApiClient weatherApiClient){
        this.weatherApiClient = weatherApiClient;
    }
    public void showWeather(String city){
        System.out.println(weatherApiClient.getWeatherData(city));
    }
}
