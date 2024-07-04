package com.uk.geocento.model;
import java.util.List;
public class LineString {
    private List<Point> coordinates;

    public LineString(List<Point> coordinates) {
        this.coordinates = coordinates;
    }

    public List<Point> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Point> coordinates) {
        this.coordinates = coordinates;
    }
}
