package com.samuel.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Array {
     public static void main(String[] args) {

        // esse é um arrayList ele parece com o array comum porem ele pode ser 
        // incrementado durante a execução do programa

        ArrayList<Integer> array = new ArrayList<>();
        String opcao = "false";
        Scanner scan = new Scanner(System.in);


        System.out.println("digite true se quiser parar");


        while (!"true".equals(opcao)) { 
            opcao =scan.nextLine();
            
            if ("true".equals(opcao)) {
                break;
            } else {

                int valor = scan.nextInt();
                array.add(valor);

                System.out.println("digite true se quiser parar");

                opcao =scan.nextLine();

                if("true".equals(opcao)){
                    break;
                }
            }
            

        }

        System.out.println("seus numeros aqui:");
        
        for (int z = 0; z < array.size(); z++) {
            System.out.println(array.get(z));
            
        }
        
        scan.close();
    }
}
