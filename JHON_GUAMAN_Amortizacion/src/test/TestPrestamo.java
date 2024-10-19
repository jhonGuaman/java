package test;

import com.cmc.evaluacion.Cliente;
import com.cmc.evaluacion.Prestamos;
import com.cmc.evaluacion.Banco;
import com.cmc.evaluacion.CalculadoraAmortizacion;

import java.util.ArrayList;

public class TestPrestamo {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("1234567890", "Juan", "Perez");
        Cliente cliente2 = new Cliente("0987654321", "Maria", "Lopez");

        banco.getClientes().add(cliente1);
        banco.getClientes().add(cliente2);
        
        CalculadoraAmortizacion calculadora = new CalculadoraAmortizacion();
        Prestamos prestamo1 = new Prestamos(4000, 12, 16, "1243243");
        banco.asignarPrestamo("1234567890", prestamo1);
        calculadora.generarTabla(prestamo1);
        
        Prestamos prestamo2 = new Prestamos(50000, 10, 11,"123243");
        banco.asignarPrestamo("1234567890", prestamo2);

        Prestamos prestamo3 = new Prestamos(2000, 8, 14,"1655243");
        banco.asignarPrestamo("0987654321", prestamo3);

        ArrayList<Prestamos> prestamosCliente1 = banco.buscarPrestamos("1234567890");
        if (prestamosCliente1 != null) {
            for (Prestamos prestamo : prestamosCliente1) {
                System.out.println(cliente1.mostrarCliente());
                prestamo.mostrarPrestamo();
            }
        }

        ArrayList<Prestamos> prestamosCliente2 = banco.buscarPrestamos("0987654321");
        if (prestamosCliente2 != null) {
            for (Prestamos prestamo : prestamosCliente2) {
                System.out.println(cliente2.mostrarCliente());
                prestamo.mostrarPrestamo();
            }
        }
    }
}

