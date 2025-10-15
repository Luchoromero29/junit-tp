package org.example.entidades;

import com.sun.jdi.Type;

import javax.lang.model.type.NullType;

public class PruebaExcepción {

    public int recibirValor(Integer valor) throws NuevaExcepcion{
        if (valor == null) {
            throw new NuevaExcepcion("El valor no puede ser null");
        } else {
            return valor;
        }
    }
}
