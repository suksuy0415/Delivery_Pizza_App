package com.niit.service;


import com.niit.domain.Pizza;
import com.niit.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService{


    private PizzaRepository pizzaRepository;

    @Autowired
    public PizzaServiceImpl(PizzaRepository pizzaRepository){this.pizzaRepository = pizzaRepository;}


    @Override
    public Pizza savePizzaDetails(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }


//    public List<Pizza> findallOrdersDetails() {
//        return pizzaRepository.findAll();
//    }
//
//    @Override
//    public Pizza getUserOrderDetails(String userName) {
//        return pizzaRepository.findById(userName).get();
//    }
//
//    @Override
//    public boolean deleteOrder(String userName) {
//        pizzaRepository.deleteById(userName);
//        return true;
//    }
}
