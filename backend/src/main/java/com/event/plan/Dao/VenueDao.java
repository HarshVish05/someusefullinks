package com.event.plan.Dao;

import com.event.plan.models.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueDao extends JpaRepository<Venue, Integer> {
}
