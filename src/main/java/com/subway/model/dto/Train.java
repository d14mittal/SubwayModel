package com.subway.model.dto;

public class Train {


//    private String direction; // north, south, east, west
    private String color; //yellow, green, pink, blue
    private Station source;
    private Station destination;

    public Train(String color, Station source, Station destination) {
        this.color = color;
        this.source = source;
        this.destination = destination;
    }

//    public String getDirection() {
//        return direction;
//    }
//
//    public void setDirection(String direction) {
//        this.direction = direction;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Station getSource() {
        return source;
    }

    public void setSource(Station source) {
        this.source = source;
    }

    public Station getDestination() {
        return destination;
    }

    public void setDestination(Station destination) {
        this.destination = destination;
    }
}
