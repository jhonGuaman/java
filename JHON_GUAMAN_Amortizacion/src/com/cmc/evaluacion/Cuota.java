package com.cmc.evaluacion;

public class Cuota {
    private int numero;
    private double cuota;
    private double capital;
    private double inicio;
    private double interes;
    private double abonoCapital;
    private double saldo;

    public Cuota(int numero, double cuota, double capital, double inicio, double interes, double abonoCapital, double saldo) {
        this.numero = numero;
        this.cuota = cuota;
        this.capital = capital;
        this.inicio = inicio;
        this.interes = interes;
        this.abonoCapital = abonoCapital;
        this.saldo = saldo;
    }
    
    public Cuota(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInicio() {
        return inicio;
    }

    public void setInicio(double inicio) {
        this.inicio = inicio;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getAbonoCapital() {
        return abonoCapital;
    }

    public void setAbonoCapital(double abonoCapital) {
        this.abonoCapital = abonoCapital;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String mostrarPrestamo() {
        return String.format("%d | %.2f | %.2f | %.2f | %.2f | %.2f | %.2f",
                numero, cuota, capital, inicio, interes, abonoCapital, saldo);
    }
}

