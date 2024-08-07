package com.mycompany.poobd.Controller;

import java.util.ArrayList;

public interface IController {
    boolean saveInputData(String[] rawInputData);
    boolean updateInputData(String id, String[] rawInputData);
    ArrayList<String> searchByModel(String model);
    ArrayList<String[]> searchAll();
}
