package com.event.plan.Dao;

import com.event.plan.models.Booking;
import com.event.plan.models.BookingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookinDao extends JpaRepository<Booking, Integer> {










}
