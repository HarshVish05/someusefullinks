package com.event.plan.models;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Venue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int venue_id;
	private String venueName;
	private String venuePlace;
	private String venueContact;



	@OneToOne
	@JoinColumn(name = "vendor_id")
	private User user;

	@OneToMany(mappedBy = "venue", cascade = CascadeType.ALL)
//	@JsonManagedReference(value = "venue")
	private List<Event> events;  // each venue will have many events


//	@JsonManagedReference(value = "venue")
	@OneToMany(mappedBy = "venue", cascade = CascadeType.ALL)
	private List<FoodItem> foodItems;   //




}
