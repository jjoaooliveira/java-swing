package com.mycompany.poobd.Controller;

import com.mycompany.poobd.Usecase.InputVehicleData;
import com.mycompany.poobd.Usecase.InputBorder;

import java.util.ArrayList;

public class CarroController implements IController {
    private InputBorder inputBorder;

    public CarroController(InputBorder inputBorder) {
        this.inputBorder = inputBorder;
    }

    @Override
    public boolean saveInputData(String[] rawInputData) {
        InputVehicleData vehicle = new InputVehicleData(rawInputData);
        return inputBorder.saveData(vehicle);
    }

    @Override
    public boolean updateInputData(String id, String[] rawInputData) {
        Integer convertedId = Integer.valueOf(id);
        InputVehicleData vehicle = new InputVehicleData(convertedId, rawInputData);
        return inputBorder.updateData(vehicle);
    }

    @Override
    public ArrayList<String[]> searchByModel(String model) {
        return inputBorder.searchByModel(model);
    }

    @Override
    public ArrayList<String[]> searchAll() {
        return inputBorder.searchAll();
    }

    @Override
    public boolean delete(String id) {
        Integer convertedId = Integer.valueOf(id);
        return inputBorder.delete(convertedId);
    }
}
