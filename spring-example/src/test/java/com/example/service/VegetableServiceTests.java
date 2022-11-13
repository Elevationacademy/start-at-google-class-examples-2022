package com.example.service;

import com.example.entity.Vegetable;
import com.example.repository.VegetableRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

    @SpringBootTest
public class VegetableServiceTests {
    @Autowired
    VegetableService vegetableService;
    @Test
    void getAll(){
        List<Vegetable> vegetables = vegetableService.listVegetables();

        assertTrue(vegetables.size()>0);
    }

}
