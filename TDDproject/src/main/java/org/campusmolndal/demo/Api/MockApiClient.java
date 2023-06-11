package org.campusmolndal.demo.Api;

import org.campusmolndal.demo.Api.DataTypes.*;

public class MockApiClient implements WeatherApiClient {

    @Override
    public WeatherData getWeatherData(String city) {
        Coordinate coordinate = new Coordinate(11.97, 57.71);
        Weather weather = new Weather(804, "Clouds", "overcast clouds", "04d");
        MainData mainData = new MainData(20.59, 20.13, 18.89, 21.74, 1013, 67);
        Wind wind = new Wind(5.14, 210, 7.2);
        Clouds clouds = new Clouds(90);
        Sys sys = new Sys(1, 1752, "SE", 1599457990, 1599510755);

        WeatherData weatherData = new WeatherData(coordinate,
                weather,
                "Stations",
                mainData,
                10000,
                wind,
                clouds,
                1599478913,
                sys,
                7200,
                2711537,
                "Gothenburg",
                200);

        return weatherData;
    }
}
