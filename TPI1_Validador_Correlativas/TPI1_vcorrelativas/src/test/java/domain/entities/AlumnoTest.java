package domain.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlumnoTest {
    private Alumno unAlumno;
    private Materia unaMateria;

    @BeforeEach
    public void setUp() {
        unAlumno = new Alumno("Mateo", "Hernandez", "090.128-5");
        unaMateria = new Materia("Matemáticas");
        unAlumno.agregarMateriaAprobada(unaMateria);
    }

    @Test
    public void testAproboMateria() {
        assertTrue(unAlumno.getMateriasAprobadas().contains(unaMateria));
    }
}
