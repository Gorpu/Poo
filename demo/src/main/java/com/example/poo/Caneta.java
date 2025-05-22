package com.example.poo;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;


    void status () {
        System.out.println("____________Caneta______________");
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Tampada: "+ this.tampada);
        System.out.println("________________________________");
        
    }

    public void rabiscar (String mensagem) {
        if (this.tampada == true){
            System.out.println("Destampe a caneta para proseguir.");
        }if (this.tampada == false) {
            System.out.println("Escreveu na tela: "+mensagem);
        }
    }

    //Esses metodos dão acesso ao atibuto tampada que é privado
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }

}
