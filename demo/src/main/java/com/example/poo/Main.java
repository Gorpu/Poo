package com.example.poo;

public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("Bic", "Azul", 10, 10, true);
        Caneta caneta2 = new Caneta("Faber Castel", "Preta", 10, 10, false);
        
        caneta1.status();
        caneta2.status();
    }
}