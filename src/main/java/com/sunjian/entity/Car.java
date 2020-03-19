package com.sunjian.entity;

public class Car {
    private Integer id;
    private String brand;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(){
        System.out.println("创建了Car对象");
    }

    public Car(Integer id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
