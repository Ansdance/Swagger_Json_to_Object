package com.example.dddd.entity;

import java.util.List;

@lombok.Data
public class Root {
    public List<Data> data;
    public List<Included> included;
    public Meta meta;
}
