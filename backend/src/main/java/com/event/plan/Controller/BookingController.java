package com.event.plan.Controller;


import com.event.plan.Services.BookingService;
import com.event.plan.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/noauth")
public class BookingController {


    @Autowired
    private  final BookingService bookingService;


    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;

    }

    @PostMapping("/book")
    public Booking Book(@RequestBody Booking booking){
        return bookingService.Book(booking);


    }

    @GetMapping("/getBookings")
    public List<Booking> getallbookings(){
        return bookingService.getBookings();
    }

    @GetMapping("/getBookingsById")
    public Optional<Booking> getallbookingsById(int Id){
        return bookingService.getBookingByUserId(Id);
    }

    @DeleteMapping("deletebooking")
    public String cancelBooking(@RequestParam("id") int id){
        bookingService.cancelBooking(id);
        return "Booking Cancelled";
    }
}
