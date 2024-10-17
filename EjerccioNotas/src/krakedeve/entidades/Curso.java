package krakedeve.entidades;

import java.util.ArrayList;

public class Curso {
    private ArrayList<Estudiante> estudiantes;

    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    public Estudiante buscarEstudiantePorCedula(String cedula) {
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante elementoEstudiante = estudiantes.get(i);
            if (elementoEstudiante.getCedula().equals(cedula)) {
                return elementoEstudiante;
            }
        }
        return null;
    }

    public void matricularEstudiantes(Estudiante estudiante) {
        if (buscarEstudiantePorCedula(estudiante.getCedula()) == null) {
            estudiantes.add(estudiante);
            System.out.println("Estudiante matriculado correctamente.");
        } else {
            System.out.println("El estudiante ya está matriculado en el curso.");
        }
    }

    public double calcularPromedioCurso() {
        if (estudiantes.isEmpty()) {
            return 0;
        }
        double sumaPromedios = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante elementoEstudiante = estudiantes.get(i);
            sumaPromedios += elementoEstudiante.calcularPromedioNotasEstudiante();
        }
        return sumaPromedios / estudiantes.size();
    }

    public void mostrar() {
        System.out.println("Curso [Estudiantes]");
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante elementoEstudiante = estudiantes.get(i);
            elementoEstudiante.mostrar();
        }
    }

}