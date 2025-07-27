package com.restaurant.restaurantmanagementsystem.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MenuItemDTO {

    private Integer id;
    private String name;
    private double price;
    private String category;


}