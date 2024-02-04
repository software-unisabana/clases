package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;
import co.edu.unisabana.clases.example.solid.service.EnvioMaterialAdmin;
import co.edu.unisabana.clases.example.solid.service.EnvioMaterialindus;
import co.edu.unisabana.clases.example.solid.service.EnvioMaterialinfo;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Estudiante("Daniel", "Informatica"),
                new Estudiante("Monica", "Administracion"),
                new Estudiante("Liliana", "Industrial")
        };
        verMateriasEstudiantes(listadoEstudiantes,new Informatica(),new administracion(),new industrial());
        EnvioMaterialAdmin material = new EnvioMaterialAdmin();
        material.enviarMaterialEstudianteAdmin(new Estudiante("Daniel", "Administracion"));
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes, Materias... materias) {
        for (Estudiante estudiante : estudiantes) {
            for (Materias materia : materias) {
                if (materia.ismajor(estudiante)) {
                    materia.mostarMaterias();
                    break;
                }
            }
        }
    }



    /* violates open close por el parte de muchos if statments que si uno queire adicionar otra carrera le va tocar editar el codigo
    que va en contra de open close
    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.carrera.equals("Informatica")) {
                System.out.println("Programacion, Arquitectura, Base de datos");
            }
            if (estudiante.carrera.equals("Administracion")) {
                System.out.println("Negocios, Administracion I, Historia de la Administracion");
            }
            if (estudiante.carrera.equals("Industrial")) {
                System.out.println("Procesos, Analitica de datos, Gestion de Calidad ");
            }
        }
    }
*/










}
