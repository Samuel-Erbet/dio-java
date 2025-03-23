package com.samuel.DesafioControleFluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

class ArgumentoIllegal extends Exception{
    public ArgumentoIllegal(String erro){
        super(erro);
    }
}

public class DesafioControleFluxo {

    public static void contar(int inicio, int fim) throws ArgumentoIllegal{

        if (inicio>fim) {
            throw new ArgumentoIllegal("argumento inválido");
        }

        for(int i  = inicio; i <= fim ; i++){
            System.out.println("imprimindo o número: "+i);
        
    }

        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int inicio;
            int fim;
            
            System.out.println("insira o primeiro parâmetro");
            inicio = scanner.nextInt();
            
            System.out.println("insira o próximo parâmetro");
            fim = scanner.nextInt();
                    
            
                contar(inicio, fim);
        } catch (ArgumentoIllegal e) {
            System.out.println("argumento inválido");
        
        } catch (InputMismatchException erro1){
            System.out.println("erro insira um numero não um caractere");
        }

        finally{
            scanner.close();
        }
}
}
