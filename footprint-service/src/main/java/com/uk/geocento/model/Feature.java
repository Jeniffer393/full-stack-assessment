package com.uk.geocento.model;

public class Feature {
    private String type;
    private Object geometry;

    public Feature() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getGeometry() {
        return geometry;
    }

    public void setGeometry(Object geometry) {
        this.geometry = geometry;
    }
}
