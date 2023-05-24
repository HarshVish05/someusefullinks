package com.event.plan.models;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Communication {


    private int user_id;


    private String user_message;
    private String vendor_reply;

}
