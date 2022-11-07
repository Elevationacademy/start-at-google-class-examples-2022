package com.example.repository;

import com.example.entity.Vegetable;
import com.example.service.VegetableService;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class VegetableRepository {
    private List<Vegetable> vegetables;

    public VegetableRepository(){
        vegetables=new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            vegetables.add(Vegetable.newRandomVegetable());
        }
    }

    public List<Vegetable> filterByType(Vegetable.Type type){
        return vegetables.stream().filter(veg -> veg.getType() == type).collect(Collectors.toList());
    }

    public void deleteByType(Vegetable.Type type){
        vegetables.removeAll(filterByType(type));
    }

    public Vegetable add(Vegetable veg){
        vegetables.add(veg);
        return veg;
    }

    public List<Vegetable> findAll(){
        return vegetables;
    }
}
