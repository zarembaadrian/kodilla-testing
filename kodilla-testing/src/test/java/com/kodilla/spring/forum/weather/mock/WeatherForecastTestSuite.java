package com.kodilla.spring.forum.weather.mock;

import testing.weather.Temperatures;
import testing.weather.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {

    @Test
    public void testCalculateForecastWithMock() {
        Temperatures temperaturesMock = mock(Temperatures.class);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        HashMap<Integer, Double> temperaturesMap = new HashMap<>();

        temperaturesMap.put(0, 15.2);
        temperaturesMap.put(1, 20.3);
        temperaturesMap.put(2, 25.1);
        temperaturesMap.put(3, 15.6);
        temperaturesMap.put(4, 19.3);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        int quantityOfSensors = weatherForecast.calculateForecast().size();

        Assert.assertEquals(5,quantityOfSensors);
    }
}
