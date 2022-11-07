package com.example.entity;

import java.util.concurrent.ThreadLocalRandom;

public class Vegetable {
    public enum Type{
        CUCUMBER, TOMATO, POTATO, LETTUCE
    }

    private Type type;
    private int count;
    private double weight;

    public Vegetable(){};
    private Vegetable(Type type, int count, double weight){
        this.type = type;
        this.count = count;
        this.weight=weight;
    }
    public static Vegetable newRandomVegetable(){
        return new Vegetable(
                Type.values()[ThreadLocalRandom.current().nextInt(Type.values().length)],
                ThreadLocalRandom.current().nextInt(1,10),
                ThreadLocalRandom.current().nextDouble(1,99)
        );

    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vegetable vegetable = (Vegetable) o;

        if (count != vegetable.count) return false;
        if (Double.compare(vegetable.weight, weight) != 0) return false;
        return type == vegetable.type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type != null ? type.hashCode() : 0;
        result = 31 * result + count;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "type=" + type +
                ", count=" + count +
                ", weight=" + weight +
                '}';
    }
}
