package com.sds.model;


import io.swagger.client.model.LiftRide;

import java.util.concurrent.ThreadLocalRandom;

public class LiftRideEvent {

    private final LiftRide body;
    private final Integer resortID;
    private final String seasonID;
    private final String dayID;
    private final Integer skierID;

    private static final Integer MAX_SKIER_ID = 100000;
    private static final Integer MIN_SKIER_ID = 1;
    private static final Integer MAX_RESORT_ID= 10;
    private static final Integer MIN_RESORT_ID = 1;
    private static final Integer MAX_LIFT_ID = 40;
    private static final Integer MIN_LIFT_ID = 1;
    private static final Integer MAX_TIME = 360;
    private static final Integer MIN_TIME = 1;

    private static final String DAY_ID = "1";
    private static final String SEASON_ID = "2022";


    public LiftRideEvent() {
        this.skierID = ThreadLocalRandom.current().nextInt(MIN_SKIER_ID,MAX_SKIER_ID+ 1);
        this.resortID = ThreadLocalRandom.current().nextInt(MIN_RESORT_ID,MAX_RESORT_ID+ 1);
        int liftID = ThreadLocalRandom.current().nextInt(MIN_LIFT_ID,MAX_LIFT_ID+ 1);
        int time = ThreadLocalRandom.current().nextInt(MIN_TIME,MAX_TIME+ 1);
        this.body = new LiftRide();
        this.body.setTime(time);
        this.body.setLiftID(liftID);
        this.dayID =DAY_ID;
        this.seasonID =SEASON_ID;
    }

    public LiftRide getBody() {
        return body;
    }

    public Integer getResortID() {
        return resortID;
    }

    public String getSeasonID() {
        return seasonID;
    }

    public String getDayID() {
        return dayID;
    }

    public Integer getSkierID() {
        return skierID;
    }

}
