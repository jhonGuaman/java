package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
    private ArrayList<Contacto> contactos = new ArrayList<>();
    private ArrayList<Contacto> correctos = new ArrayList<>();
    private ArrayList<Contacto> incorrectos = new ArrayList<>();
    private Date fechaModificacion;

    public boolean agregarContacto(Contacto contacto) {
        if (buscarPorCedula(contacto.getCedula()) == null) {
            contactos.add(contacto);
            fechaModificacion = new Date();
            return true;
        }
        return false;
    }

    public Contacto buscarPorCedula(String cedula) {
        for (Contacto contacto : contactos) {
            if (contacto.getCedula().equals(cedula)) {
                return contacto;
            }
        }
        return null;
    }

    public String consultarUltimaModificacion() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return sdf.format(fechaModificacion);
    }

    public int contarPerdidos() {
        int perdidos = 0;
        for (int i = 0; i < contactos.size(); i++) {
            Contacto contacto = contactos.get(i);
            if (contacto.getDireccion() == null) {
                perdidos++;
            }
        }
        return perdidos;
    }

    public int contarFijos() {
        int fijos = 0;
        for (int i = 0; i < contactos.size(); i++) {
            Contacto contacto = contactos.get(i);
            ArrayList<Telefono> telefonos = contacto.getTelefonos(); // Cambiado para acceder a los teléfonos del contacto
            for (int j = 0; j < telefonos.size(); j++) {
                Telefono telefono = telefonos.get(j);
                if (telefono.getTipo().equals("Convencional") && telefono.getEstado().equals("C")) {
                    fijos++;
                }
            }
        }
        return fijos;
    }


    public void depurar() {
        for (int i = 0; i < contactos.size(); i++) {
            Contacto contacto = contactos.get(i);
            if (contacto.getDireccion() != null) {
                correctos.add(contacto);
            } else {
                incorrectos.add(contacto);
            }
        }
        contactos.clear();
    }

}
