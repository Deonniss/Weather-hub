package ru.infomatix.weatherHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WeatherHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherHubApplication.class, args);
	}

}

//https://api.openweathermap.org/data/2.5/weather?lon=37.62&lat=55.75&appid=ca9a10f64fee9b9997ad3224a5a95ca4
