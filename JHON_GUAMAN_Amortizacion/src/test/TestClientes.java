package test;

import com.cmc.evaluacion.Cliente;
import com.cmc.evaluacion.Banco;

public class TestClientes {
    public static void main(String[] args) {
        Banco banco = new Banco();
        
    
        Cliente cliente1 = new Cliente("1234567890", "Juan", "Perez");
        banco.registrarCliente(cliente1);
        System.out.println(cliente1.mostrarCliente());


        Cliente cliente2 = new Cliente("0987654321", "Maria", "Lopez");
        banco.registrarCliente(cliente2);
        System.out.println(cliente2.mostrarCliente());


        Cliente cliente3 = new Cliente("1234567890", "Pedro", "Gomez");
        banco.registrarCliente(cliente3);


        Cliente clienteBuscado = banco.buscarCliente("1234567890");
        if (clienteBuscado != null) {
            System.out.println("Cliente ya registrado: " + clienteBuscado.mostrarCliente());
        } else {
            System.out.println("Cliente no registrado");
        }
    }
}

  

