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

    private String quantity;

    private String price;


    public Pizza(String userName, String name, String address, String pizzaType, String quantity, String price) {
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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
