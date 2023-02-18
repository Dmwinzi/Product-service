package com.example.Microservices.Data;

import com.example.Microservices.Model.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface Productrepo extends JpaRepository<Entity,Long> {



}
