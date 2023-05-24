package com.event.plan.Services;

import com.event.plan.Dao.UserDao;
import com.event.plan.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserdetailImpl implements UserDetail {

    @Autowired
    private final UserDao userDao;

//    private final BCryptPasswordEncoder passwordEncoder;


    public UserdetailImpl(UserDao userDao) {
        this.userDao = userDao;

    }

    @Override
    public String authenticateUser(String UserName, String passWord) {
        User user = userDao.findByUsernameIgnoreCase(UserName);

        if (user != null) {
            if (passWord.equals(user.getPassword())) {
                return user.getRole();
            }
        }


        return user.getRole();
    }

    @Override
    public Optional<User> findByRole(String role) {
       User user = userDao.findByRoleIgnoreCase(role);
       if (user.getRole() == "user"){
           return userDao.findByRole("user");
       }
       else {
           return userDao.findByRole("vendor");
       }
    }


    @Override
    public User addUser(User user) {
        return userDao.save(user);
    }


    @Override
    public String deleteUser(int user_id) {
        userDao.deleteById(user_id);
        return "Deleted Successfully";
    }

    @Override
    public String updateUser(User user) {
        userDao.save(user);

        return "updated successfully" + user;
    }


    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }

        }


