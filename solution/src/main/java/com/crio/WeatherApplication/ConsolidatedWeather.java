package com.crio.WeatherApplication;

import java.util.Date;

// Sample values
//"consolidated_weather": [
//    {
//    "id": 4639649109639168,
//    "weather_state_name": "Light Cloud",
//    "weather_state_abbr": "lc",
//    "wind_direction_compass": "SW",
//    "created": "2021-04-11T00:51:58.755234Z",
//    "applicable_date": "2021-04-11",
//    "min_temp": 15.565,
//    "max_temp": 26.07,
//    "the_temp": 26.105,
//    "wind_speed": 4.950913974954267,
//    "wind_direction": 217.8094735925712,
//    "air_pressure": 1012.5,
//    "humidity": 43,
//    "visibility": 17.766245128449853,
//    "predictability": 70
//    }

public class ConsolidatedWeather {

  public Object id;
  public String weather_state_name;
  public String weather_state_abbr;
  public String wind_direction_compass;
  public Date created;
  public String applicable_date;
  public double min_temp;
  public double max_temp;
  public double the_temp;
  public double wind_speed;
  public double wind_direction;
  public double air_pressure;
  public int humidity;
  public double visibility;
  public int predictability;
}
