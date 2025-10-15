package org.example.entidades;

public class CuentaBancaria {

    private int numero;
    private double saldo;
    private String titular;


    public CuentaBancaria(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Exito! Dinero depositado: " + valor);
    }



    public void retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Exito! Dinero retirado: " + valor);
            System.out.println("Saldo atual: " + this.saldo);
        } else{
            System.out.println("Saldo insuficiente, saldo atual: " + this.saldo);
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void mostrarDatosCuenta () {
        System.out.println("Cuenta nro: " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo atual: " + this.saldo);
    }

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
