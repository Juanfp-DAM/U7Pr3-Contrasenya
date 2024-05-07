package Contrasenya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {
    static String pocasLetras = "La contraseña ha de tener almenos 8 carácteres. ";
    static String pocosNumeros =  "La contraseña ha de tener 2 dígitos o más. ";
    static String pocasMayus = "La contraseña ha de tener al menos una letra mayúscula. ";
    static String pocosCaracteresEspeciales = "La contraseña ha de tener al menos un carácter especial.";
    static PasswordVerify p;

    @Test
    void passVacia(){
        //ARRANGE
        p = new PasswordVerify();
        String contrasenya = "";

        //ACT
        String resultado = p.passwordString(contrasenya);
        boolean verifica = p.verificaPassw();

        //ASSERTEQUALS
        assertEquals(pocasLetras + pocosNumeros + pocasMayus + pocosCaracteresEspeciales ,resultado);
        assertFalse(verifica);
    }

    @Test
    void passhola(){
        //ARRANGE
        p = new PasswordVerify();
        String contrasenya = "hola";

        //ACT
        String resultado = p.passwordString(contrasenya);
        boolean verifica = p.verificaPassw();

        //ASSERTEQUALS
        assertEquals(pocasLetras + pocosNumeros + pocasMayus + pocosCaracteresEspeciales ,resultado);
        assertFalse(verifica);
    }

    @Test
    void passholacaracola(){
        //ARRANGE
        p = new PasswordVerify();
        String contrasenya = "holacaracola";

        //ACT
        String resultado = p.passwordString(contrasenya);
        boolean verifica = p.verificaPassw();

        //ASSERTEQUALS
        assertEquals(pocosNumeros + pocasMayus + pocosCaracteresEspeciales ,resultado);
        assertFalse(verifica);
    }

    @Test
    void passDosDigitos(){
        //ARRANGE
        p = new PasswordVerify();
        String contrasenya = "hola12";

        //ACT
        String resultado = p.passwordString(contrasenya);
        boolean verifica = p.verificaPassw();

        //ASSERTEQUALS
        assertEquals(pocasLetras + pocasMayus + pocosCaracteresEspeciales ,resultado);
        assertFalse(verifica);
    }

    @Test
    void passholA(){
        //ARRANGE
        p = new PasswordVerify();
        String contrasenya = "holA";

        //ACT
        String resultado = p.passwordString(contrasenya);
        boolean verifica = p.verificaPassw();

        //ASSERTEQUALS
        assertEquals(pocasLetras + pocosNumeros+ pocosCaracteresEspeciales ,resultado);
        assertFalse(verifica);
    }







}