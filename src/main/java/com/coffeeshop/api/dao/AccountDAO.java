package com.coffeeshop.api.dao;


import com.coffeeshop.api.domain.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountDAO  extends MongoRepository<Account, String> {


}