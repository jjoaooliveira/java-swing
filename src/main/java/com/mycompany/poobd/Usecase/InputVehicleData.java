package com.mycompany.poobd.Usecase;

public class InputVehicleData {
    private Integer id;
    private String modelo;
    private String cor;
    private String ano;

    public InputVehicleData(Integer id, String[] data) {
        this.id = id;
        this.modelo = data[0];
        this.cor = data[1];
        this.ano = data[2];
    }

    public InputVehicleData(String[] data) {
        this.modelo = data[0];
        this.cor = data[1];
        this.ano = data[2];
    }
    
    public Integer getId() {
        return id;
    }
    
    public String getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }
}
