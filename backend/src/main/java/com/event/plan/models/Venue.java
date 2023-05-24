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
public class Venue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int venueId;
	private String venueName;
	private String venuePlace;
	private String venueContact;



	@OneToOne
	@JoinColumn(name = "vendor_id")
	private User user;

	@OneToMany(mappedBy = "venue", cascade = CascadeType.ALL)
	private List<Event> events;  // each venue will have many events


	@OneToMany(mappedBy = "venue", cascade = CascadeType.ALL)
	private List<FoodItem> foodItems;   //




}
