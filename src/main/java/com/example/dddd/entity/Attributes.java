package com.example.dddd.entity;

import lombok.Data;

@Data
public class Attributes {
    public String code;
    public int totalPrice;
    public String paymentMode;
    public long plannedDeliveryDate;
    public long creationDate;
    public boolean isKaspiDelivery;
    public String deliveryMode;
    public DeliveryAddress deliveryAddress;
    public boolean signatureRequired;
    public boolean preOrder;
    public String state;
    public long approvedByBankDate;
    public String status;
    public Customer customer;
    public int deliveryCost;
    public int quantity;
    public int entryNumber;
    public int basePrice;
}