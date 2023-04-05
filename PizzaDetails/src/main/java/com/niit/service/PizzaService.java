package com.niit.service;

import com.niit.domain.Pizza;

import java.util.List;

public interface PizzaService {

    Pizza savePizzaDetails(Pizza pizza);
    List<Pizza> find();
//    List<Pizza> findallOrdersDetails();
//
//    Pizza getUserOrderDetails(String userName);
//    boolean deleteOrder(String userName);
}
