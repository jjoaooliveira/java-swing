package com.mycompany.poobd.Domain;

import com.mycompany.poobd.Services.VehicleDTO;

public class Vehicle {
    private Integer id;
    private String model;
    private String color;
    private String year;


    public Vehicle(VehicleDTO data) {
        if(data.id().isPresent()) {
            id = data.id().get();
        }
        model = data.model();
        color = data.color();
        year = data.year();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
