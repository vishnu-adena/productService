package com.adena.productservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    private String name;
    private String description;
    private Double price;
    private String imageUrl;

    // product : Cat
    //  1      : 1 one product has one Category
    //  M      : 1 one Category has many Products
    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;
}
