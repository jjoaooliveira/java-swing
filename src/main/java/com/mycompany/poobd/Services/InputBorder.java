package com.mycompany.poobd.Services;

import java.util.ArrayList;

public interface InputBorder {
    void saveData(VehicleDTO vehicle);
    void updateData(VehicleDTO vehicle);
    ArrayList<String[]> searchByModel(String model);
    ArrayList<String[]> searchAll();
    void delete(Integer id);
}
