package com.restaurant.restaurantmanagementsystem.mapper;

import com.restaurant.restaurantmanagementsystem.dto.WorkerDTO;
import com.restaurant.restaurantmanagementsystem.entity.WorkerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WorkerMapper {
    WorkerDTO toDto(WorkerEntity worker);
    WorkerEntity toEntity(WorkerDTO dto);
}
