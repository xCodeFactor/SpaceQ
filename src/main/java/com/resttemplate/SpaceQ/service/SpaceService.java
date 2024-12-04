package com.resttemplate.SpaceQ.service;

import com.resttemplate.SpaceQ.model.ApodResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpaceService {
    @Value("${nasa.api.key}")
    private String apiKey;

    //private final RestTemplate restTemplate = new RestTemplate();
    private final String apodUrl = "https://api.nasa.gov/planetary/apod?api_key=";

    public ApodResponse getApod() {
        String url = apodUrl + apiKey;
        ResponseEntity<ApodResponse> response = new RestTemplate().getForEntity(url, ApodResponse.class);
        return response.getBody();
    }
}
