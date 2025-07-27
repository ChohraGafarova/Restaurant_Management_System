package com.restaurant.restaurantmanagementsystem.service;

import com.restaurant.restaurantmanagementsystem.dto.OrderDTO;
import com.restaurant.restaurantmanagementsystem.mapper.OrderMapper;
import com.restaurant.restaurantmanagementsystem.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService{

    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    private final OrderRepository repo;
    private final OrderMapper mapper;

    public OrderService(OrderRepository repo, @Qualifier("orderMapper") OrderMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public List<OrderDTO> getAllOrders() {
        logger.info("Fetching all orders.");
        return repo.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }
}
