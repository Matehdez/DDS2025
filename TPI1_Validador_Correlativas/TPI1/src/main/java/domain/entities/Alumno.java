package domain.entities;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private final String nombre;
    private final String apellido;

    private final String legajo;

    @Getter public Set<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materiasAprobadas = new HashSet<>();
    }

    public void agregarMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

}
