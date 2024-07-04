package com.uk.geocento.service;

import com.uk.geocento.model.FeatureCollection;
import org.springframework.stereotype.Service;

public interface GeoService {
    FeatureCollection processAreaOfInterest(FeatureCollection areaOfInterest);
}
