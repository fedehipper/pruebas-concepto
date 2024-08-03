package com.example.demo;

import java.io.IOException;


public class DemoApplication {

    public static void main(String[] args) throws IOException, Exception {
        FormularioPdf.agregarFormulario();
        FormularioPdf.agregarValoresAlFormulario();
        Prueba.prueba();
    }

}
