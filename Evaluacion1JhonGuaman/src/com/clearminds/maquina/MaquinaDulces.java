package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	public MaquinaDulces() {
        celdas = new ArrayList<>();
        saldo = 0.0;
    }
    
    public void agregarCelda(Celda codigo) {
        celdas.add(codigo);
    }

    public void mostrarConfiguracion() {
    	for (int i=0; i<celdas.size();i++) {
    		Celda elementocelda=celdas.get(i);
    		System.out.println("Celda "+(i+1)+": "+elementocelda.getCodigo());
    	}
    }
	
    public Celda buscarCelda(String codigo) {
    	Celda celdaEncontrada=null;
    	Celda elementoCelda=null;
    	for(int i=0;i<celdas.size();i++) {
    		elementoCelda=celdas.get(i);
    		if(elementoCelda.getCodigo().equals(codigo)) {
    			celdaEncontrada=elementoCelda;
    		}
    	}
    	return celdaEncontrada;
    }
    
    public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}
	
    
    public void mostrarProducto() {
        for (int i = 0; i < celdas.size(); i++) {
            Celda celda = celdas.get(i);
            Producto producto = celda.getProducto();
            if (producto != null) {
                System.out.println("Celda: " + celda.getCodigo()+" Stock: "+celda.getStock()+" Producto: " + producto.getNombre()+" Precio: " + producto.getPrecio());
            } else {
                System.out.println("Celda: " + celda.getCodigo() + " Stock: "+celda.getStock()+" Sin producto asignado");
            }
        }
    }
	
    public Producto buscarProductoEnCelda(String codigo) {
        for (int i = 0; i < celdas.size(); i++) {
            Celda celda = celdas.get(i);
            if (celda.getCodigo().equals(codigo)) {
                return celda.getProducto(); 
            }
        }
        return null; 
    }

    public double consultarPrecio(String codigoCelda) {
        Producto producto = buscarProductoEnCelda(codigoCelda);
        if (producto != null) {
            return producto.getPrecio();
        }
        return 0.0; 
    }

   
    public Celda buscarCeldaProducto(String codigoProducto) {
        
        for (int i = 0; i < celdas.size(); i++) {
            Celda celda = celdas.get(i); 
            if (celda.getProducto() != null && celda.getProducto().getCodigo().equals(codigoProducto)) {
                return celda; 
            }
        }
        return null; 
    }
    
    public void incrementarProducto(String codigoProducto, int cantidad) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        if (celdaEncontrada != null) {
            int nuevoStock = celdaEncontrada.getStock() + cantidad;
            celdaEncontrada.setStock(nuevoStock);
        }
    }

   
    public void vender(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getStock() > 0) {
            celda.setStock(celda.getStock() - 1);
            saldo += celda.getProducto().getPrecio();
            
        } else {
            System.out.println("No hay suficiente stock para vender o la celda no existe.");
        }
         
    }

    
    public double venderConCambio(String codigoCelda, double valorIngresado) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getStock() > 0) {
            double precioProducto = celda.getProducto().getPrecio();
            if (valorIngresado >= precioProducto) {
                
                celda.setStock(celda.getStock() - 1);
                saldo += precioProducto;
            
                double cambio = valorIngresado - precioProducto;
                return cambio;
            } else {
                System.out.println("El dinero ingresado no es suficiente para comprar el producto.");
            }
        } else {
            System.out.println("No hay suficiente stock para vender o la celda no existe.");
        }
        return 0.0; 
    }
    
    public ArrayList<Producto> buscarMenores(double limite) {
        ArrayList<Producto> productosMenores = new ArrayList<>();

        for (int i = 0; i < celdas.size(); i++) {
            Celda celda = celdas.get(i);
            Producto producto = celda.getProducto();

            if (producto != null && producto.getPrecio() <= limite) {
                productosMenores.add(producto);
            }
        }

        return productosMenores;
    }


    
	public ArrayList<Celda> getCeldas() {
		return celdas;
	}
	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
