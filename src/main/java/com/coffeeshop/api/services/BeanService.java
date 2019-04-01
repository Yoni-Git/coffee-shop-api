package com.coffeeshop.api.controllers.services;

import com.coffeeshop.api.domain.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BeanService {
    List<Bean> getAllBeans();

}
