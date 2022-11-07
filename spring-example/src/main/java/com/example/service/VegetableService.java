package com.example.service;

import com.example.entity.Vegetable;
import com.example.repository.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableService {
    @Autowired
    private VegetableRepository vegetableRepository;

    public List<Vegetable> listVegetables(){
        return vegetableRepository.findAll();
    }

    public void deleteByType(Vegetable.Type type){
        vegetableRepository.deleteByType(type);
    }

    public Vegetable add(Vegetable veg){
        return vegetableRepository.add(veg);
    }


}
