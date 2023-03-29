package com.example.assignment_4;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time {

    private LocalDate date;
    private LocalTime time;
    private int duration;

    public Time(LocalDate date, LocalTime time, int duration) {
        this.date = date;
        this.time = time;
        this.duration = duration;
    }
}
