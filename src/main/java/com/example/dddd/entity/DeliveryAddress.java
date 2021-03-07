package com.example.dddd.entity;

import lombok.Data;

@Data
public class DeliveryAddress {
    public String streetName;
    public String streetNumber;
    public String town;
    public Object district;
    public Object building;
    public String formattedAddress;
    public double latitude;
    public double longitude;
}