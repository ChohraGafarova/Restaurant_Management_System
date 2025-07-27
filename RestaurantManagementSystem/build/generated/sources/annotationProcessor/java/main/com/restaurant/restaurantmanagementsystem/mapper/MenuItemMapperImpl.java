package com.restaurant.restaurantmanagementsystem.mapper;

import com.restaurant.restaurantmanagementsystem.dto.MenuItemDTO;
import com.restaurant.restaurantmanagementsystem.entity.MenuItemEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-09T20:46:05+0400",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.13.jar, environment: Java 17.0.14 (Amazon.com Inc.)"
)
@Component
public class MenuItemMapperImpl implements MenuItemMapper {

    @Override
    public MenuItemDTO toDto(MenuItemEntity item) {
        if ( item == null ) {
            return null;
        }

        MenuItemDTO menuItemDTO = new MenuItemDTO();

        return menuItemDTO;
    }

    @Override
    public MenuItemEntity toEntity(MenuItemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MenuItemEntity menuItemEntity = new MenuItemEntity();

        return menuItemEntity;
    }
}
