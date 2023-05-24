package com.event.plan.Services;

import com.event.plan.models.Venue;

import java.util.List;
import java.util.Optional;

public interface VenueService {


    public Venue addVenue(Venue venue );


    public Optional<Venue> getVenueById(int venueId);


    public List<Venue> getvenues();

    public String deleteVenue(int venueId);

    public Venue updateVenue(Venue venue);






}
