package com.miempresa.javatests.util;

/*import static org.junit.Assert.*;
*/
public class StringUtilTest {
    //psvm public static void main + tab
    public static void main(String[] args) {

        String result = StringUtil.repeat("hola", 3);
        System.out.println(result);

        if (result.equals("holaholahola")){
            System.out.println("Ok");
        }

        String result2 = StringUtil.repeat("hola", 1);
        System.out.println(result2);

        if (result2.equals("hola")){
            System.out.println("Ok");
        }
    }
}