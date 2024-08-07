package com.mycompany.poobd.Usecase;

import java.util.ArrayList;

public class CarroUseCase implements InputBorder {
    private final IDatabaseAccess iDatabaseAccess;

    public CarroUseCase(IDatabaseAccess iDatabaseAccess) {
        this.iDatabaseAccess = iDatabaseAccess;
    }

    @Override
    public boolean saveData(InputVehicleData vehicle) {
        if(vehicle.getModelo() == null) {
            return false;
        }

        if(vehicle.getAno() == null) {
            return false;
        }

        if(vehicle.getCor() == null) {
            return false;
        }

        return iDatabaseAccess.save(
                vehicle.getModelo(),
                vehicle.getCor(),
                vehicle.getAno()
        );
    }

    @Override
    public ArrayList<String> searchByModel(String model) {
        return model != null ? iDatabaseAccess.selectByModel(model) : new ArrayList<>();
    }

    @Override
    public ArrayList<String[]> searchAll() {
       return iDatabaseAccess.selectAll();
    }

    @Override
    public boolean updateData(InputVehicleData vehicle) {
        return iDatabaseAccess.update(
            vehicle.getId(),
            vehicle.getModelo(),
            vehicle.getCor(),
            vehicle.getAno()
        );
    }
}
