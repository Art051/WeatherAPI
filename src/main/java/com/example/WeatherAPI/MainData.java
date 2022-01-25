package com.example.WeatherAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "temp",
        "feels_like",
        "temp_min",
        "temp_max",
        "pressure",
        "humidity"
})

@JsonIgnoreProperties(ignoreUnknown = true)
public class MainData {

    public String temp;
    @JsonProperty("feels_like")
    public String feelsLike;
    @JsonProperty("temp_min")
    public String tempMin;
    @JsonProperty("temp_max")
    public String tempMax;
    public String pressure;
    public String humidity;

    }
