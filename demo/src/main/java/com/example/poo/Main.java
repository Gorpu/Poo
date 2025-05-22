package com.example.poo;

public class Main {
    public static void main(String[] args) {
        Notebook notebookDell = new Notebook();
        
        notebookDell.marca = "Dell";
        notebookDell.modelo = "Inspiron";
        notebookDell.armazenamento = 500;
        notebookDell.camera = true;
        notebookDell.ram = 12;
        notebookDell.bateria = 1200;
        notebookDell.upgrade();

        notebookDell.novoModelo();
        
    }
}