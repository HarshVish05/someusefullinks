package com.event.plan.Services;

import com.event.plan.models.FoodItem;

import java.util.List;
import java.util.Optional;

public interface FoodItemService {

    public List<FoodItem> getFoodItemById(int venueId);


    public FoodItem addFoodItem(FoodItem foodItem);

    public Optional<FoodItem> getFoodItem(int foodItemId);


    public void deleteFoodItem(int foodItemId);


    public FoodItem updateFoodItem(FoodItem foodItem);



}
