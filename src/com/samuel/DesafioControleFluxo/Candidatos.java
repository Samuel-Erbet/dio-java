package com.samuel.DesafioControleFluxo;

import java.util.concurrent.ThreadLocalRandom;

public class Candidatos{

    static void selecionados(){
        String candidatos[] = {"calu","juninho","claudia","fernada" };

        for (Object i : candidatos) {
            System.out.println(i);
        }
    }

    static void candidatos(){
        String candidatos[] = {"calu","juninho","claudia","fernada","wellington","glauber"};
        
       int candidatos_escolhidos = 0;
       int candidato_atual = 0;

       while (candidatos_escolhidos<5  && candidato_atual < candidatos.length){
            String candidato = candidatos[candidato_atual];
            double salario = salario(); 
            if (salario <=2000) {
                System.out.println("o candidato "+candidato+" foi escolhido, pelo salario "+salario);
                candidatos_escolhidos++;
            } 
            candidato_atual++;
             
       }
    }

    public static double salario(){
        return ThreadLocalRandom.current().nextDouble(100.00, 4000.00);
    }

    public static void processoSeletivo(double sal_candidato){
        double salario_base = 2000.00;

        if (salario_base>sal_candidato) {
            
            System.out.println("ligar para o candidato");
        
        } else if (sal_candidato ==salario_base){
            
            System.out.println("ligar para o candidato com contra proposta");

        }else{

            System.out.println("aguardando resultado demais candidatos");
        }

    }
    public static void main(String[] args) {
        selecionados();
    }
}