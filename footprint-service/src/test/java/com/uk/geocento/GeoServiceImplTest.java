package com.uk.geocento;

import com.uk.geocento.model.Feature;
import com.uk.geocento.model.FeatureCollection;
import com.uk.geocento.model.Geometry;
import com.uk.geocento.service.GeoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;

public class GeoServiceImplTest {
    @Mock
    private FeatureCollection mockFeatureCollection;

    FeatureCollection result;
    Feature footprintFeature;
    Geometry geometry;


    @InjectMocks
    private GeoServiceImpl geoService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        result = geoService.processAreaOfInterest(mockFeatureCollection);
        footprintFeature = result.getFeatures().get(0);
        geometry = (Geometry) footprintFeature.getGeometry();
    }

    @Test
    public void testProcessAoIFeactureCol() {
        assertEquals("FeatureCollection", result.getType());
        assertEquals(1, result.getFeatures().size());

    }

    @Test
    public void testProcessAoIFeature() {
        assertEquals("Feature", footprintFeature.getType());
        assertNotNull(footprintFeature);

    }

    @Test
    public void testProcessAoIGeo() {
        assertEquals("Polygon", geometry.getType());
        assertNotNull(footprintFeature.getGeometry());

    }
}
