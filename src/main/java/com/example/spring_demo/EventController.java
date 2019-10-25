package com.example.spring_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongchul on 2019-10-25.
 */
@Controller
public class EventController {

    @GetMapping("/events")
    public String getEvents(Model model) {
        Event event1 = new Event();
        event1.setName("study");
        event1.setStarts(LocalDateTime.of(2019, 1, 15, 10, 00));

        Event event2 = new Event();
        event2.setName("study");
        event2.setStarts(LocalDateTime.of(2019, 1, 15, 10, 00));

        List<Event> events = new ArrayList<>();
        events.add(event1);
        events.add(event2);

        model.addAttribute("events", events);
        model.addAttribute("message", " happy new year");

        return "events/list";
    }
}
