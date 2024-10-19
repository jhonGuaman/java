package servicios;

import java.util.ArrayList;

public class Jugadores {
    private ArrayList<String> jugadores;

    public Jugadores() {
        jugadores = new ArrayList<>();
    }

    // Getters y Setters para jugadores
    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    // Método para agregar un jugador
    public void agregarJugador(String nombre) {
        jugadores.add(nombre);
    }

    // Método para jugar
    public void jugar() {
        // Crear un ArrayList de tipo String con tres jugadores
        ArrayList<String> listaJugadores = new ArrayList<>();
        listaJugadores.add("Jugador 1");
        listaJugadores.add("Jugador 2");
        listaJugadores.add("Jugador 3");

        Juego juego = new Juego(listaJugadores);

        juego.entregarCartas(5);

        for (int i = 0; i < listaJugadores.size(); i++) {
            int total = juego.devolverTotal(i);
            System.out.println(listaJugadores.get(i) + " - Total: " + total);
        }

        String ganador = juego.determinarGanador();
        System.out.println("El ganador es: " + ganador);
    }
}


