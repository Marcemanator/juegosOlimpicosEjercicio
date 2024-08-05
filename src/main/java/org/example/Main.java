package org.example;

//inicio
//Clase eventos
        //String Evento
        //Crer un arraylist con todos los eventos que se pueden añadir

//Clase Participantes
        //String nombreParticipante ,String pais,String evento



//Simular eventos de manera aleatoria
    // selección aleatoria de eventos
//Asignación de medallas en base a los ganadores del evento
//Mostrar  los ganadores de cada evento
//Mostrar ranking de paises por medallas ganadas
//Fin de programa


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Participantes> Participanteslist=new ArrayList<>();
        Eventos eve=new Eventos();
        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.println("Elige una de las 4 opciones :");
        System.out.println("1-Inserta un evento");
        System.out.println("2-Inserta un participante");
        System.out.println("3-pasa a los eventos");
        System.out.println("4-crea un archivo con los ganadores y el medallero");


            int opcion = 0;
            try {
                opcion = scan.nextInt();
                scan.nextLine(); // Clear the newline character from the input buffer
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingresa un número.");
                scan.nextLine(); // Clear the invalid input
                continue;
            }
            switch(opcion){
            case 1:
                System.out.println("inserta el nombre del evento");
                String eva = scan.nextLine();
                eve.creacioneventos(eva);

                break;


            case 2:
                String nombre="";
                String pais="";
                String evento = "";
                Participantes part=new Participantes( evento, pais, nombre);
                System.out.println("Introduce el nombre del participante.. ");
                 nombre = scan.nextLine();
                 part.setNombre(nombre);
                 System.out.println("Introduce el nombre del pais.. ");
                 pais = scan.nextLine();
                 part.setPais(pais);

                System.out.println("Introduce el evento.. ");
                 evento = scan.nextLine();
                 part.setEvento(evento);
                 Participanteslist.add(part);
                for(Participantes i:Participanteslist){
                    System.out.println("Nombre: "+" "+i.getNombre()+" "+"Pais: "+" "+i.getPais()+" "+"Evento: "+" "+i.getEvento());
                };
                break;

            case 3:
                System.out.println("Estos son los eventos registrados");
                for(String e: eve.getEventos())
                    System.out.println(e);


                break;
            case 4:
                System.out.println("Saliendo......");
                scan.close();
                return;
            default:
                System.out.println("Introduce otro numero por favor");

            }

        }

    }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
