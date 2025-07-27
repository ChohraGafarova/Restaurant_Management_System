package com.restaurant.restaurantmanagementsystem.mapper;

import com.restaurant.restaurantmanagementsystem.dto.WorkerDTO;
import com.restaurant.restaurantmanagementsystem.entity.WorkerEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-09T20:46:05+0400",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.13.jar, environment: Java 17.0.14 (Amazon.com Inc.)"
)
@Component
public class WorkerMapperImpl implements WorkerMapper {

    @Override
    public WorkerDTO toDto(WorkerEntity worker) {
        if ( worker == null ) {
            return null;
        }

        WorkerDTO workerDTO = new WorkerDTO();

        return workerDTO;
    }

    @Override
    public WorkerEntity toEntity(WorkerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        WorkerEntity workerEntity = new WorkerEntity();

        return workerEntity;
    }
}
