package com.restaurant.restaurantmanagementsystem.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WorkerDTO {

    private Integer id;
    private String name;
    private String position;
    private double salary;
    private int workHours;
    private Date hireDate;


}
