package org.example;

import java.util.ArrayList;
import java.util.List;


public class Eventos {
    private List <String> eventos;

    public Eventos() {
        this.eventos = new ArrayList<>();
    }


    public List <String> getEventos() {
        return eventos;
    }





    @Override
    public String toString() {
        return "Eventos{" +
                "evento='" + eventos + '\'' +
                '}';
    }

    public void creacioneventos(String evento){
        eventos.add(evento);

        }





    }

