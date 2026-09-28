package com.example;

public class Corridore implements Runnable{
    private String nome;

    public Corridore(String nome){
        this.nome=nome;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(this.nome+" ha fatto il passo "+ i);
            try {
                Thread.sleep((int)Math.random()*(800-200)+200);
            } catch (Exception e) {
                System.out.println("error");
            }
            
        }
        System.out.println(this.nome+" è arrivato al traguardo");
    }
}
