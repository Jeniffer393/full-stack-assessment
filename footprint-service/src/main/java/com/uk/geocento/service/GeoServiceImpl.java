package com.uk.geocento.service;
import com.uk.geocento.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeoServiceImpl implements GeoService {
    @Override
    public FeatureCollection processAreaOfInterest(FeatureCollection areaOfInterest) {
        FeatureCollection featureCollection = new FeatureCollection();
        Feature footprintFeature = new Feature();
        Geometry footprintGeometry = new Geometry();
        footprintGeometry.setType("Polygon");
        double[][][] coordinates = {{ { 53.09051246499908,-4.122169673877181},
                { 51.05701477929102, -2.676430417888554},
                { 52.049136396736486, 0.09725591404151146},
                { 53.80482160830206, -0.3739477627277097},
                { 54.78600462975231, -3.1155062790178647},
                { 53.09051246499908, -4.122169673877181} }};
        footprintGeometry.setCoordinates(coordinates);
        footprintFeature.setGeometry(footprintGeometry);
        footprintFeature.setType("Feature");
        featureCollection.setType("FeatureCollection");
        featureCollection.setFeatures(List.of(footprintFeature));
        return featureCollection;
    }
}