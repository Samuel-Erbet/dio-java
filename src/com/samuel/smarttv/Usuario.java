package com.samuel.smarttv;

public class Usuario {
    public static void main(String[] args) {
        boolean ligada = true;
        int canal = 1;
        int volume = 18;


        SmartTv televisao = new SmartTv(ligada, canal, volume);
        System.out.println("tv ligada: "+televisao.getLigada());
        System.out.println("tv ligada: "+televisao.ligar_desliga());
        System.out.println("volume atual: "+televisao.aumentar_volume());
        System.out.println("volume atual: "+televisao.diminuir_volume());
        System.out.println("canal atual: "+televisao.mudar_canal(canal));
        canal = 0;
        System.out.println("canal atual: "+televisao.mudar_canal(canal));
        

    }
}
