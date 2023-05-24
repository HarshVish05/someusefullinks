package com.event.plan.Controller;


import com.event.plan.Services.EventService;
import com.event.plan.models.Event;
import com.event.plan.models.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/noauth")
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
    public List<Event> getevents(@RequestParam int venueId){
        return eventService.getEventByVenueId(venueId);
    }

    @GetMapping("/geteventbyid")
    public Optional<Event> geteventsbyid(@RequestParam int eventId){
        return eventService.getEventById(eventId);
    }

    @PutMapping("/updateEvent")
    public Event updateEvent(@RequestBody Event event){
        return eventService.updateEvent(event);
    }
    @DeleteMapping("/deleteEvent")
    public String deleteEvent(@RequestParam("id") int id){
        eventService.deleteEvent(id);
        return "Event deleted Successfully";
    }



}