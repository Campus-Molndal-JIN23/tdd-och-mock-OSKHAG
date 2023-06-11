package org.campusmolndal.demo.Api.DataTypes;

public class WeatherData {

    private Coordinate coord;
    private Weather weather;
    private String base;
    private MainData main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private long dt;
    private Sys sys;
    private int timezone;
    private long id;
    private String name;
    private int cod;

    public WeatherData(Coordinate coord,
                       Weather weather,
                       String base,
                       MainData main,
                       int visibility,
                       Wind wind,
                       Clouds clouds,
                       long dt,
                       Sys sys,
                       int timezone,
                       long id,
                       String name,
                       int cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public Coordinate getCoord() {
        return coord;
    }

    public Weather getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public MainData getMain() {
        return main;
    }

    public int getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public long getDt() {
        return dt;
    }

    public Sys getSys() {
        return sys;
    }

    public int getTimezone() {
        return timezone;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCod() {
        return cod;
    }
}
