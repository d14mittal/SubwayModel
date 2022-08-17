package com.subway.model;

import com.subway.model.dto.Station;
import com.subway.model.service.SubwayService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] ar) {
        SubwayService subwayService = new SubwayService();

        List<Station> stationListGreen = new ArrayList<>();
        List<Station> stationListYellow = new ArrayList<>();
        List<Station> stationListBlue = new ArrayList<>();
        List<Station> stationListPink = new ArrayList<>();

        subwayService.setStations(stationListBlue, stationListPink, stationListGreen, stationListYellow);

//        List<String> scheduledTiming = subwayService.trainScheduler(new Station("Kipling", Arrays.asList("green")));
//        List<String> scheduledTiming = subwayService.trainScheduler(new Station("St. George", Arrays.asList("green", "yellow")));
        List<String> scheduledTiming = subwayService.trainScheduler(new Station("McCowan", false, Arrays.asList("blue"), Arrays.asList("west")));

         for(String schedule: scheduledTiming)
            System.out.println(schedule);

        String nextArrivalTime = subwayService.arrivalTimeForNextTrain(new Station("Kipling", Arrays.asList("green")), "north", "23:00:00");
        System.out.println(nextArrivalTime);
    }

}
