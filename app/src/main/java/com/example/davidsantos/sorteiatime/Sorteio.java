package com.example.davidsantos.sorteiatime;

/**
 * Created by david.santos on 03/03/2018.
 */

public class Sorteio {

    int time;
    String texto;

    public Sorteio(int time, String texto) {
        this.time = time;
        this.texto = texto;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
