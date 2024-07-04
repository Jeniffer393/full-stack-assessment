package com.uk.geocento.model;
import java.util.List;
public class Multipoint{
    private List<Point> coordinates;

    public Multipoint(List<Point> coordinates) {
        this.coordinates = coordinates;
    }

    public List<Point> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Point> coordinates) {
        this.coordinates = coordinates;
    }
}
