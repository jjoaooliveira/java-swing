package com.mycompany.poobd.Controller;

import com.mycompany.poobd.Services.InputBorder;
import com.mycompany.poobd.Services.VehicleDTO;
import java.util.List;
import java.util.Optional;

public class CarroController implements IController {
    private InputBorder inputBorder;

    public CarroController(InputBorder inputBorder) {
        this.inputBorder = inputBorder;
    }

    @Override
    public Response saveData(String model, String color, String year) {
        try {
            inputBorder.saveData(new VehicleDTO(Optional.ofNullable(null), model, color, year));
            return new Response("Operação concluída com sucesso.", null);
        } catch (NullPointerException e) {
            return new Response(e.getMessage(), null);
        }
    }

    @Override
    public Response updateData(String id, String model, String color, String year) {
        Integer convertedId = Integer.valueOf(id);
        VehicleDTO data = new VehicleDTO(Optional.of(convertedId), model, color, year);
        try {
            inputBorder.updateData(data);
            return new Response("Registro atualizado com sucesso.", null);
        } catch (NullPointerException e) {
            return new Response(e.getMessage(), null);
        }
    }

    @Override
    public Response searchByModel(String model) {
        try {
            List<String[]> list = inputBorder.searchByModel(model);
            return new Response(null, Optional.of(list));
        } catch (NullPointerException e) {
            return new Response(e.getMessage(), null);
        }
    }

    @Override
    public Response searchAll() {
        List<String[]> list = inputBorder.searchAll();
        return new Response(null, Optional.of(list));
    }

    @Override
    public Response delete(String id) {
        Integer convertedId = Integer.valueOf(id);
        try {
            inputBorder.delete(convertedId);
            return new Response("Registro deletado com sucesso.", null);
        } catch (NullPointerException e) {
            return new Response(e.getMessage(), null);
        }
    }
}
