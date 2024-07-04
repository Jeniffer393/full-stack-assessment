package com.uk.geocento.model;
import java.util.List;
public class Polygon {
    private List<LineString> coordinates;

    public Polygon(List<LineString> coordinates) {
        this.coordinates = coordinates;
    }

    public List<LineString> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<LineString> coordinates) {
        this.coordinates = coordinates;
    }
}
