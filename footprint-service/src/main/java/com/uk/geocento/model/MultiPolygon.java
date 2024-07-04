package com.uk.geocento.model;
import java.util.List;

public class MultiPolygon{
    private List<Polygon> coordinates;

    public MultiPolygon(List<Polygon> coordinates) {
        this.coordinates = coordinates;
    }

    public List<Polygon> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Polygon> coordinates) {
        this.coordinates = coordinates;
    }
}
