package com.miempresa.javatests.util;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel asssessPassword(String password){

        if(password.length() < 8){
            return SecurityLevel.WEAK;
        }

        //tiene letras de la A a la Z y ademas se pueden repetir
        if(password.matches("[a-zA-Z]+")){
            return SecurityLevel.WEAK;
        }

        if(password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }
}
