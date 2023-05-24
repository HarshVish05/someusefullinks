package com.event.plan.Dao;


import com.event.plan.models.Communication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommDao extends JpaRepository<Communication, Integer> {
}
