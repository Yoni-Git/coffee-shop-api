package com.coffeeshop.api.controllers;

import com.coffeeshop.api.services.BeanService;
import com.coffeeshop.api.domain.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bean")
public class BeanController {

        @Autowired
        BeanService beanService;

        @GetMapping
        public List<Bean> getBeans(){
            return beanService.getAllBeans();
        }
        @GetMapping("/{beanId}")
        public Optional<Bean> getBean(@PathVariable String beanId){
            return beanService.getBean(beanId);
        }
        @PostMapping
        public boolean createBean(@RequestBody Bean bean){
            return beanService.save(bean);
        }
        @PutMapping
        public  Bean updateBean(@RequestBody  Bean bean) {
            return beanService.update(bean);
         }
}


