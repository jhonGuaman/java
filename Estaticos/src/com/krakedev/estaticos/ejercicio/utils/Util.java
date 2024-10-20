package com.krakedev.estaticos.ejercicio.utils;

public class Util {
    
    public static String formatearHora(int numero) {
        return (numero < 10 ? "0" : "") + numero; 
    }

   
    public static String formatearDia(int dia) {
        switch (dia) {
            case 0: return "Lunes";
            case 1: return "Martes";
            case 2: return "Miércoles";
            case 3: return "Jueves";
            case 4: return "Viernes";
            case 5: return "Sábado";
            case 6: return "Domingo";
            default: return "Día no válido";
        }
    }
}
