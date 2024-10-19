package entidades;

import java.util.ArrayList;

public class Naipe {
    private ArrayList<Numero> numerosPosibles;
    private ArrayList<Carta> cartas;
    private String estado;

    public Naipe() {
        numerosPosibles = new ArrayList<>();
        cartas = new ArrayList<>();
        estado = "N"; 

        numerosPosibles.add(new Numero("A", 11));
        for (int i = 2; i <= 10; i++) {
            numerosPosibles.add(new Numero(String.valueOf(i), i));
        }
        numerosPosibles.add(new Numero("J", 10));
        numerosPosibles.add(new Numero("Q", 10));
        numerosPosibles.add(new Numero("K", 10));


        Palos palos = new Palos();
        String[] todosLosPalos = {palos.getCorazonRojo(), palos.getCorazonNegro(), palos.getDiamante(), palos.getTrebol()};

        for (Numero numero : numerosPosibles) {
            for (String palo : todosLosPalos) {
                Carta carta = new Carta(numero.getValor(), palo);
                cartas.add(carta);
            }
        }
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public ArrayList<Carta> barajar() {
        ArrayList<Carta> auxiliar = new ArrayList<>();
        String[] estados = new String[cartas.size()]; // Arreglo para mantener el estado de cada carta

        for (int i = 0; i < cartas.size(); i++) {
            estados[i] = "N";
        }

        for (int i = 0; i < 100; i++) {
            int posicion = Random.obtenerPosicion();
            Carta cartaSeleccionada = cartas.get(posicion);


            if (estados[posicion].equals("N")) {
                auxiliar.add(cartaSeleccionada);
                estados[posicion] = "C"; 
            }
        }

        for (int i = 0; i < cartas.size(); i++) {
            if (estados[i].equals("N")) {
                auxiliar.add(cartas.get(i));
                estados[i] = "C";
            }
        }

        return auxiliar;
    }
}

