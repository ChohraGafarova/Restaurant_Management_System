package com.restaurant.restaurantmanagementsystem.service;

import com.restaurant.restaurantmanagementsystem.dto.MenuItemDTO;
import com.restaurant.restaurantmanagementsystem.entity.MenuItemEntity;
import com.restaurant.restaurantmanagementsystem.mapper.MenuItemMapper;
import com.restaurant.restaurantmanagementsystem.repository.MenuItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuItemService {

    private static final Logger logger = LoggerFactory.getLogger(MenuItemService.class);

    private final MenuItemRepository repository;
    private final MenuItemMapper mapper;

    public MenuItemService(MenuItemRepository repository, @Qualifier("menuItemMapper") MenuItemMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<MenuItemDTO> getAllMenuItems() {
        logger.info("Fetching all menu items.");
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    public MenuItemDTO getMenuItemById(int id) {
        logger.info("Fetching menu item with id: {}", id);
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }

    public MenuItemDTO addMenuItem(MenuItemDTO dto) {
        logger.info("Adding new menu item: {}", dto.getName());
        MenuItemEntity item = mapper.toEntity(dto);
        MenuItemEntity saved = repository.save(item);
        return mapper.toDto(saved);
    }

    public MenuItemDTO updateMenuItem(MenuItemDTO dto) {
        logger.info("Updating menu item with id: {}", dto.getId());
        MenuItemEntity updated = repository.save(mapper.toEntity(dto));
        return mapper.toDto(updated);
    }

    public void deleteMenuItem(int id) {
        logger.warn("Deleting menu item with id: {}", id);
        repository.deleteById(id);
    }
}
