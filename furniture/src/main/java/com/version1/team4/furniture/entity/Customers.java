package com.version1.team4.furniture.entity;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="customers")
public class Customers implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private int Customer_Id;

    @Column(name = "name")
    private String Name;
    @Column(name = "email")
    private String Email;
    public Customers() {
    }

    public Customers(String name, String email) {
        Name = name;
        Email = email;
    }

    public int getCustomer_Id() {
        return Customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        Customer_Id = customer_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
