package com.crio.WeatherApplication;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityWeather {

  public List<ConsolidatedWeather> consolidated_weather;
}
