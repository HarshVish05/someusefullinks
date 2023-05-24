package com.event.plan.models;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;


    private String  role;

   private  String userName;



    private  String Password;

    @OneToOne(mappedBy = "user")
    private Venue venue;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;






}
