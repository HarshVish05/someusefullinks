package com.event.plan.models;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int eventId;
	private String eventName;
	private int eventCost;


	@ManyToOne
	@JoinColumn(name = "venue_id")
	private Venue venue;


	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
	private List<Booking> bookings;



	
	

}
