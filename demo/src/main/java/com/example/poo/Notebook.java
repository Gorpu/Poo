package com.example.poo;

public class Notebook {
    String marca;
    String modelo;
    int bateria;
    int armazenamento;
    boolean camera;
    int ram;

    void novoModelo () {
        System.out.println("________________________________");
        System.out.println("Novo Notebook");
        System.out.println("Marca: "+this.marca);
        System.out.println("Armazenamento: "+this.armazenamento);
        System.out.println("Bateria: " +this.bateria);
        System.out.println("Armazenamento: " +this.armazenamento);
        System.out.println("Camera: " +this.camera);
        System.out.println("Ram: " +this.ram);
        System.out.println("________________________________");
    }
    void upgrade () {
        this.ram+=4;
    }
}
