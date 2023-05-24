package com.event.plan.Services;

import com.event.plan.Dao.VenueDao;
import com.event.plan.models.Venue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VenueServiceImpl implements VenueService {


    @Autowired
    private VenueDao venueDao;

    public VenueServiceImpl(VenueDao venueDao) {
        this.venueDao = venueDao;
    }

    @Override
    public Venue addVenue(Venue venue) {
        return venueDao.save(venue);
    }

    @Override
    public Optional<Venue> getVenueById(int venueId) {
        return venueDao.findById(venueId);
    }

    @Override
    public List<Venue> getvenues() {
        return null;
    }

    @Override
    public String deleteVenue(int venueId) {
         venueDao.deleteById(venueId);

         return "deleted Successfully" ;
    }

    @Override
    public Venue updateVenue(Venue venue) {
        return venueDao.save(venue);
    }
}
