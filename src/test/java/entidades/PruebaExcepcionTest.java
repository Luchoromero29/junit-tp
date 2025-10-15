package entidades;

import org.example.entidades.NuevaExcepcion;
import org.example.entidades.PruebaExcepción;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PruebaExcepcionTest {

    @Test
    void deberiaLanzarExcepcionCuandoEsNull() {
        PruebaExcepción validador = new PruebaExcepción();

        NuevaExcepcion ex = assertThrows(
                NuevaExcepcion.class,
                () -> validador.recibirValor(null),
                "Debe lanzar NuevaExcepcion cuando el valor es null"
        );

        assertEquals("El valor no puede ser null", ex.getMessage());
    }

    @Test
    void deberiaDevolverValorCuandoNoEsNull() throws NuevaExcepcion {
        PruebaExcepción validador = new PruebaExcepción();
        int resultado = validador.recibirValor(10);
        assertEquals(10, resultado);
    }
}
