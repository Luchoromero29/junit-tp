package entidades;

import static org.junit.jupiter.api.Assertions.*;

import org.example.entidades.ConversorTemperaturas;
import org.example.entidades.CuentaBancaria;
import org.junit.jupiter.api.Test;

public class ConversorTemperaturaTest {
    @Test
    void convierteFahrenheitACelsius() {
        // 32°F = 0°C
        assertEquals(0.0, ConversorTemperaturas.fahrenheitToCelsius(32.0));

        // 212°F = 100°C
        assertEquals(100.0, ConversorTemperaturas.fahrenheitToCelsius(212.0));

        // 98.6°F ≈ 37°C
        assertEquals(37.0, ConversorTemperaturas.fahrenheitToCelsius(98.6));
    }

    @Test
    void convierteCelsiusAFahrenheit() {
        // 0°C = 32°F
        assertEquals(32.0, ConversorTemperaturas.celsiusToFahrenheit(0.0));

        // 100°C = 212°F
        assertEquals(212.0, ConversorTemperaturas.celsiusToFahrenheit(100.0));

        // 37°C ≈ 98.6°F
        assertEquals(98.6, ConversorTemperaturas.celsiusToFahrenheit(37.0), 0.01);
    }

    @Test
    void conversionInversaEsConsistente() {
        double originalCelsius = 25.0;
        double fahrenheit = ConversorTemperaturas.celsiusToFahrenheit(originalCelsius);
        double reconvertido = ConversorTemperaturas.fahrenheitToCelsius(fahrenheit);

        // Debería volver aproximadamente al valor original (tolerancia 0.1)
        assertEquals(originalCelsius, reconvertido, 0.1);
    }

}
