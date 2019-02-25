package com.miempresa.javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void looses_when_dice_number_is_too_low(){

        //Dice dice = new Dice(6);

        Dice dice = Mockito.mock(Dice.class);

        //ahora forzamos a que el resultado del roll de la clase sea 2
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 3);
        assertFalse(player.play());
        //es el assertEquals(false, ...)
    }

    //dado que dice es un dado que devuelve numeros aleatorios
    //probar la clases resulta inadecuado, ya que cada prueba generaria error o acierto
    //para simular el dado usamos mockito
    //then we create a Dice simulated

    @Test
    public void wins_when_dice_number_is_big(){

        //Dice dice = new Dice(6);

        Dice dice = Mockito.mock(Dice.class);

        //ahora forzamos a que el resultado del roll de la clase sea 2
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        assertTrue(player.play());
        //es el assertEquals(true, ...)
    }

}