package com.event.plan.Services;

import com.event.plan.models.Booking;

import  java.util.List;
import java.util.Optional;

public interface BookingService {



    Booking Book(Booking booking);

//    public List<Booking> getBookings();

    List<Booking> getBookings();

    Optional<Booking> getBookingByUserId(int user_id);

    String cancelBooking(int id);






}
