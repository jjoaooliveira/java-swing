package com.mycompany.poobd.Services;

import com.mycompany.poobd.Domain.Vehicle;

import java.util.ArrayList;

public class CarroService implements InputBorder {
    private final IDatabaseAccess iDatabaseAccess;

    public CarroService(IDatabaseAccess iDatabaseAccess) {
        this.iDatabaseAccess = iDatabaseAccess;
    }

    @Override
    public void saveData(VehicleDTO data) {
        Vehicle newVehicle = new Vehicle(data);
        iDatabaseAccess.save(newVehicle);
    }

    @Override
    public ArrayList<String[]> searchByModel(String model) {
        if(model == null) {
            throw new NullPointerException("Modelo para busca está vazio.");
        }
        return iDatabaseAccess.selectByModel(model);
    }

    @Override
    public ArrayList<String[]> searchAll() {
       return iDatabaseAccess.selectAll();
    }

    @Override
    public void updateData(VehicleDTO data) {
        if(data.id().isEmpty()) {
            throw new NullPointerException("Identificador de registro vazio para atualização de informações.");
        }
        iDatabaseAccess.update(new Vehicle(data));
    }

    @Override
    public void delete(Integer id) {
        if(id == null) {
            throw new NullPointerException("Identificador de registro vazio para deleção.");
        }
        iDatabaseAccess.delete(id);
    }
}
