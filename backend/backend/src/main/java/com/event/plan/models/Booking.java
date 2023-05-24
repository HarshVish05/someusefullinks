package com.event.plan.models;


import lombok.*;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    private Date date;
    private int guestCount;     // will have  userbooking, , venue, event,  fooditem


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "food_item_id")
    private FoodItem foodItem;



}

