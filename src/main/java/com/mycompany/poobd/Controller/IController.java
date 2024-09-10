package com.mycompany.poobd.Controller;

import java.util.ArrayList;

public interface IController {
    Response saveData(String model, String color, String year);
    Response updateData(String id, String model, String color, String year);
    Response searchByModel(String model);
    Response searchAll();
    Response delete(String id);
}
