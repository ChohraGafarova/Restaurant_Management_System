package com.restaurant.restaurantmanagementsystem.controller;

import com.restaurant.restaurantmanagementsystem.dto.WorkerDTO;
import com.restaurant.restaurantmanagementsystem.service.WorkerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/workers")
public class WorkerController {
    private final WorkerService service;

    public WorkerController(WorkerService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkerDTO> getAll() {
        return service.getAllWorkers();
    }

    @PostMapping
    public WorkerDTO add(@RequestBody WorkerDTO dto) {
        return service.addWorker(dto);
    }
}
