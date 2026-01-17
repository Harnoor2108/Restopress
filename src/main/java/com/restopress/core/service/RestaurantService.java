package com.restopress.core.service;

import com.restopress.core.model.MenuItem;
import com.restopress.core.model.Restaurant;
import com.restopress.core.repository.MenuItemRepository; // Make sure you created this!
import com.restopress.core.repository.RestaurantRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepo;
    private final MenuItemRepository itemRepo; // <--- NEW DEPENDENCY

    public RestaurantService(RestaurantRepository restaurantRepo, MenuItemRepository itemRepo) {
        this.restaurantRepo = restaurantRepo;
        this.itemRepo = itemRepo;
    }

    public Restaurant createRestaurant(Restaurant data) {
        return restaurantRepo.save(data);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.findAll();
    }

    // --- NEW LOGIC ---
    public MenuItem addMenuItem(Long restaurantId, MenuItem item) {
        Restaurant restaurant = restaurantRepo.findById(restaurantId)
                .orElseThrow(() -> new RuntimeException("Restaurant not found"));

        item.setRestaurant(restaurant); // The Link
        return itemRepo.save(item);     // The Save
    }
}