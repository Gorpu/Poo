package com.example.poo;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Preta";
        c1.ponta = 0.8f;
        c1.carga = 10;
        c1.modelo = "Bic";
        c1.tampar();
        c1.rabiscar();
        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "Castel";
        c2.cor = "Marron";
        c2.status();

    }
}