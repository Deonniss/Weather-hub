package ru.infomatix.weatherHub.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherDto {

    @JsonProperty("weather")
    private List<WeatherDetails> weatherDetails;

    @JsonProperty("main")
    private WeatherMain weatherMain;

    @JsonProperty("visibility")
    private Integer visibility;

    @JsonProperty("wind")
    private Wind wind;

    @JsonProperty("rain")
    private Rain rain;

    @JsonProperty("snow")
    private Snow snow;

    @JsonProperty("clouds")
    private Clouds clouds;

    @JsonProperty("dt")
    private Long timestamp;

    @JsonProperty("sys")
    private SunDetails sunDetails;

    @JsonProperty("name")
    private String city;

    @Data
    private static class SunDetails {
        @JsonProperty("sunrise")
        private Long sunrise;
        @JsonProperty("sunset")
        private Long sunset;
    }

    @Data
    private static class Clouds {
        @JsonProperty("all")
        private Integer all;
    }

    @Data
    private static class Snow {
        @JsonProperty("1h")
        private Double snowPrecipitation;
    }

    @Data
    private static class Rain {
        @JsonProperty("1h")
        private Double rainPrecipitation;
    }

    @Data
    private static class WeatherDetails {
        @JsonProperty("main")
        private String weatherType;
        @JsonProperty("description")
        private String weatherDescription;
    }

    @Data
    private static class WeatherMain {
        @JsonProperty("temp")
        private Double temperature;
        @JsonProperty("feels_like")
        private Double feelsLikeTemperature;
        @JsonProperty("temp_min")
        private Double temperatureMin;
        @JsonProperty("temp_max")
        private Double temperatureMax;
        @JsonProperty("pressure")
        private Integer pressure;
        @JsonProperty("humidity")
        private Integer humidity;
    }

    @Data
    private static class Wind {
        @JsonProperty("speed")
        private Integer speed;
        @JsonProperty("deg")
        private Integer degree;
    }
}
