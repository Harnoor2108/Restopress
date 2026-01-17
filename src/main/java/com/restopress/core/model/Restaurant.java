package com.restopress.core.model;

// --- CRITICAL IMPORTS START ---
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
// --- CRITICAL IMPORTS END ---

@Entity // <--- This is the "Sticker" Spring is looking for
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    @jakarta.persistence.OneToMany(mappedBy = "restaurant", cascade = jakarta.persistence.CascadeType.ALL)
    private List<MenuItem> menuItems;

    // Getter and Setter for the list
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // --- Getters and Setters ---
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}