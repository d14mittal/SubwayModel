package com.subway.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.sql.Time;
import java.time.LocalTime;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        String startTimeString = "12:50:00";
        Time startTime = Time.valueOf(startTimeString);
        LocalTime localStartTime = startTime.toLocalTime();
        localStartTime = localStartTime.plusMinutes(15L);

        System.out.println(localStartTime.toString());

    }
}
