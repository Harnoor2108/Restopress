package com.restopress.core.repository;

import com.restopress.core.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

// We extend JpaRepository.
// This is like hiring a Manager who already knows how to do everything.
// We don't write ANY code here. Spring writes the SQL for us automatically.

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
}
