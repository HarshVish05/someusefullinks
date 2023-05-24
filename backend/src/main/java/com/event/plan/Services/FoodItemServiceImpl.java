package com.event.plan.Services;

import com.event.plan.Dao.FoodItemDao;
import com.event.plan.models.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class FoodItemServiceImpl implements FoodItemService{


    @Autowired
    private  final FoodItemDao foodItemDao;

    public FoodItemServiceImpl(FoodItemDao foodItemDao) {
        this.foodItemDao = foodItemDao;
    }


    @Override
    public List<FoodItem> getFoodItemById(int venueId) {
        return foodItemDao.findAllById(Collections.singleton(venueId));
    }

    @Override
    public FoodItem addFoodItem(FoodItem foodItem) {
        return foodItemDao.save(foodItem);
    }

    @Override
    public Optional<FoodItem> getFoodItem(int foodItemId) {
        return foodItemDao.findById(foodItemId);
    }

    @Override
    public void  deleteFoodItem(int foodItemId) {
          foodItemDao.deleteById(foodItemId);
          return ;
    }


    @Override
    public FoodItem updateFoodItem(FoodItem foodItem) {
        return foodItemDao.save(foodItem);
    }
}
