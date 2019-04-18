package com.coffeeshop.api.services;

import com.coffeeshop.api.domain.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BeanService {
    List<Bean> getAllBeans();
    Optional<Bean> getBean(String beanId);
    boolean save(Bean bean);
    Bean update(Bean bean);

}
