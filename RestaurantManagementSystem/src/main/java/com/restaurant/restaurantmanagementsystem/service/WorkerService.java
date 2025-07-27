package com.restaurant.restaurantmanagementsystem.service;

import com.restaurant.restaurantmanagementsystem.dto.WorkerDTO;
import com.restaurant.restaurantmanagementsystem.entity.WorkerEntity;
import com.restaurant.restaurantmanagementsystem.mapper.WorkerMapper;
import com.restaurant.restaurantmanagementsystem.repository.WorkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkerService {

    private static final Logger logger = LoggerFactory.getLogger(WorkerService.class);

    private final WorkerRepository repository;
    private final WorkerMapper mapper;

    public WorkerService(WorkerRepository repository, @Qualifier("workerMapper") WorkerMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<WorkerDTO> getAllWorkers() {
        logger.info("Fetching all workers.");
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    public WorkerDTO addWorker(WorkerDTO dto) {
        logger.info("Adding worker: {}", dto.getName());
        WorkerEntity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }
}
