package com.event.plan.Services;

import com.event.plan.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface UserDetail   {


    public User addUser(User user);



    public String deleteUser(int user_id);

    public String  updateUser(User user);


    public List<User> getUsers();

    String authenticateUser(String UserName, String passWord);

    Optional<User> findByRole(String role);
}
