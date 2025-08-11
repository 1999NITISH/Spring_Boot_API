package com.learning.spring.FirstSpringBootApi.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

@JsonAnyGetter
@JsonAnySetter

public class Category {
    private long id;
    private String name;
    private double price;
    private String description;
}
