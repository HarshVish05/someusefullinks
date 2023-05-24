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
public class BookingDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
                       // will have a venue booked, will have user who booked partivular event
	                   // will have a Booking id from Booking entity
	                   //will have a event booked details
	                    // will have foodItem booked
	@OneToOne
	@JoinColumn(name = "booking_id")
	private Booking booking;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "event_id")
	private Event event;

	@ManyToOne
	@JoinColumn(name = "venue_id")
	private Venue venue;

	@ManyToOne
	@JoinColumn(name = "food_item_id")
	private FoodItem foodItem;

	

}
