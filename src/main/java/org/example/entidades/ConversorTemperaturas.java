package org.example.entidades;

public class ConversorTemperaturas {

    public static double fahrenheitToCelsius(double fahrenheit) {
        double result = (fahrenheit - 32) * 5 / 9;
        return Math.floor(result * 100) / 100.0;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double result = (celsius * 9 / 5) + 32;
        return Math.floor(result * 100) / 100.0;
    }

}
