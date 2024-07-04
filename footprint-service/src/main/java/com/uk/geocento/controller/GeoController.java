package com.uk.geocento.controller;

import com.uk.geocento.model.FeatureCollection;
import com.uk.geocento.service.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/geocento")
public class GeoController {
    private final GeoService geoService;
    @Autowired
    public GeoController(GeoService geoService) {
        this.geoService = geoService;
    }
    @CrossOrigin
    @PostMapping("/footprint")
    public FeatureCollection getFootprint(@RequestBody FeatureCollection areaOfInterest){
        return geoService.processAreaOfInterest(areaOfInterest);
    }
}
