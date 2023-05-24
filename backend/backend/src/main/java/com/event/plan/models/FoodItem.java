package com.event.plan.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FoodItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int foodItemId;
    private String foodItemName;
    private int foodItemCost;
    private int venue_id;

    /*@OneToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;*/

    @ManyToOne
//    @JsonBackReference(value = "venue_id")
    @JoinColumn(name = "venue_id",insertable = false,updatable = false)
    private Venue venue;              //each venue will be associated with venue

    @OneToMany(mappedBy = "foodItem")
    private List<Booking> bookings;    // each venue will have many food items  bookings










}
