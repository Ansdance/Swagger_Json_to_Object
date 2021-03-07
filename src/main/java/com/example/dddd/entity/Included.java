package com.example.dddd.entity;

import lombok.Data;

@Data
public class Included {
    public String type;
    public String id;
    public Attributes attributes;
    public Relationships relationships;
    public Links links;
}