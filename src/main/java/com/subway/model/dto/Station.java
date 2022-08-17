package com.subway.model.dto;

//Given the following subway map, break it down into individual components and model these components using C# or Java classes:
// When building your data model, try to build it with the following in mind:
//
// Some method should exist that can tell a caller when the next train will arrive at a specific station, given a time and direction (north, south, east, west).
// A simple schedule should be implemented, that can be looked up by station, to determine the times at which trains will arrive at that station.
// As noted above, the data model should account for direction (north, south, east, west) and handle stations that have intersecting lines.
// Please include a simple main method that can demonstrate the correctness of the method described in #1 above.


import java.util.List;

public class Station {

    private String name;
    private boolean interchange;
    private List<String> color; // list of colors intersecting at station
    private List<String> incomingDirection; //possible directions of incoming trains
    private List<Station> adjacentStations; //adjacent Stations

    public Station(String name, List<String> color) {
        this.name = name;
        this.color = color;
    }

    public Station(String name, boolean interchange, List<String> color, List<String> incomingDirection) {
        this.name = name;
        this.interchange = interchange;
        this.color = color;
        this.incomingDirection = incomingDirection;
    }

    public List<String> getIncomingDirection() {
        return incomingDirection;
    }

    public void setIncomingDirection(List<String> incomingDirection) {
        this.incomingDirection = incomingDirection;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public boolean isInterchange() {
        return interchange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInterchange(boolean interchange) {
        this.interchange = interchange;
    }
}