package domain.entities;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

public class Materia {
    private final String nombre;
    @Getter private final Set<Materia> materiasCorrelativas;

    public Materia(String nombre){
        this.nombre = nombre;
        this.materiasCorrelativas = new HashSet<Materia>();
    }

    public void agregarMateriaCorrelativa(Materia materia) {
        this.materiasCorrelativas.add(materia);
    }

}
