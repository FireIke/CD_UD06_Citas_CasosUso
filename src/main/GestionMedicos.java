package src.main;

import java.util.ArrayList;
import java.util.List;

// Clase para manejar las consultas médicas
public class GestionMedicos {
    


    private List<Medico> medicos; // Calendario de citas

    public GestionMedicos (){
        medicos = new ArrayList<Medico>();
    }

    // TODO: Método para añadir un medico a la lista 
    public void addMedico(Medico medico) {
        medicos.add(medico);
    }
    // TODO: Método para listar los medicos de la aplicaicón
    public void listMedicos() {
        for (int i = 0; i < medicos.size(); i++){
            System.out.println(medicos.get(i));
        }
    }
    // Método para buscar especialistas por especialidad
    public void buscarEspecialistas(String especialidad) {
        // Lógica para buscar especialistas por especialidad
        System.out.println("Buscar especialistas en " + especialidad);
    }

    // Método para ver recetas médicas
    public void verRecetas(String paciente) {
        // Lógica para ver las recetas médicas del paciente
        System.out.println("Ver recetas médicas de " + paciente);
    }

    // Método para generar informes médicos
    public void generarInforme(String paciente) {
        // Lógica para generar informes médicos del paciente
        System.out.println("Generar informe médico de " + paciente);
    }
}