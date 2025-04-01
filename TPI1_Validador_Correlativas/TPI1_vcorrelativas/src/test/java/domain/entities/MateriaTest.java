package domain.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MateriaTest {
    Materia unaMateria;
    Materia materiaCorrelativa;

    @BeforeEach
    public void setUp() {
        unaMateria = new Materia("Matemáticas II");
        materiaCorrelativa = new Materia("Matemáticas I");
    }

    @Test
    public void testAgregarCorrelativa(){
        unaMateria.agregarMateriaCorrelativa(materiaCorrelativa);
        assertTrue(unaMateria.getMateriasCorrelativas().contains(materiaCorrelativa));
    }
}
