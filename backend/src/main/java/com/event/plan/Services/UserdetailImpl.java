package com.event.plan.Services;

import com.event.plan.Dao.UserDao;
import com.event.plan.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserdetailImpl implements UserDetail{

    @Autowired
    private  final UserDao userDao;

    public UserdetailImpl(UserDao userDao) {
        this.userDao = userDao;
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

         return "updated successfully";
    }

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }
}
