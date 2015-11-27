/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa.SimpleElements;

import Mapa.Interfaces.iLugarDelMapa;
import Mapa.Room;
import Personaje.Robot;

/**
 *
 * @author Sergio
 */

public class Puerta implements iLugarDelMapa {
//private Room habitacion1;
private Room habitacion2;


public Puerta( Room hab2)
    {
        //habitacion1 = hab1;
        habitacion2 = hab2;
      
    }

    @Override
    public void Entrar(Robot robot) 
    {
        System.out.println("Has pasado a la habitacion "+habitacion2.getNumeroHabitacion());
        robot.changeRoom(habitacion2);     
    }
}
