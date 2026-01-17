package com.restopress.core.controller;


import com.restopress.core.model.Restaurant;
import com.restopress.core.service.RestaurantService;
import com.restopress.core.model.MenuItem;
import com.restopress.core.repository.MenuItemRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantService chef;

    public RestaurantController(RestaurantService chef) {
        this.chef = chef;
    }

    @PostMapping
    public Restaurant createRestaurant(@RequestBody Restaurant incomingData) {
        return chef.createRestaurant(incomingData);
    }

    @PostMapping("/{id}/items")
    public MenuItem addMenuItem(@PathVariable Long id, @RequestBody MenuItem item) {
        return chef.addMenuItem(id, item);
    }

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return chef.getAllRestaurants();
    }
}
