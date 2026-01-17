package com.restopress.core.repository;

import com.restopress.core.model.MenuItem;
import com.restopress.core.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
