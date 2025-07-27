package com.restaurant.restaurantmanagementsystem.dto;

import lombok.*;

import java.security.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Integer orderId;
    private Integer customerId;
    private Integer employeeId;
    private Timestamp orderDate;
    private Double totalAmount;


}