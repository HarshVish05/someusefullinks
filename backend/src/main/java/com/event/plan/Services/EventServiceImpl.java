package com.event.plan.Services;

import com.event.plan.Dao.EventDao;
import com.event.plan.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collections;
import  java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements  EventService{


    @Autowired
    private  final EventDao eventDao;

    public EventServiceImpl(EventDao eventDao) {
        this.eventDao = eventDao;
    }


    @Override
    public Event addEvent(Event event) {
        return eventDao.save(event);
    }

    @Override
    public Optional<Event> getEventById(int eventId) {
        return eventDao.findById(eventId);
    }

    @Override
    public List<Event>  getEventByVenueId(int venueId) {
        return eventDao.findAllById(Collections.singleton(venueId));
    }


    @Override
    public Event updateEvent(Event event) {
        return eventDao.save(event);
    }

    @Override
    public String deleteEvent(int eventId) {
        eventDao.deleteById(eventId);
        return "Event deleted successfully ";
    }
}
