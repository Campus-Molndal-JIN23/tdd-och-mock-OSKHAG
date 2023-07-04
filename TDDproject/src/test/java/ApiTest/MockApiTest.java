package ApiTest;

import org.campusmolndal.demo.Api.DataTypes.*;
import org.campusmolndal.demo.Api.WeatherApiClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class MockApiTest {

    private WeatherData expectedWeatherData;
    private WeatherData actualWeatherData;

    @BeforeEach
    public void setUp() {
        // Setup weatherData mock
        WeatherData mockWeatherData = mock(WeatherData.class, CALLS_REAL_METHODS);

        // Setup testdata
        Coordinate coordinate = new Coordinate(11.97, 57.71);
        Weather weather = new Weather(804, "Clouds", "overcast clouds", "04d");
        MainData mainData = new MainData(20.59, 20.13, 18.89, 21.74, 1013, 67);
        Wind wind = new Wind(5.14, 210, 7.2);
        Clouds clouds = new Clouds(90);
        Sys sys = new Sys(1, 1752, "SE", 1599457990, 1599510755);
        expectedWeatherData = new WeatherData(coordinate, weather, "Stations", mainData, 10000, wind, clouds, 1599478913, sys, 7200, 2711537, "Gothenburg", 200);

        // definiera beteende
        when(mockWeatherData.getCoord()).thenReturn(coordinate);
        when(mockWeatherData.getWeather()).thenReturn(weather);
        when(mockWeatherData.getBase()).thenReturn("Stations");
        when(mockWeatherData.getMain()).thenReturn(mainData);
        when(mockWeatherData.getVisibility()).thenReturn(10000);
        when(mockWeatherData.getWind()).thenReturn(wind);
        when(mockWeatherData.getClouds()).thenReturn(clouds);
        when(mockWeatherData.getDt()).thenReturn(1599478913L);
        when(mockWeatherData.getSys()).thenReturn(sys);
        when(mockWeatherData.getTimezone()).thenReturn(7200);
        when(mockWeatherData.getId()).thenReturn(2711537L);
        when(mockWeatherData.getName()).thenReturn("Gothenburg");
        when(mockWeatherData.getCod()).thenReturn(200);

        WeatherApiClient mockApiClient = mock(WeatherApiClient.class);

        when(mockApiClient.getWeatherData("Gothenburg")).thenReturn(mockWeatherData);
        actualWeatherData = mockApiClient.getWeatherData("Gothenburg");
    }

    @Test
    public void getCoordinatesLatitudeTest() {
        assertNotNull(actualWeatherData.getCoord());
        assertEquals(expectedWeatherData.getCoord().getLat(), actualWeatherData.getCoord().getLat());
        verify(actualWeatherData, times(2)).getCoord();
    }

    @Test
    public void getCoordinatesLongitudeTest() {
        assertEquals(expectedWeatherData.getCoord().getLon(), actualWeatherData.getCoord().getLon());
        verify(actualWeatherData).getCoord();
    }

    @Test
    public void getWeatherIdTest() {
        assertEquals(expectedWeatherData.getWeather().getId(), actualWeatherData.getWeather().getId());
        verify(actualWeatherData).getWeather();
    }

    @Test
    public void getWeatherMainTest() {
        assertEquals(expectedWeatherData.getWeather().getMain(), actualWeatherData.getWeather().getMain());
        verify(actualWeatherData).getWeather();
    }

    @Test
    public void getWeatherDescriptionTest() {
        assertEquals(expectedWeatherData.getWeather().getDescription(), actualWeatherData.getWeather().getDescription());
        verify(actualWeatherData).getWeather();
    }

    @Test
    public void getWeatherIconTest() {
        assertEquals(expectedWeatherData.getWeather().getIcon(), actualWeatherData.getWeather().getIcon());
        verify(actualWeatherData).getWeather();
    }

    @Test
    public void getBaseTest() {
        assertEquals(expectedWeatherData.getBase(), actualWeatherData.getBase());
        verify(actualWeatherData).getBase();
    }

    @Test
    public void getMainDataTest() {
        assertNotNull(actualWeatherData.getMain());
        assertEquals(expectedWeatherData.getMain().getTemp(), actualWeatherData.getMain().getTemp());
        assertEquals(expectedWeatherData.getMain().getFeels_like(), actualWeatherData.getMain().getFeels_like());
        assertEquals(expectedWeatherData.getMain().getTemp_min(), actualWeatherData.getMain().getTemp_min());
        assertEquals(expectedWeatherData.getMain().getTemp_max(), actualWeatherData.getMain().getTemp_max());
        assertEquals(expectedWeatherData.getMain().getPressure(), actualWeatherData.getMain().getPressure());
        assertEquals(expectedWeatherData.getMain().getHumidity(), actualWeatherData.getMain().getHumidity());
        verify(actualWeatherData, times(7)).getMain();
    }

    @Test
    public void getVisibilityTest() {
        assertEquals(expectedWeatherData.getVisibility(), actualWeatherData.getVisibility());
        verify(actualWeatherData).getVisibility();
    }

    @Test
    public void getWindTest() {
        assertNotNull(actualWeatherData.getWind());
        assertEquals(expectedWeatherData.getWind().getSpeed(), actualWeatherData.getWind().getSpeed());
        assertEquals(expectedWeatherData.getWind().getDeg(), actualWeatherData.getWind().getDeg());
        assertEquals(expectedWeatherData.getWind().getGust(), actualWeatherData.getWind().getGust());
        verify(actualWeatherData, times(4)).getWind();
    }

    @Test
    public void getCloudsTest() {
        assertNotNull(actualWeatherData.getClouds());
        assertEquals(expectedWeatherData.getClouds().getAll(), actualWeatherData.getClouds().getAll());
        verify(actualWeatherData, times(2)).getClouds();
    }

    @Test
    public void getDtTest() {
        assertEquals(expectedWeatherData.getDt(), actualWeatherData.getDt());
        verify(actualWeatherData).getDt();
    }

    @Test
    public void getSysTest() {
        assertNotNull(actualWeatherData.getSys());
        assertEquals(expectedWeatherData.getSys().getType(), actualWeatherData.getSys().getType());
        assertEquals(expectedWeatherData.getSys().getId(), actualWeatherData.getSys().getId());
        assertEquals(expectedWeatherData.getSys().getCountry(), actualWeatherData.getSys().getCountry());
        assertEquals(expectedWeatherData.getSys().getSunrise(), actualWeatherData.getSys().getSunrise());
        assertEquals(expectedWeatherData.getSys().getSunset(), actualWeatherData.getSys().getSunset());
        verify(actualWeatherData, times(6)).getSys();
    }

    @Test
    public void getTimezoneTest() {
        assertEquals(expectedWeatherData.getTimezone(), actualWeatherData.getTimezone());
        verify(actualWeatherData).getTimezone();
    }

    @Test
    public void getIdTest() {
        assertEquals(expectedWeatherData.getId(), actualWeatherData.getId());
        verify(actualWeatherData).getId();
    }

    @Test
    public void getNameTest() {
        assertEquals(expectedWeatherData.getName(), actualWeatherData.getName());
        verify(actualWeatherData).getName();
    }

    @Test
    public void getCodTest() {
        assertEquals(expectedWeatherData.getCod(), actualWeatherData.getCod());
        verify(actualWeatherData).getCod();
    }
}
