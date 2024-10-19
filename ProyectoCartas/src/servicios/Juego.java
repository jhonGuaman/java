package servicios;

import entidades.Carta;
import entidades.Naipe;

import java.util.ArrayList;

public class Juego {
    private Naipe naipe;
    private ArrayList<ArrayList<Carta>> cartaJugadores;
    private ArrayList<Carta> naipeBarajado;
    private ArrayList<String> jugadores;

    public Juego(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
        naipe = new Naipe();
        cartaJugadores = new ArrayList<>();
        for (int i = 0; i < jugadores.size(); i++) {
            cartaJugadores.add(new ArrayList<>());
        }

        // Barajar el naipe y guardar el resultado
        naipeBarajado = naipe.barajar();
    }

    public void entregarCartas(int cartasPorJugador) {
        int jugadorActual = 0;

        // Repartir las cartas a los jugadores en orden
        for (int i = 0; i < cartasPorJugador * cartaJugadores.size(); i++) {
            Carta carta = naipeBarajado.get(i);
            cartaJugadores.get(jugadorActual).add(carta);

            // Pasar al siguiente jugador
            jugadorActual++;
            if (jugadorActual >= cartaJugadores.size()) {
                jugadorActual = 0;
            }
        }
    }

    public int devolverTotal(int jugadorId) {
        int sumaTotal = 0;

        for (int i = 0; i < cartaJugadores.get(jugadorId).size(); i++) {
            sumaTotal += cartaJugadores.get(jugadorId).get(i).getNumero();
        }

        return sumaTotal;
    }

    public String determinarGanador() {
        int idGanador = 0;
        int sumaGanador = devolverTotal(0);

        // Recorrer todos los jugadores para encontrar el que tiene mayor puntaje
        for (int i = 1; i < cartaJugadores.size(); i++) {
            int sumaActual = devolverTotal(i);
            if (sumaActual > sumaGanador) {
                sumaGanador = sumaActual;
                idGanador = i;
            }
        }

        // Retornar el nombre del jugador ganador
        return jugadores.get(idGanador);
    }
}
