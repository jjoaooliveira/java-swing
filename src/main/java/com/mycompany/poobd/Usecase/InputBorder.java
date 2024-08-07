package com.mycompany.poobd.Usecase;

import java.util.ArrayList;

public interface InputBorder {
    boolean saveData(InputVehicleData vehicle);
    boolean updateData(InputVehicleData vehicle);
    ArrayList<String[]> searchByModel(String model);
    ArrayList<String[]> searchAll();
    boolean delete(Integer id);
}
