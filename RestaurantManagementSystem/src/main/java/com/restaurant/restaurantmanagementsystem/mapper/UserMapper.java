package com.restaurant.restaurantmanagementsystem.mapper;

import com.restaurant.restaurantmanagementsystem.dto.UserDTO;
import com.restaurant.restaurantmanagementsystem.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDto(UserEntity user);

}
