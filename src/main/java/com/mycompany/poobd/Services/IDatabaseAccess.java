package com.mycompany.poobd.Services;

import com.mycompany.poobd.Domain.Vehicle;

import java.util.ArrayList;

public interface IDatabaseAccess {
    void save(Vehicle vehicle);
    void update(Vehicle vehicle);
    ArrayList<String[]> selectByModel(String model);
    ArrayList<String[]> selectAll();
    void delete(Integer id);
}
