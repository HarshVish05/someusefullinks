package com.event.plan.Services;

import com.event.plan.models.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {

    public   Event  addEvent(Event event);

    public Optional<Event> getEventById(int eventId);


    public List<Event> getEventByVenueId(int venueId);

    public Event  updateEvent(Event event);

    public String  deleteEvent(int eventId);







}
