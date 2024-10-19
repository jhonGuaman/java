package test;

import com.cmc.evaluacion.Prestamos;
import com.cmc.evaluacion.CalculadoraAmortizacion;

public class TestCalculadora {
    public static void main(String[] args) {
        Prestamos prestamo = new Prestamos(5000, 12, 12,"1243243");

        CalculadoraAmortizacion calculadora = new CalculadoraAmortizacion();
        calculadora.generarTabla(prestamo);
        calculadora.mostrarTabla();
    }
}
