package com.restaurant.restaurantmanagementsystem.mapper;

import com.restaurant.restaurantmanagementsystem.dto.MenuItemDTO;
import com.restaurant.restaurantmanagementsystem.entity.MenuItemEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MenuItemMapper {
    MenuItemDTO toDto(MenuItemEntity item);
    MenuItemEntity toEntity(MenuItemDTO dto);

}
