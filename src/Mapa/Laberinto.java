/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import Mapa.Interfaces.iLugarDelMapa;

/**
 *
 * @author Sergio
 */
public class Laberinto {
    
private final iLugarDelMapa room[] = new Room[10];


    public final void addRoom(Room habitacion) 
    {
        room[habitacion.getNumeroHabitacion()] = habitacion;
    }
   
    public final Room numeroDeHabitacion(int numero) 
    {
        return (Room)room[numero];
    }
    
      public final Room getInicial()
    {
        return (Room)room[1];
    }
      
    
    
}
