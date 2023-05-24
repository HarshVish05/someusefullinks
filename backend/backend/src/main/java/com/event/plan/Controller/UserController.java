package com.event.plan.Controller;


import com.event.plan.Services.UserDetail;
import com.event.plan.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@RestController
@RequestMapping

@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {

    @Autowired
    private  final UserDetail userDetail;


    public UserController(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    @GetMapping("/")
    public String wellcome(){
        return "welcome";
    }

    @PostMapping("/registerUser")
    public User registerUser( User user ){
       return  userDetail.addUser(user);

    }

    @PostMapping("/loginUser")
    public ResponseEntity<String> loginUser(@RequestParam("UserName") String  UserName,
                                            @RequestParam("password" ) String password) {

        System.out.println(UserName);
        System.out.println(password);

        String role = userDetail.authenticateUser(UserName, password);

        if (role != null) {
            return ResponseEntity.ok(role);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    @GetMapping("/seeVendors")
    public Optional<User> getVendors(@RequestParam("Role") String role){
        return userDetail.findByRole(role);
    }





}
