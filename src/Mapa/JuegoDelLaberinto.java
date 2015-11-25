/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import Mapa.SimpleElements.Direccion;
import Mapa.SimpleElements.Puerta;
import Mapa.SimpleElements.Pared;

/**
 *
 * @author Sergio
 */
public class JuegoDelLaberinto {
    
    //AQUI LABERINTO
    //ROBOT
    
        
    public Laberinto fabricarLaberinto() 
    {
        return new Laberinto();
    }
    public Room fabricarRoom(int n, boolean e) 
    {
        return new Room(n,e);
    }
    
    public Pared fabricarPared() 
    {
        return new Pared();
    }
    
    public Puerta fabricarPuerta(Room h1, Room h2) 
    {
        return new Puerta(h1, h2);
    }
    
    public final Laberinto crearLaberintoAbiertoCerrado() 
    {
        Laberinto unLaberinto = fabricarLaberinto();
        
        Room h1 = fabricarRoom(1,false);
        Room h2 = fabricarRoom(2,false);
        Room h3 = fabricarRoom(3,true);      
        Room h4 = fabricarRoom(4,false);      
        
        
        unLaberinto.addRoom(h1);
        unLaberinto.addRoom(h2);
        unLaberinto.addRoom(h3);

        
        Puerta puerta12 = fabricarPuerta(h1, h2);
        Puerta puerta21 = fabricarPuerta(h2, h1);
        Puerta puerta23 = fabricarPuerta(h2, h3);
        Puerta puerta32 = fabricarPuerta(h3, h2);
        Puerta puerta14 = fabricarPuerta(h1, h4);
        Puerta puerta41 = fabricarPuerta(h4, h1);
        
        
        h1.setLado(Direccion.NORTE, fabricarPared());
        h1.setLado(Direccion.SUR, puerta12);
        h1.setLado(Direccion.ESTE, puerta14);
        h1.setLado(Direccion.OESTE, fabricarPared());
        
        h2.setLado(Direccion.NORTE, puerta21);
        h2.setLado(Direccion.SUR, fabricarPared());
        h2.setLado(Direccion.ESTE, puerta23);
        h2.setLado(Direccion.OESTE,fabricarPared() );
        
        h3.setLado(Direccion.NORTE, fabricarPared());
        h3.setLado(Direccion.SUR, fabricarPared());
        h3.setLado(Direccion.ESTE, fabricarPared());
        h3.setLado(Direccion.OESTE, puerta32);

        h4.setLado(Direccion.NORTE, fabricarPared());
        h4.setLado(Direccion.SUR, fabricarPared());
        h4.setLado(Direccion.ESTE, fabricarPared());
        h4.setLado(Direccion.OESTE, puerta41);
        
        
        return unLaberinto;
    }
}
