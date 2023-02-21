package com.version1.team4.furniture.entity;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="shopping_orders")
public class ShoppingOrders implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private int OrderId;
    @Column(name = "customer_id")
    private int CustomerId;

    @Column(name = "date")
    private String Date;

    public ShoppingOrders() {
    }

    public ShoppingOrders(String d) {
        Date = d;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
