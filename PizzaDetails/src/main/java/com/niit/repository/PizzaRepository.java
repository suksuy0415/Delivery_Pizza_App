package com.niit.repository;

import com.niit.domain.Pizza;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PizzaRepository extends MongoRepository<Pizza,String> {




}
