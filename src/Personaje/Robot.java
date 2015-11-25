/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personaje;

import Mapa.Interfaces.iLugarDelMapa;
import Mapa.Room;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Robot {
    
    iBehaviour comportamiento;
    Room room;
    final int hpmax=10;
    
    public Robot(){}
    
    public Robot(Room hab)
    {        
        room = hab;
        comportamiento = new NormalBehaviour();
    }
    
    public void changeRoom(Room hab)
    {
        room = hab;
        room.Entrar(this);
    }
    
    public Room getRoom()
    {
        return room;
    }
    
    public void showRoom()
    {
        System.out.println("Usted se encuentra en la habitacion "+room.getNumeroHabitacion());
    }
    
    public boolean winStatus()
    {
        if (comportamiento.getClass() == Personaje.WinBehaviour.class)
                //Robot.WinBehaviour.class)
        {
            System.out.println("HAS GANADO!!!");
            return true;
        }
        else
            return false;
    }
    
        public boolean lostStatus()
    {
        if (comportamiento.getClass() == Personaje.LostBehaviour.class)
       
        {
            System.out.println("ESTAMOS PERDIDOS!!!");
            return true;
        }
        else
            return false;
    }
    
    public iBehaviour getComp()
    {
        return comportamiento;
    }
    
    public void move()
    {
        System.out.println("");
        showRoom();
        System.out.println("");
        if (! winStatus())
        {
            System.out.println("Seleccione hacia donde desea mover ");
            System.out.println("1. Norte");
            System.out.println("2. Sur");
            System.out.println("3. Este");
            System.out.println("4. Oeste");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            a--;
            iLugarDelMapa lado = room.getLado(a);
            lado.Entrar(this);

        }
        
    }

    public void setComportamiento(iBehaviour comportamiento) {
        this.comportamiento = comportamiento;
    }

}
