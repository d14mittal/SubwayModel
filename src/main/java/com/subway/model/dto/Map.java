package com.subway.model.dto;

import com.subway.model.service.SubwayService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map {

    public static void main(String ar[]){
        SubwayService subwayService = new SubwayService();

        Train greenTrain = new Train("green",new Station("Kipling",false, Arrays.asList("green"), Arrays.asList("northeast")), new Station("Kennedy",true, Arrays.asList("green","blue"),Arrays.asList("north", "southwest")));
        Train yellowTrain = new Train("yellow",new Station("Vaughan Metropolitan Centre",false, Arrays.asList("yellow"), Arrays.asList("south")), new Station("Finch",false, Arrays.asList("yellow"),Arrays.asList("south")));
        Train blueTrain = new Train("blue", new Station("Kennedy",true, Arrays.asList("green","blue"),Arrays.asList("north", "southwest")), new Station("McCowan",false, Arrays.asList("blue"),Arrays.asList("west")));
        Train pinkTrain = new Train("pink",new Station("Sheppard-Yonge",true, Arrays.asList("yellow, pink"), Arrays.asList("north, south, east")), new Station("Don Mills",false, Arrays.asList("pink"),Arrays.asList("west")));

        List<Station> stationListGreen = new ArrayList<>();
        List<Station> stationListYellow = new ArrayList<>();
        List<Station> stationListBlue = new ArrayList<>();
        List<Station> stationListPink = new ArrayList<>();

        subwayService.setStations(stationListBlue, stationListPink, stationListGreen, stationListYellow);

//        subwayService.trainScheduler(new Station("Kipling", Arrays.asList("green")));
        subwayService.trainScheduler(new Station("St. George", Arrays.asList("green", "yellow")));

//        subwayService.trainScheduler(new Station("McCowan", false, Arrays.asList("blue"), Arrays.asList("west")));

//        subwayService.arrivalTimeForNextTrain();
    }

}
