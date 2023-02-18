package com.example.Microservices.Controller;


import com.example.Microservices.Data.Productrepo;
import com.example.Microservices.Model.Entity;
import com.example.Microservices.ProductServiceApplication;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productservice")
public class Controller {

    @Autowired
    Productrepo productrepo;

    @GetMapping("/")
    public String welcome(){
        return "Product Service";
    }

    @PostMapping(value = "/addproduct")
    public String addproduct(@RequestBody Entity entity){
        productrepo.save(entity);
        return "Product saved succesfully";
    }


    @GetMapping(value = "/products")
    public List<Entity>  Products (){
        return productrepo.findAll();
    }



}
