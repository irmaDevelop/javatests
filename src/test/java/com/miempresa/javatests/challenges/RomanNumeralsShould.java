package com.miempresa.javatests.challenges;

import org.junit.Test;

import static com.miempresa.javatests.challenges.RomanNumerals.*;
import static org.junit.Assert.*;

public class RomanNumeralsShould {
    @Test
    public void roman_of_three_first_numbers(){
        assertEquals("I", arabicToRoman(1));
        assertEquals("II", arabicToRoman(2));
        assertEquals("III", arabicToRoman(3));
    }

    @Test
    public void roman_of_5(){
        assertEquals("V", arabicToRoman(5));
    }

    @Test
    public void roman_of_three_number_after_5(){
        assertEquals("VI", arabicToRoman(6));
        assertEquals("VII", arabicToRoman(7));
        assertEquals("VIII", arabicToRoman(8));
    }

    @Test
    public void roman_of_10(){

        assertEquals("X", arabicToRoman(10));
    }

    @Test
    public void roman_of_numbers_between_10_and_20(){
        assertEquals("XI", arabicToRoman(11));
        assertEquals("XV", arabicToRoman(15));
        assertEquals("XVI", arabicToRoman(16));
    }

    @Test
    public void roman_of_numbers_between_50_and_60(){
        assertEquals("L", arabicToRoman(50));
        assertEquals("LI", arabicToRoman(51));
        assertEquals("LV", arabicToRoman(55));
        assertEquals("LVI", arabicToRoman(56));
    }

}
/*
        arabicToRoman(1) ⇒ "I"
        arabicToRoman(2) ⇒ "II"
        arabicToRoman(3) ⇒ "III"

        arabicToRoman(5) ⇒ "V"

        arabicToRoman(6) ⇒ "VI"
        arabicToRoman(7) ⇒ "VII"
        arabicToRoman(10) ⇒ "X"


        arabicToRoman(11) ⇒ "XI"
        arabicToRoman(15) ⇒ "XV"
        arabicToRoman(16) ⇒ "XVI"


        arabicToRoman(50) ⇒ "L"
        arabicToRoman(51) ⇒ "LI"
        arabicToRoman(55) ⇒ "LV"
        arabicToRoman(56) ⇒ "LVI"


        arabicToRoman(60) ⇒ "LX"
        arabicToRoman(70) ⇒ "LXX"
        arabicToRoman(80) ⇒ "LXXX"
        arabicToRoman(81) ⇒ "LXXXI"
        arabicToRoman(85) ⇒ "LXXXV"
        arabicToRoman(86) ⇒ "LXXXVI"
        arabicToRoman(126) ⇒ "CXXVI"
        arabicToRoman(2507) ⇒ "MMDVII"
   */
    /*
        arabicToRoman(4) ⇒ "IV"
        arabicToRoman(9) ⇒ "IX"
        arabicToRoman(14) ⇒ "XIV"
        arabicToRoman(19) ⇒ "XIX"
        arabicToRoman(24) ⇒ "XXIV"
        arabicToRoman(40) ⇒ "XL"
        arabicToRoman(49) ⇒ "XLIX"
        arabicToRoman(90) ⇒ "XC"
        arabicToRoman(99) ⇒ "XCIX"
        arabicToRoman(400) ⇒ "CD"
        arabicToRoman(900) ⇒ "CM"
    */