package org.hossvel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void setPersona() {
        String esperado = "Andres";

        Cuenta cuenta = new Cuenta("Andres");
        String real = cuenta.getPersona();
        assertNotNull(real, () -> "la cuenta no puede ser nula");
        assertEquals(esperado, real, () -> "el nombre de la cuenta no es el que se esperaba: se esperaba " + esperado
                + " sin embargo fue " + real);
        assertTrue(real.equals("Andres"), () -> "nombre cuenta esperada debe ser igual a la real");

    }
}