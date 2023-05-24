package com.event.plan.Controller;


import com.event.plan.Services.FoodItemService;
import com.event.plan.models.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class FoodItemController {


    @Autowired
    private  final FoodItemService foodItemService;


    public FoodItemController(FoodItemService foodItemService) {
        this.foodItemService = foodItemService;
    }

    @PostMapping("/addFoodItem")
    public FoodItem addfoodItem(@RequestBody FoodItem foodItem){
        return foodItemService.addFoodItem(foodItem);
    }

    @GetMapping("/viewfoodbyvenue")
    public List<FoodItem> getFoodItemByVenue(@RequestParam("id") int venueId){
        return foodItemService.getFoodItemById(venueId);
    }

}
