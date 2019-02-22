package com.miempresa.javatests.util;

/*import static org.junit.Assert.*;
*/
// Ejemplo de test Unitario #########
// sin utilizar ningun tipo de libreria
public class StringUtilTest {
    //psvm public static void main + tab
    public static void main(String[] args) {

        //con la opcion REFACTOR - INLINE
        //la dos lineas se convierten en una sola.
        assertEquals(StringUtil.repeat("hola", 3), "holaholahola");

        //este error ya no lo revisa ya que el anterior dio error ya
        //esto es normal en los tests automaticos.

        String result2 = StringUtil.repeat("hola", 1);
        assertEquals(result2, "hola");


    }

    private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)){
            throw new RuntimeException(actual + " is not equal to " + expected);
        }
    }
}