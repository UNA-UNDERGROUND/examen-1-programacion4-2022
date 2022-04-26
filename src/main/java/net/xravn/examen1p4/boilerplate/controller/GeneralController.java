package net.xravn.examen1p4.boilerplate.controller;


public class GeneralController {

    private GeneralController() {
    }

    private static GeneralController instance;

    public static GeneralController getInstance() {
        if (instance == null) {
            instance = new GeneralController();
        }
        return instance;
    }
}