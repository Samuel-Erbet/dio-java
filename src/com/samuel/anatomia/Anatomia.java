package com.samuel.anatomia;

public class Anatomia {

    //declaração de método com retorno
     public static int calculo(int numero1, int numero2){
        int r =numero1 + numero2; 
        return r;
    }

    //declaração de método com retorno
    public static String juntar(String nome, String sobrenome){
        return nome.concat(" ").concat(sobrenome);
    }


    //declaração de método sem retorno
    public static void unir(String n, String s){
        System.out.println("esse é o void ".concat(n).concat(" ").concat(s));
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int n1 =1;
        int n2 =2; 
        String nome ="samuel"; 
        String sobrenome = "erbet";

        int res= calculo(n1,n2);
        String nomeTodo= juntar(nome,sobrenome);
        System.out.println(res);
        System.out.println(nomeTodo);
        unir(nome, sobrenome);

    }
}
