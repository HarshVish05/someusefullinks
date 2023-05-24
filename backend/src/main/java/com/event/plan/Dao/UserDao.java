package com.event.plan.Dao;

import com.event.plan.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<User, Integer> {





}
