package com.example.dddd.entity;

import lombok.Data;

@Data
public class Relationships {
    public User user;
    public Entries entries;
    public DeliveryPointOfService deliveryPointOfService;
    public Product product;
}