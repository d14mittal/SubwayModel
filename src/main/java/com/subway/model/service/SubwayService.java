package com.subway.model.service;

import com.subway.model.dto.Station;
import com.subway.model.util.ApplicationConstants;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubwayService {

    List<Station> stationListGreen = new ArrayList<>();
    List<Station> stationListYellow = new ArrayList<>();
    List<Station> stationListBlue = new ArrayList<>();
    List<Station> stationListPink = new ArrayList<>();

    public List<Station> getStationListGreen() {
        return stationListGreen;
    }

    public void setStationListGreen(List<Station> stationListGreen) {
        stationListGreen.add(new Station("Kipling", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.NORTHEAST)));
        stationListGreen.add(new Station("Islington", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.SOUTHWEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Royal York", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Old Mill", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Jane", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Runnymede", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("High Park", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Keele", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Dundas West\n", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Lansdowne", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Dufferin", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Ossington", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Christie", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Bathurst", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Spadina", true, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("St. George", true, Arrays.asList(ApplicationConstants.GREEN, ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTHWEST, ApplicationConstants.SOUTH, ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Bay", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Bloor-Yonge", true, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH, ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Sherbourne", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Castle Frank", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Broadview", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Chester", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Pape", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Donlands", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Greenwood", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Coxwell", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Woodbine", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListGreen.add(new Station("Main Street", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.NORTHEAST)));
        stationListGreen.add(new Station("Victoria Park", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.SOUTHWEST, ApplicationConstants.NORTHEAST)));
        stationListGreen.add(new Station("Warden", false, Arrays.asList(ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.SOUTHWEST, ApplicationConstants.NORTHEAST)));
        stationListGreen.add(new Station("Kennedy", true, Arrays.asList(ApplicationConstants.GREEN, ApplicationConstants.BLUE), Arrays.asList(ApplicationConstants.SOUTHWEST, ApplicationConstants.NORTH)));
        this.stationListGreen = stationListGreen;
    }

    private void setStationListYellow(List<Station> stationListYellow) {

        stationListYellow.add(new Station("Vaughan Metropolitan Centre", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Highway 407", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTHEAST)));
        stationListYellow.add(new Station("Pioneer Village", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTHWEST, ApplicationConstants.SOUTHEAST)));
        stationListYellow.add(new Station("York University", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTHWEST, ApplicationConstants.SOUTHEAST)));
        stationListYellow.add(new Station("Finch West", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTHWEST, ApplicationConstants.SOUTHEAST)));
        stationListYellow.add(new Station("Downsview Park", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTHWEST, ApplicationConstants.SOUTHEAST)));
        stationListYellow.add(new Station("Sheppard West", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTHWEST, ApplicationConstants.SOUTHEAST)));
        stationListYellow.add(new Station("Wilson", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTHWEST, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Yorkdale", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Lawrence West", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Glencairn", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Eglinton West", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTHEAST)));
        stationListYellow.add(new Station("St. Clair West", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTHWEST, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Duponte", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Spadina", true, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTHEAST)));
        stationListYellow.add(new Station("St. George", true, Arrays.asList(ApplicationConstants.YELLOW, ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.NORTHWEST, ApplicationConstants.EAST, ApplicationConstants.SOUTH, ApplicationConstants.WEST)));
        stationListYellow.add(new Station("Museum", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Queen's Park", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("St. Patrick", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Osgoode", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("St. Andrew", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTHEAST)));
        stationListYellow.add(new Station("Union", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTHEAST, ApplicationConstants.NORTHWEST)));
        stationListYellow.add(new Station("King", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.SOUTHWEST, ApplicationConstants.NORTH)));
        stationListYellow.add(new Station("Queen", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Dundas", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("College", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Wellesley", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Bloor-Yonge", true, Arrays.asList(ApplicationConstants.YELLOW, ApplicationConstants.GREEN), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH, ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListYellow.add(new Station("Rosedale", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Summerhill", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("St. Clair", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Davisville", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Eglinton", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Lawrence", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("York Mills", false, Arrays.asList(ApplicationConstants.YELLOW, ApplicationConstants.PINK), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Sheppard-Yonge", true, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH, ApplicationConstants.EAST)));
        stationListYellow.add(new Station("North York Centre", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        stationListYellow.add(new Station("Finch", false, Arrays.asList(ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.SOUTH)));
        this.stationListYellow = stationListYellow;
    }

    private void setStationListPink(List<Station> stationListPink) {

        stationListYellow.add(new Station("Don Mills", false, Arrays.asList(ApplicationConstants.PINK), Arrays.asList(ApplicationConstants.WEST)));
        stationListYellow.add(new Station("Leslie", false, Arrays.asList(ApplicationConstants.PINK), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListYellow.add(new Station("Bessarion", false, Arrays.asList(ApplicationConstants.PINK), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListYellow.add(new Station("Bayview", false, Arrays.asList(ApplicationConstants.PINK), Arrays.asList(ApplicationConstants.WEST, ApplicationConstants.EAST)));
        stationListYellow.add(new Station("Sheppard-Yonge", true, Arrays.asList(ApplicationConstants.PINK, ApplicationConstants.YELLOW), Arrays.asList(ApplicationConstants.EAST, ApplicationConstants.NORTH, ApplicationConstants.SOUTH)));
        this.stationListPink = stationListPink;
    }

    private void setStationListBlue(List<Station> stationListBlue) {

        stationListBlue.add(new Station("McCowan", false, Arrays.asList(ApplicationConstants.BLUE), Arrays.asList("ApplicationConstants.WEST")));
        stationListBlue.add(new Station("Scarborough Centre", false, Arrays.asList(ApplicationConstants.BLUE), Arrays.asList("ApplicationConstants.WEST, ApplicationConstants.EAST")));
        stationListBlue.add(new Station("Midland", false, Arrays.asList(ApplicationConstants.BLUE), Arrays.asList("ApplicationConstants.SOUTHWEST, ApplicationConstants.EAST")));
        stationListBlue.add(new Station("Ellesmere", false, Arrays.asList(ApplicationConstants.BLUE), Arrays.asList("ApplicationConstants.SOUTH, ApplicationConstants.NORTHEAST")));
        stationListBlue.add(new Station("Lawrence East", false, Arrays.asList(ApplicationConstants.BLUE), Arrays.asList("ApplicationConstants.SOUTH, ApplicationConstants.NORTH")));
        stationListBlue.add(new Station("Kennedy", true, Arrays.asList(ApplicationConstants.GREEN, ApplicationConstants.BLUE), Arrays.asList("ApplicationConstants.SOUTHWEST, ApplicationConstants.NORTH")));
        this.stationListBlue = stationListBlue;
    }

    /**
     * @param station
     * @param direction
     * @param stringTime
     */
    public String arrivalTimeForNextTrain(Station station, String direction, String stringTime) {

        List<String> scheduledTiming = trainScheduler(station);
        Time givenTime = Time.valueOf(stringTime);
        LocalTime givenLocalTime = givenTime.toLocalTime();

        String nextTrainTime = "";
        for (String timing : scheduledTiming) {

            String[] a = timing.split(" ");
            int actualArrivalHour = Time.valueOf(a[a.length - 1]).toLocalTime().getHour();
            int actualArrivalMinute = Time.valueOf(a[a.length - 1]).toLocalTime().getMinute();
            if ((actualArrivalHour >= givenLocalTime.getHour()) && (actualArrivalMinute > givenLocalTime.getMinute())) {
                nextTrainTime = "Next Train arrives at : " + Time.valueOf(a[a.length - 1]).toLocalTime().toString();
                break;
            }
        }
        return nextTrainTime;
    }


    public void setStations(List<Station> stationListBlue, List<Station> stationListPink, List<Station> stationListGreen, List<Station> stationListYellow) {
        setStationListGreen(stationListGreen);
        setStationListBlue(stationListBlue);
        setStationListPink(stationListPink);
        setStationListYellow(stationListYellow);
    }

    /**
     * Train Scheduler to tell the times at which train arrives at a station
     *
     * @param station
     */
    public List<String> trainScheduler(Station station) {

        List<String> incomingColor = station.getColor();
        List<String> scheduledTiming = new ArrayList<>();

        for (String color : incomingColor) {
            String startTimeString = "06:00:00";
            Time startTime = Time.valueOf(startTimeString);
            LocalTime localStartTime = startTime.toLocalTime();

            List<Station> stationList = new ArrayList<>();
            switch (color) {
                case ApplicationConstants.GREEN: {
                    stationList = stationListGreen;
                    break;
                }
                case ApplicationConstants.YELLOW: {
                    stationList = stationListYellow;
                    break;
                }
                case ApplicationConstants.BLUE: {
                    stationList = stationListBlue;
                    break;
                }
                case ApplicationConstants.PINK: {
                    stationList = stationListPink;
                    break;
                }
            }

            boolean trainArrivedAgain = false;
            while (localStartTime.getHour() < 23 && localStartTime.getHour() >= 6) {
                for (int j = 0; j < stationList.size(); j++) {
                    if (!trainArrivedAgain && stationList.get(j).getName().equals(station.getName())) {
                        scheduledTiming.add("Arrival Time of " + color + " route train at " + station.getName() + " : " + localStartTime.getHour() + ":" + localStartTime.getMinute() + ":" + localStartTime.getSecond());
                    }
                    localStartTime = localStartTime.plusMinutes(ApplicationConstants.STOPPAGE_TIME); // 2  minutes of stoppage time at each station
                    if (j != stationList.size() - 1) {
                        localStartTime = localStartTime.plusMinutes(ApplicationConstants.TRANSIT_TIME); // 15 minutes of travel time in between stations
                    }
                }
                for (int j = stationList.size() - 1; j >= 0; j--) {
                    if (stationList.get(j).getName().equals(station.getName())) {
                        scheduledTiming.add("Arrival Time of " + color + " route train at " + station.getName() + " : " + localStartTime.getHour() + ":" + localStartTime.getMinute() + ":" + localStartTime.getSecond());
                        trainArrivedAgain = true;
                    }
                    localStartTime = localStartTime.plusMinutes(ApplicationConstants.STOPPAGE_TIME); // 2  minutes of stoppage time at each station
                    if (j != 0) {
                        localStartTime = localStartTime.plusMinutes(ApplicationConstants.TRANSIT_TIME); // 15 minutes of travel time in between stations
                    }
                }
            }
        }
        return scheduledTiming;
    }
}
