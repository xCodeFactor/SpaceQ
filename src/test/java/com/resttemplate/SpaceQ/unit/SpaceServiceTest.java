package com.resttemplate.SpaceQ.unit;

import com.resttemplate.SpaceQ.model.ApodResponse;
import com.resttemplate.SpaceQ.service.SpaceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class SpaceServiceTest {

    @Autowired
    private SpaceService spaceService;

    @Test
    public void testGetApod() {
        ApodResponse apod = spaceService.getApod();
        assertNotNull(apod);
        //assertEquals("Astronomy Picture of the Day", apod.getTitle());
    }
}
