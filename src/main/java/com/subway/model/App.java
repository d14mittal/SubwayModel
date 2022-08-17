package com.subway.model;

import com.subway.model.dto.Station;
import com.subway.model.service.SubwayService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] ar) {
        SubwayService subwayService = new SubwayService();

//        Train greenTrain = new Train("green",new Station("Kipling",false, Arrays.asList("green"), Arrays.asList("northeast")), new Station("Kennedy",true, Arrays.asList("green","blue"),Arrays.asList("north", "southwest")));
//        Train yellowTrain = new Train("yellow",new Station("Vaughan Metropolitan Centre",false, Arrays.asList("yellow"), Arrays.asList("south")), new Station("Finch",false, Arrays.asList("yellow"),Arrays.asList("south")));
//        Train blueTrain = new Train("blue", new Station("Kennedy",true, Arrays.asList("green","blue"),Arrays.asList("north", "southwest")), new Station("McCowan",false, Arrays.asList("blue"),Arrays.asList("west")));
//        Train pinkTrain = new Train("pink",new Station("Sheppard-Yonge",true, Arrays.asList("yellow, pink"), Arrays.asList("north, south, east")), new Station("Don Mills",false, Arrays.asList("pink"),Arrays.asList("west")));

        List<Station> stationListGreen = new ArrayList<>();
        List<Station> stationListYellow = new ArrayList<>();
        List<Station> stationListBlue = new ArrayList<>();
        List<Station> stationListPink = new ArrayList<>();

        subwayService.setStations(stationListBlue, stationListPink, stationListGreen, stationListYellow);

//        List<String> scheduledTiming = subwayService.trainScheduler(new Station("Kipling", Arrays.asList("green")));
//        List<String> scheduledTiming = subwayService.trainScheduler(new Station("St. George", Arrays.asList("green", "yellow")));
//        List<String> scheduledTiming = subwayService.trainScheduler(new Station("McCowan", false, Arrays.asList("blue"), Arrays.asList("west")));

//         for(String schedule: scheduledTiming)
//            System.out.println(schedule);

        String nextArrivalTime = subwayService.arrivalTimeForNextTrain(new Station("Kipling", Arrays.asList("green")), "north", "23:00:00");
        System.out.println(nextArrivalTime);
    }

}
