package com.kodilla.forum.weather;

import com.kodilla.forum.weather.stub.TemperaturesStub;
import org.junit.Assert;
import org.junit.Test;
import testing.weather.Temperatures;
import testing.weather.WeatherForecast;
public class WeatherForecastTestSuite {

    @Test
    public void testCalculateForecastWithStub() {
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        int quantityOfSensors = weatherForecast.calculateForecast().size();

        Assert.assertEquals(5,quantityOfSensors);
    }
}
