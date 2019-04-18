package com.coffeeshop.api.services.impl;

import com.coffeeshop.api.services.BeanService;
import com.coffeeshop.api.dao.BeanDAO;
import com.coffeeshop.api.domain.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BeanServiceImpl  implements BeanService {

    @Autowired
    BeanDAO beanDAO;

    @Override
    public List<Bean> getAllBeans() {
        return  beanDAO.findAll();
    }

    @Override
    public Optional<Bean> getBean(String beanId) {
        return beanDAO.findById(beanId);
    }

    @Override
    public boolean save( Bean bean) {
        beanDAO.save(bean);
        return true;
    }

    @Override
    public Bean update(Bean bean) {
        return beanDAO.save(bean);
    }

}
