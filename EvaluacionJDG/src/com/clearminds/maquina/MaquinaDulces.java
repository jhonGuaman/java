package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		this.celda1 = new Celda(codigo1);
		this.celda2 = new Celda(codigo2);
		this.celda3 = new Celda(codigo3);
		this.celda4 = new Celda(codigo4);
	}

	public void mostrarConfiguracion() {
		System.out.println("celda 1:" + this.celda1.getCodigo());
		System.out.println("celda 2:" + this.celda2.getCodigo());
		System.out.println("celda 3:" + this.celda3.getCodigo());
		System.out.println("celda 4:" + this.celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (codigo == celda1.getCodigo()) {
			return celda1;
		} else if (codigo == celda2.getCodigo()) {
			return celda2;
		} else if (codigo == celda3.getCodigo()) {
			return celda3;
		} else if (codigo == celda4.getCodigo()) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}
	
	public void mostrarProductos() {
        mostrarProductoDeCelda(celda1);
        mostrarProductoDeCelda(celda2);
        mostrarProductoDeCelda(celda3);
        mostrarProductoDeCelda(celda4);
    }
	
	private void mostrarProductoDeCelda(Celda celda) {
        Producto producto = celda.getProducto();
        if (producto != null) {
            System.out.println("Código Celda: " + celda.getCodigo());
            System.out.println("Stock: " + celda.getStock());
            System.out.println("Nombre Producto: " + producto.getNombre());
            System.out.println("Precio Producto: " + producto.getPrecio());
        } else {
            System.out.println("Código Celda: " + celda.getCodigo() + " (Sin producto)");
        }
    }
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null) {
            return celda.getProducto();
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
        if (celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
            return celda1;
        } else if (celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto)) {
            return celda2;
        } else if (celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto)) {
            return celda3;
        } else if (celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto)) {
            return celda4;
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
            mostrarProductos(); 
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
}
