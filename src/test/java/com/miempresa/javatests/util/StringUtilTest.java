package com.miempresa.javatests.util;

import org.junit.Assert;
import org.junit.Test;

/*import static org.junit.Assert.*;
*/
// Ejemplo de test Unitario #########
// sin utilizar ningun tipo de libreria
public class StringUtilTest {
    //psvm public static void main + tab


    @Test //indicador que provee JUnit
    public void testRepeatOnce(){
    //public static void main(String[] args) {

        Assert.assertEquals("hola"        , StringUtil.repeat("hola", 1));

        //con la opcion REFACTOR - INLINE
        //la dos lineas se convierten en una sola.

        //assertEquals(StringUtil.repeat("hola", 3), "holaholahola");
        //assertEquals(StringUtil.repeat("hola", 1), "hola");

        //este error ya no lo revisa ya que el anterior dio error ya
        //esto es normal en los tests automaticos.

    }
    @Test
    public void testRepeatMultiple(){
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void testRepeatZero(){
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }


    @Test(expected = IllegalArgumentException.class) //para indicar lo que esperamos
    //da error ya que no se programo para que envie este tipo de excepcion.
    public void testRepeatNegative(){
        StringUtil.repeat("hola", -1);
    }

//    SE COMENTA YA QUE EN LA LIBRERIA YA NO ES NECESARIO
//    private static void assertEquals(String actual, String expected) {
//        if (!actual.equals(expected)){
//            throw new RuntimeException(actual + " is not equal to " + expected);
//        }
//    }


}