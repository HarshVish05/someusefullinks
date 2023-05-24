package com.event.plan.Dao;

import com.event.plan.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventDao extends JpaRepository<Event, Integer> {




}
