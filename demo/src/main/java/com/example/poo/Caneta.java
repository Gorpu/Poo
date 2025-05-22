package com.example.poo;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    //O metodo construtor tem o mesmo nome da classe
    public Caneta(String modeloCaneta, String corCaneta, float pontaCaneta, int cargaCaneta, boolean tampadaCaneta) {
        this.modelo = modeloCaneta;
        this.cor = corCaneta;
        this.ponta = pontaCaneta;
        this.carga = cargaCaneta;
        this.tampar();
    }

    //Coloca valor na variavel
    public void setModelo(String setModeloString){
        this.modelo = setModeloString;
    }

    //Dá acesso ao modelo que é String não pode ser void
    public String getModelo(){
        return this.modelo;
    }

    //Esses metodos dão acesso ao atibuto tampada que é privado
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }

    void status () {
        System.out.println("____________Caneta______________");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Tampada: "+ this.tampada);
        System.out.println("________________________________");
        
    }
}
