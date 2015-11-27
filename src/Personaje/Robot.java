/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personaje;

import Mapa.Interfaces.iLugarDelMapa;
import Mapa.Room;
import java.util.Scanner;

/**
 * 
 * @author Sergio
 */
public class Robot {
    
    iBehaviour comportamiento;
    Room room;
    
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
            if (!IAmCrazy())
            {
                if (this.comportamiento.getClass() != NormalBehaviour.class)
                    this.setComportamiento(new NormalBehaviour());
                this.comportamiento.respuesta();
                System.out.println(this.comportamiento.getComportamiento());
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
            else //if (IAmCrazy() == true)
            {
                this.setComportamiento(new CrazyBehaviour());
                this.comportamiento.respuesta();
                System.out.println(this.comportamiento.getComportamiento());
                System.out.println("Seleccione hacia donde desea mover ");
                System.out.println("1. Norte");
                System.out.println("2. Sur");
                System.out.println("3. Este");
                System.out.println("4. Oeste");
                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                a--;
                switch(a){
                    case 0: 
                        a = 1;
                        break;
                    case 1: 
                        a = 0;
                        break;
                    case 2: 
                        a = 3;
                        break;
                    case 3: 
                        a = 2;
                        break;
                }
                iLugarDelMapa lado = room.getLado(a);
                lado.Entrar(this);
            }

        }
        
    }
    
    public boolean IAmCrazy ()
    {
        if( this.room.isIS_Crazy() == true)
            return true;
        else
            return false;
    }

    public void setComportamiento(iBehaviour comportamiento) {
        this.comportamiento = comportamiento;
    }

}
