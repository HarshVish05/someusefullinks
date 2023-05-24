package com.event.plan.Dao;

import com.event.plan.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserDao extends JpaRepository<User, Integer> {


    User findByUsernameIgnoreCase(String userName);
    User findByRoleIgnoreCase(String role);
    Optional<User> findByRole(String role);

}
