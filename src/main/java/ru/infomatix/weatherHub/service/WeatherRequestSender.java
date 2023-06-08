package ru.infomatix.weatherHub.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import ru.infomatix.weatherHub.dto.WeatherDto;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class WeatherRequestSender {

    private final RestTemplate restTemplate;

    @Value("${weather.request.url.template}")
    private String url;

    @Value("${weather.request.appid}")
    private String appid;

    public void sendWeatherRequest() {

        String formatUrl = String.format(url, 37.62, 55.75, appid);

        ResponseEntity<WeatherDto> response = restTemplate.getForEntity(formatUrl, WeatherDto.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            WeatherDto responseBody = response.getBody();
            // Обработка ответа
        } else {
            // Обработка ошибки
        }
    }

}
