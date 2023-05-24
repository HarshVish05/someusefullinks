package com.event.plan.Controller;


import com.event.plan.Services.FoodItemService;
import com.event.plan.models.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/noauth")
public class FoodItemController {


    @Autowired
    private  final FoodItemService foodItemService;


    public FoodItemController(FoodItemService foodItemService) {
        this.foodItemService = foodItemService;
    }

    @PostMapping ("/addFoodItem")
    public FoodItem addfoodItem(@RequestBody FoodItem foodItem){
        return foodItemService.addFoodItem(foodItem);
    }

    @GetMapping("/getFoodItem")
    public Optional<FoodItem> getFoodItem(@RequestBody int foodId){
        return foodItemService.getFoodItem(foodId);
    }
    @GetMapping("/getfoodItemByVenue")
    public List<FoodItem> getFoodItemById(int venueId) {
        return foodItemService.getFoodItemById(venueId);
    }

    @PutMapping("/updateFoodItems")
    public FoodItem updateFoodItem(@RequestBody FoodItem foodItem) {
        return foodItemService.updateFoodItem(foodItem);
    }
    @DeleteMapping("/deleteFoodItem")
    public String  deleteFoodItem(@RequestParam("id") int foodItemId) {
        foodItemService.deleteFoodItem(foodItemId);
        return "Item Deleted successfully";
    }


}
