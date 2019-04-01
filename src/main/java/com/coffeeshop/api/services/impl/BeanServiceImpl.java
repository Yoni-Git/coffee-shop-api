package com.coffeeshop.api.controllers.services.impl;

import com.coffeeshop.api.controllers.services.BeanService;
import com.coffeeshop.api.dao.BeanDAO;
import com.coffeeshop.api.domain.Bean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BeanServiceImpl  implements BeanService {

    @Autowired
    BeanDAO beanDAO;

    @Override
    public List<Bean> getAllBeans() {
        return  beanDAO.findAll();
    }
}
