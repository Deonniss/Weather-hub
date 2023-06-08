package ru.infomatix.weatherHub.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder(toBuilder = true)
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "weather_location")
public class WeatherLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String area;
    private Double lat;
    private Double lon;
}