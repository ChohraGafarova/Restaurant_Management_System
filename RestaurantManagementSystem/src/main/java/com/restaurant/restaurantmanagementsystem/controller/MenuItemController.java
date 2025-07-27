package com.restaurant.restaurantmanagementsystem.controller;

import com.restaurant.restaurantmanagementsystem.dto.MenuItemDTO;
import com.restaurant.restaurantmanagementsystem.service.MenuItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuItemController {
    private final MenuItemService service;

    public MenuItemController(MenuItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<MenuItemDTO> getAll() {
        return service.getAllMenuItems();
    }

    @GetMapping("/{id}")
    public MenuItemDTO getById(@PathVariable int id) {
        return service.getMenuItemById(id);
    }

    @PostMapping
    public MenuItemDTO create(@RequestBody MenuItemDTO dto) {
        return service.addMenuItem(dto);
    }

    @PutMapping
    public MenuItemDTO update(@RequestBody MenuItemDTO dto) {
        return service.updateMenuItem(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteMenuItem(id);
    }
}

