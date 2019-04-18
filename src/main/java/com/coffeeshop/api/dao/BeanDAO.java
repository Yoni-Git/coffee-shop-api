package com.coffeeshop.api.dao;


import com.coffeeshop.api.domain.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BeanDAO  extends MongoRepository<Bean, String> {


}