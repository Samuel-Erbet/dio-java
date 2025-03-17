package com.samuel.smarttv;

public class SmartTv{
    private boolean ligada = false;
    private int canal;
    private int volume;
    

    public SmartTv(boolean ligada,int canal,int volume){
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }



    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getLigada(){
        return ligada;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    
    
    public boolean ligar_desliga(){
        return ligada != true;
    }

    public int aumentar_volume(){
        return volume+=1;
    }


    public int diminuir_volume(){
        return volume-=1;
    }


    public int mudar_canal(int num){
        if (num == 0) {
            return canal+=1;
        } else {
            return num;
        }
    }


    
}