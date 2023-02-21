package com.version1.team4.furniture.entity;

import jakarta.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="categories")
public class Categories implements Serializable {



    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="category_id")
    private int CategoryId;

    @Column(name="category_name") private String CategoryName;

    public Categories() {}

    public Categories(String n){
        CategoryName=n;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
}
