package com.example.poo;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        //c1.ponta = 0.2f;
        c1.carga = 9;
        c1.tampar();
        c1.rabiscar("Olá mundo");
        c1.status();
    }
}