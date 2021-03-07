package com.example.dddd.entity;

@lombok.Data
public class Data {
    public String type;
    public String id;
    public Attributes attributes;
    public Relationships relationships;
    public Links links;
}