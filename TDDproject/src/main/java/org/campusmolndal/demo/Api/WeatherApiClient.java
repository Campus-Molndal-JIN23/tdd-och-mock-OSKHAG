package org.campusmolndal.demo.Api;

import org.campusmolndal.demo.Api.DataTypes.WeatherData;

public interface WeatherApiClient {
    WeatherData getWeatherData(String location);
}
