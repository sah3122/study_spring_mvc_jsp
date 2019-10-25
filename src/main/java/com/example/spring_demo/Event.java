package com.example.spring_demo;

import java.time.LocalDateTime;

/**
 * Created by dongchul on 2019-10-25.
 */
public class Event {

    private String name;

    private LocalDateTime starts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStarts() {
        return starts;
    }

    public void setStarts(LocalDateTime starts) {
        this.starts = starts;
    }
}
