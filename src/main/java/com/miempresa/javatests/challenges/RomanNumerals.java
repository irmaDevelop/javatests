package com.miempresa.javatests.challenges;

public class RomanNumerals {

    public static String getBasicRoman(int n, int left, int center, int right, int factor){
        String roman = "";


        if (n < 4)                 for(int i = 1; i<=n; i++) roman += getRomanChar(1);
        if ((n >= 5) && (n < 9))   roman += getRomanChar(5);
        if ((n < 9)  && (n > 5))   for(int i=1; i<=(n-5); i++) roman += getRomanChar(1);
        if (n == 10)               roman += getRomanChar(10);
        return roman;
    }


    public static String arabicToRoman(int n) {
        String romanComplet = "";
        int count = 0;
        int rest;
        do{
            rest = n % 10;
            n = n/10;
            romanComplet += romanProcess(rest, (int) Math.pow(10,count));

            count += 1;
        }while (n > 0);

        return romanComplet;
   }

    public static String romanProcess(int rest, int factor) {
        String subRoman="";
        int left, center, right;

        left = factor;
        right = 10*factor;
        center = right/2;

        subRoman = getBasicRoman(rest, left, center, right, factor);

        return subRoman;
    }

    public static char getRomanChar(int n){
        char roman;
        //String letterRoman[][];
        //letterRoman = new String[2][7];
        switch (n) {
            case 1:
                roman = 'I';
                break;
            case 5:
                roman = 'V';
                break;
            case 10:
                roman = 'X';
                break;
            case 50:
                roman = 'L';
                break;
            case 100:
                roman = 'C';
                break;
            case 500:
                roman = 'D';
                break;
            case 1000:
                roman = 'M';
                break;
            default:
                roman = '#';
                break;

        }
        return roman;
    }

}
