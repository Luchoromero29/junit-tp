package entidades;

import static org.junit.jupiter.api.Assertions.*;
import org.example.entidades.CuentaBancaria;
import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {

    @Test
    public void depositar_incrementarSaldo() {
        CuentaBancaria c = new CuentaBancaria(1, 0.0, "Nicolas Diaz");
        c.depositar(10000.00);
        assertEquals(10000.00, c.getSaldo());
    }

    @Test
    public void retirar_disminuyeSaldo() {
        CuentaBancaria c = new CuentaBancaria(2, 20000, "Lautaro Sosa");
        c.depositar(20000.00);
        c.retirar(10000.00);
        assertEquals(30000.00, c.getSaldo());

    }

    @Test
    public void noPermiteRetirarMasQueElSaldo() {
        CuentaBancaria c = new CuentaBancaria(3, 4000, "Alejandro Cortés");
        c.retirar(10000.00);
        assertEquals(4000, c.getSaldo());
    }




}
