package com.event.plan.Controller;


import com.event.plan.Services.VenueService;
import com.event.plan.models.Venue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class VenueController {

    @Autowired
    private final VenueService venueService;

    public VenueController(VenueService venueService) {
        this.venueService = venueService;


    }

    @PostMapping("/addvenue")
    public
    Venue addVenue(@RequestBody Venue venue){
        return venueService.addVenue(venue);

    }

    @PutMapping("/updatevenue")
    public Venue  updateVenue(@RequestBody Venue venue){

        return venueService.updateVenue(venue);
    }

    @DeleteMapping("/deleteVenue")
    public String deletevenue(@RequestBody int venueID)
    {
        return venueService.deleteVenue(venueID);
    }

        @GetMapping("/getVenueById")
        public Optional<Venue> getVenue(@RequestParam int venueId){
        return venueService.getVenueById(venueId);
        }
}
