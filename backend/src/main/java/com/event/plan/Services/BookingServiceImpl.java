package com.event.plan.Services;

import com.event.plan.Dao.BookinDao;
import com.event.plan.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookingServiceImpl implements  BookingService {


    @Autowired
    private  final BookinDao bookinDao;

    public BookingServiceImpl(BookinDao bookinDao) {
        this.bookinDao = bookinDao;
    }




    @Override
    public Booking Book(Booking booking) {
        return bookinDao.save(booking);
    }

    @Override
    public List<Booking> getBookings() {
        return bookinDao.findAll();
    }

    @Override
    public Optional<Booking> getBookingByUserId(int user_id) {
        return bookinDao.findById(user_id);
    }

    @Override
    public String cancelBooking(int id) {
        bookinDao.deleteById(id);
        return "Booking Cancelled";
    }
}
