package org.example;

import org.example.entidades.ConversorTemperaturas;
import org.example.entidades.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(45000, 10000, "Luciano Romero");

        cuenta.mostrarDatosCuenta();
        cuenta.depositar(500);

        cuenta.retirar(10000);
        cuenta.mostrarDatosCuenta();


        var celcius = 32;
        System.out.println(celcius + " celsius son: " + ConversorTemperaturas.celsiusToFahrenheit(celcius) + " fahrenheit");


        var farenheit = 75;
        System.out.println(farenheit + " farenheit son: " + ConversorTemperaturas.fahrenheitToCelsius(farenheit) + " celcius");

        
    }
}