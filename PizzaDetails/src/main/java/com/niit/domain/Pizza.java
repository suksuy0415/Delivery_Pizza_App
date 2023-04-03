package com.niit.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pizza {


    @Id
    private String userName;

    private String name;

    private String address;

    private String pizzaType;

    private int quantity;

    private int price;


    public Pizza(String userName, String name, String address, String pizzaType, int quantity, int price) {
        this.userName = userName;
        this.name = name;
        this.address = address;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        this.price = price;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", pizzaType='" + pizzaType + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
