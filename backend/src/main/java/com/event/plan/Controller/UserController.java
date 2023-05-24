package com.event.plan.Controller;


import com.event.plan.Services.UserDetail;
import com.event.plan.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/noauth")
public class UserController {

    @Autowired
    private  final UserDetail userDetail;


    public UserController(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    @GetMapping("/getuser")
    public List<User> getUsers(){
        return userDetail.getUsers();
    }
    @GetMapping("/get")
    public String welcome(){
        return "welcome";
    }

    @PostMapping("/registeruser")
    public User registerUser(@RequestBody User user ){
       return  userDetail.addUser(user);

    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody User user){
        userDetail.updateUser(user);
        return "User Updated Successfully";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") int id){
        userDetail.deleteUser(id);
        return "User Deleted Successfully";
    }





}
