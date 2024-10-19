package com.cmc.evaluacion;

public class Prestamos {
	
	    private double montoPrestamo;
	    private double tasaInteresAnual;
	    private int plazoMeses;
	    private String cedulaCliente;
	    
		public Prestamos(double montoPrestamo, double tasaInteresAnual, int plazoMeses, String cedulaCliente) {
			this.montoPrestamo = montoPrestamo;
			this.tasaInteresAnual = tasaInteresAnual;
			this.plazoMeses = plazoMeses;
			this.cedulaCliente=cedulaCliente;
		}

		public String getCedulaCliente() {
			return cedulaCliente;
		}

		public void setCedulaCliente(String cedulaCliente) {
			this.cedulaCliente = cedulaCliente;
		}


		public double getMontoPrestamo() {
			return montoPrestamo;
		}

		public void setMontoPrestamo(double montoPrestamo) {
			this.montoPrestamo = montoPrestamo;
		}

		public double getTasaInteresAnual() {
			return tasaInteresAnual;
		}

		public void setTasaInteresAnual(double tasaInteresAnual) {
			this.tasaInteresAnual = tasaInteresAnual;
		}

		public int getPlazoMeses() {
			return plazoMeses;
		}

		public void setPlazoMeses(int plazoMeses) {
			this.plazoMeses = plazoMeses;
		}

		public void mostrarPrestamo() {
	        System.out.println("Monto: " + this.montoPrestamo + ", Plazo: " + this.tasaInteresAnual + " meses, Interés: " + this.plazoMeses + "%");
	    }
}
