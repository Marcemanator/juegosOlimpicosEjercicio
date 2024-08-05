package org.example;

import java.util.ArrayList;

public class Participantes {

    String Nombre;
    String Pais;
    String evento;

    public Participantes(String evento, String pais, String nombre) {
        this.evento = evento;
        this.Pais = pais;
        this.Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Participantes{" +
                "Nombre='" + Nombre + '\'' +
                ", Pais='" + Pais + '\'' +
                ", evento='" + evento + '\'' +
                '}';
    }
    public void participantesJuegos(String Nombre,String Pais,String evento){




    }
}
