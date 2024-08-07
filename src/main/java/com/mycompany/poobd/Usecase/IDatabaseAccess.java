package com.mycompany.poobd.Usecase;

import java.util.ArrayList;

public interface IDatabaseAccess {
    boolean save(String modelo, String cor, String ano);
    boolean update(Integer id, String modelo, String cor, String ano);
    ArrayList<String[]> selectByModel(String model);
    ArrayList<String[]> selectAll();
    boolean delete(Integer id);
}
