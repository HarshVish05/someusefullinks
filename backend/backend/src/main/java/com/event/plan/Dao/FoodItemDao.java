package com.event.plan.Dao;

import com.event.plan.models.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodItemDao extends JpaRepository<FoodItem, Integer> {


}
