package ApiTest;

import org.campusmolndal.demo.Api.DataTypes.WeatherData;
import org.campusmolndal.demo.Api.MockApiClient;
import org.campusmolndal.demo.Api.WeatherApiClient;
import org.campusmolndal.demo.Api.WeatherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.campusmolndal.demo.Api.DataTypes.*;

import static org.junit.jupiter.api.Assertions.*;

public class MockApiTest {

    private WeatherApiClient mockApiClient;
    private WeatherData expectedWeatherData;
    private WeatherData actualWeatherData;

    @BeforeEach
    public void setUp() {
        //skapa instans för mock objekt
        mockApiClient = new MockApiClient();

        //skapa instans förväntad test data
        Coordinate coordinate = new Coordinate(11.97, 57.71);
        Weather weather = new Weather(804, "Clouds", "overcast clouds", "04d");
        MainData mainData = new MainData(20.59, 20.13, 18.89, 21.74, 1013, 67);
        Wind wind = new Wind(5.14, 210, 7.2);
        Clouds clouds = new Clouds(90);
        Sys sys = new Sys(1, 1752, "SE", 1599457990, 1599510755);
        expectedWeatherData = new WeatherData(coordinate,
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

        actualWeatherData = mockApiClient.getWeatherData("Gothenburg");
    }

    @Test
    public void getWeatherDataTypeTest() {
        assertNotNull(actualWeatherData);
    }

    @Test
    public void getCoordinatesLatitudeTest() {
        assertEquals(expectedWeatherData.getCoord().getLat(), actualWeatherData.getCoord().getLat());
    }

    @Test
    public void getCoordinatesLongitudeTest() {
        assertEquals(expectedWeatherData.getCoord().getLon(), actualWeatherData.getCoord().getLon());
    }

    @Test
    public void getWeatherIdTest() {
        assertEquals(expectedWeatherData.getWeather().getId(), actualWeatherData.getWeather().getId());
    }

    @Test
    public void getWeatherMainTest() {
        assertEquals(expectedWeatherData.getWeather().getMain(), actualWeatherData.getWeather().getMain());
    }

    @Test
    public void getWeatherDescriptionTest() {
        assertEquals(expectedWeatherData.getWeather().getDescription(), actualWeatherData.getWeather().getDescription());
    }

    @Test
    public void getWeatherIconTest() {
        assertEquals(expectedWeatherData.getWeather().getIcon(), actualWeatherData.getWeather().getIcon());
    }

    @Test
    public void getBaseTest() {
        assertEquals(expectedWeatherData.getBase(), actualWeatherData.getBase());
    }

    @Test
    public void getMainDataTempTest() {
        assertEquals(expectedWeatherData.getMain().getTemp(), actualWeatherData.getMain().getTemp());
    }

    @Test
    public void getMainDataMaxTempTest() {
        assertEquals(expectedWeatherData.getMain().getTemp_max(), actualWeatherData.getMain().getTemp_max());
    }

    @Test
    public void getMainDataMinTempTest() {
        assertEquals(expectedWeatherData.getMain().getTemp_min(), actualWeatherData.getMain().getTemp_min());
    }

    @Test
    public void getFeelsLikeTempTest() {
        assertEquals(expectedWeatherData.getMain().getFeels_like(), actualWeatherData.getMain().getFeels_like());
    }

    @Test
    public void getPressureTest() {
        assertEquals(expectedWeatherData.getMain().getPressure(), actualWeatherData.getMain().getPressure());
    }

    @Test
    public void getHumidityTest() {
        assertEquals(expectedWeatherData.getMain().getHumidity(), actualWeatherData.getMain().getHumidity());
    }

    @Test
    public void getVisibilityTest() {
        assertEquals(expectedWeatherData.getVisibility(), actualWeatherData.getVisibility());
    }

    @Test
    public void getWindSpeedTest() {
        assertEquals(expectedWeatherData.getWind().getSpeed(), actualWeatherData.getWind().getSpeed());
    }

    @Test
    public void getWindDegTest() {
        assertEquals(expectedWeatherData.getWind().getDeg(), actualWeatherData.getWind().getDeg());
    }

    @Test
    public void getWindGustTest() {
        assertEquals(expectedWeatherData.getWind().getGust(), actualWeatherData.getWind().getGust());
    }

    @Test
    public void getCloudsAllTest() {
        assertEquals(expectedWeatherData.getClouds().getAll(), actualWeatherData.getClouds().getAll());
    }

    @Test
    public void getDtTest() {
        assertEquals(expectedWeatherData.getDt(), actualWeatherData.getDt());
    }

    @Test
    public void getSysTypeTest() {
        assertEquals(expectedWeatherData.getSys().getType(), actualWeatherData.getSys().getType());
    }

    @Test
    public void getSysIdTest() {
        assertEquals(expectedWeatherData.getSys().getId(), actualWeatherData.getSys().getId());
    }

    @Test
    public void getSysCountryTest() {
        assertEquals(expectedWeatherData.getSys().getCountry(), actualWeatherData.getSys().getCountry());
    }

    @Test
    public void getSysSunriseTest() {
        assertEquals(expectedWeatherData.getSys().getSunrise(), actualWeatherData.getSys().getSunrise());
    }

    @Test
    public void getSysSunsetTest() {
        assertEquals(expectedWeatherData.getSys().getSunset(), actualWeatherData.getSys().getSunset());
    }

    @Test
    public void getTimezoneTest() {
        assertEquals(expectedWeatherData.getTimezone(), actualWeatherData.getTimezone());
    }

    @Test
    public void getIdTest() {
        assertEquals(expectedWeatherData.getId(), actualWeatherData.getId());
    }

    @Test
    public void getNameTest() {
        assertEquals(expectedWeatherData.getName(), actualWeatherData.getName());
    }

    @Test
    public void getCodTest() {
        assertEquals(expectedWeatherData.getCod(), actualWeatherData.getCod());
    }
}
