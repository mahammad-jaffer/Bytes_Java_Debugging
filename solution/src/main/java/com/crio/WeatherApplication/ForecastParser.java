package com.crio.WeatherApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class ForecastParser {

  private HashSet<String> synonymsOfRain =
      new HashSet<>(Arrays.asList("rain", "precipitation", "drizzle"));

  public Boolean willItRain(String weatherDataJson) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    CityWeather cityWeather = mapper.readValue(weatherDataJson, CityWeather.class);

    for (ConsolidatedWeather consolidatedWeather : cityWeather.consolidated_weather) {
      String[] splitWeatherString =
          consolidatedWeather.weather_state_name.toLowerCase().split(" ");
      for (String weatherString : splitWeatherString) {
        if (synonymsOfRain.contains(weatherString)) {
          return true;
        } // if.
      } // for weatherString.
    } // for consolidatedWeather.
    return false;
  }
}
