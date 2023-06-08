package ru.infomatix.weatherHub.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherRequestSender weatherRequestSender;

    @Scheduled(fixedDelayString = "${weather.scheduling.fixedRate}")
    public void getWeatherData() {

        weatherRequestSender.sendWeatherRequest();

        System.out.println(123);

    }

}
