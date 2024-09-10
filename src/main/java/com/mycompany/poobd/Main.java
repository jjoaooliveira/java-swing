package com.mycompany.poobd;

import com.mycompany.poobd.Controller.CarroController;
import com.mycompany.poobd.Database.CarroDAO;
import com.mycompany.poobd.Gui.Frame;
import com.mycompany.poobd.Services.CarroService;

public class Main {

    public static void main(String... args) {
        Frame frame = new Frame(new CarroController(new CarroService(new CarroDAO())));
        frame.main();
    }
}
