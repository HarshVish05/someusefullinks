package com.event.plan.Controller;


import com.event.plan.Services.EventService;
import com.event.plan.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EventController {

    @Autowired
    private final EventService eventService;


    public EventController(EventService eventService) {
        this.eventService = eventService;
    }


    @PostMapping("/addevent")
    public Event addEvent(@RequestBody Event event) {
       return eventService.addEvent(event);
    }


    @GetMapping("/getEvents")
    public List<Event> geteventsByVenueId(@RequestParam int venueId){
        return eventService.getEventByVenueId(venueId);
    }

    @GetMapping("/geteventbyid")
    public List<Event> geteventsbyid(@RequestParam int eventId){
        return eventService.getEventByVenueId(eventId);
    }




}