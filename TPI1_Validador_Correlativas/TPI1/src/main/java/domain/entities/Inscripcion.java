package domain.entities;

import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
    private Set<Materia> materiasAcursar;
    private final Alumno alumno;

    public Inscripcion(Alumno alumno){
        this.materiasAcursar = new HashSet<>();
        this.alumno = alumno;
    }

    public void addMateriaACursar(Materia materiaACursar) {
        materiasAcursar.add(materiaACursar);
    }

    private boolean puedeCursar(Materia materia) {
        return alumno.materiasAprobadas.containsAll(materia.getMateriasCorrelativas());
    }

    public boolean aprobada(){
        return materiasAcursar.stream().allMatch(this::puedeCursar);
    }
} ///aaaaa
