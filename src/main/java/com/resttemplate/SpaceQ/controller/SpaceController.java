package com.resttemplate.SpaceQ.controller;

import com.resttemplate.SpaceQ.model.ApodResponse;
import com.resttemplate.SpaceQ.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpaceController {

    @Autowired
    private SpaceService spaceService;

    @GetMapping("/apod")
    public ResponseEntity<ApodResponse> getApod() {
        ApodResponse apod = spaceService.getApod();
        return ResponseEntity.ok(apod);
    }
}
