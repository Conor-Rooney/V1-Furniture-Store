package com.version1.team4.furniture.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="products")
public class Products implements Serializable {



    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="product_id")
    private int ProductId;
    @Column(name="category_id")
    private int CategoryId;
    @Column(name="product_name") private String ProductName;
    @Column(name="product_colour") private String ProductColour;
    public Products() {}

    public Products(String n, String c){
        ProductName=n;
        ProductColour=c;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductColour() {
        return ProductColour;
    }

    public void setProductColour(String productColour) {
        ProductColour = productColour;
    }
}
