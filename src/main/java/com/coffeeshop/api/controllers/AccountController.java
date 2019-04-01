package com.coffeeshop.api.controllers;

import com.coffeeshop.api.dao.AccountDAO;
import com.coffeeshop.api.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountDAO accountDAO;

    @GetMapping("/accounts" )
    public List<Account> getAccounts(){
        return accountDAO.findAll();
    }
}
