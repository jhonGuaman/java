package com.cmc.evaluacion;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraAmortizacion {

    private List<Cuota> tablaAmortizacion;

    public CalculadoraAmortizacion() {
        this.tablaAmortizacion = new ArrayList<>();
    }

    public void generarTabla(Prestamos prestamo) {
        double monto = prestamo.getMontoPrestamo();
        double tasaInteres = prestamo.getTasaInteresAnual() / 12; 
        int plazo = prestamo.getPlazoMeses();

        double cuota = calcularCuota(prestamo);

        double saldoPendiente = monto;
        for (int i = 1; i <= plazo; i++) {
            Cuota cuotaObj = new Cuota(i);
            double interesPeriodo = saldoPendiente * tasaInteres;
            double abonoCapital = cuota - interesPeriodo;
            saldoPendiente -= abonoCapital;

            // Ajuste para la última cuota
            if (i == plazo && Math.abs(saldoPendiente) > 0.02) {
                abonoCapital += saldoPendiente;
                saldoPendiente = 0;
            }

            cuotaObj.setCuota(cuota);
            cuotaObj.setInicio(saldoPendiente + abonoCapital); 
            cuotaObj.setInteres(interesPeriodo);
            cuotaObj.setAbonoCapital(abonoCapital);
            cuotaObj.setSaldo(saldoPendiente);

            tablaAmortizacion.add(cuotaObj);
        }
    }

    public double calcularCuota(Prestamos prestamo) {
        double monto = prestamo.getMontoPrestamo();
        double tasaInteres = prestamo.getTasaInteresAnual() / 12; 
        int plazo = prestamo.getPlazoMeses();

        return monto * (tasaInteres / (1 - Math.pow(1 + tasaInteres, -plazo)));
    }


    public void mostrarTabla() {
        for (Cuota cuota : tablaAmortizacion) {
            System.out.println(cuota.mostrarPrestamo());
        }
    }
}
