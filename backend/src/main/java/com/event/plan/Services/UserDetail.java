package com.event.plan.Services;

import com.event.plan.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDetail   {


    public User addUser(User user);



    public String deleteUser(int user_id);

    public String  updateUser(User user);


    public List<User> getUsers();







}
