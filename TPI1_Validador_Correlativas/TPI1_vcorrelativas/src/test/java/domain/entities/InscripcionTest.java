package domain.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InscripcionTest {
    Alumno unAlumno;

    Materia ayed;
    Materia pdp;
    Materia IySoc;
    Materia disenio;

    Inscripcion unaInscripcion;

    @BeforeEach
    public void setUp() {
        unAlumno = new Alumno("Mateo", "Hernandez", "090.128-5");
        ayed = new Materia("AYED");
        pdp = new Materia("PDP");
        IySoc = new Materia("IySoc");
        disenio = new Materia("Diseño");

        unaInscripcion = new Inscripcion(unAlumno);

        pdp.agregarMateriaCorrelativa(ayed);
        disenio.agregarMateriaCorrelativa(pdp);
    }

    @Test
    public void testInscripcionValidaCorrelitvasIndirectas(){
        unAlumno.agregarMateriaAprobada(ayed);
        unAlumno.agregarMateriaAprobada(pdp);
        unaInscripcion.addMateriaACursar(disenio);

        assertTrue(unaInscripcion.aprobada());
    }

    @Test
    public void testInscripcionValidaCorrelitvasDirectas(){
        unAlumno.agregarMateriaAprobada(ayed);
        unaInscripcion.addMateriaACursar(pdp);

        assertTrue(unaInscripcion.aprobada());
    }

    @Test
    public void testInscripcionInvalidaCorrelativasDirectas(){
        unaInscripcion.addMateriaACursar(pdp);

        assertFalse(unaInscripcion.aprobada());
    }

    @Test
    public void testInscripcionValidaCorrelativasIndirectas(){
        unAlumno.agregarMateriaAprobada(ayed);
        unaInscripcion.addMateriaACursar(disenio);

        assertFalse(unaInscripcion.aprobada());
    }

    @Test
    public void testInscripcionValidaSinCorrelativas(){
        unAlumno.agregarMateriaAprobada(IySoc);
        unaInscripcion.addMateriaACursar(IySoc);

        assertTrue(unaInscripcion.aprobada());
    }
}

