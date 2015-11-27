/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import Mapa.SimpleElements.*;

/**
 *
 * @author Sergio
 */
public class JuegoDelLaberinto {
        
    public Laberinto fabricarLaberinto() 
    {
        return new Laberinto();
    }
    
    public Room fabricarRoom(int n, boolean e) 
    {
        return new Room(n,e);
    }
      
    public Room fabricarRoom(int n, boolean e, boolean c) 
    {
        return new Room(n,e,c);
    }
    
    
    public Pared fabricarPared() 
    {
        return new Pared();
    }
    
    public Puerta fabricarPuerta(Room h2) 
    {
        return new Puerta(h2);
    }
    
    public final Laberinto crearLaberintoFacil() 
    {
        Laberinto unLaberinto = fabricarLaberinto();
        
        Room h1 = fabricarRoom(1,false);
        Room h2 = fabricarRoom(2,false);
        Room h3 = fabricarRoom(3,true);      
        Room h4 = fabricarRoom(4,false);      
        
        
        unLaberinto.addRoom(h1);
        unLaberinto.addRoom(h2);
        unLaberinto.addRoom(h3);

        
        Puerta puerta1 = fabricarPuerta(h1);
        Puerta puerta2 = fabricarPuerta(h2);
        Puerta puerta3 = fabricarPuerta(h3);
        Puerta puerta4 = fabricarPuerta(h4);
        
        
        h1.setLado(Direccion.NORTE, fabricarPared());
        h1.setLado(Direccion.SUR, puerta2);
        h1.setLado(Direccion.ESTE, puerta4);
        h1.setLado(Direccion.OESTE, fabricarPared());
        
        h2.setLado(Direccion.NORTE, puerta1);
        h2.setLado(Direccion.SUR, fabricarPared());
        h2.setLado(Direccion.ESTE, puerta3);
        h2.setLado(Direccion.OESTE,fabricarPared() );
        
        h3.setLado(Direccion.NORTE, fabricarPared());
        h3.setLado(Direccion.SUR, fabricarPared());
        h3.setLado(Direccion.ESTE, fabricarPared());
        h3.setLado(Direccion.OESTE, puerta2);

        h4.setLado(Direccion.NORTE, fabricarPared());
        h4.setLado(Direccion.SUR, fabricarPared());
        h4.setLado(Direccion.ESTE, fabricarPared());
        h4.setLado(Direccion.OESTE, puerta1);
        
        
        return unLaberinto;
    }
    
    public final Laberinto crearLaberintoMedio()
    {
        Laberinto unLaberinto = fabricarLaberinto();
        
        Room h1 = fabricarRoom(1,false);
        Room h2 = fabricarRoom(2,false);
        Room h3 = fabricarRoom(3,false);      
        Room h4 = fabricarRoom(4,false);
        Room h5 = fabricarRoom(5,true);
        Room h6 = fabricarRoom(6,false);
        
        unLaberinto.addRoom(h1);
        unLaberinto.addRoom(h2);
        unLaberinto.addRoom(h3);
        unLaberinto.addRoom(h4);
        unLaberinto.addRoom(h5);
        unLaberinto.addRoom(h6);
        
        Puerta puerta1 = fabricarPuerta(h1);
        Puerta puerta2 = fabricarPuerta(h2);
        Puerta puerta3 = fabricarPuerta(h3);
        Puerta puerta4 = fabricarPuerta(h4);
        Puerta puerta5 = fabricarPuerta(h5);
        Puerta puerta6 = fabricarPuerta(h6);      
        
        h1.setLado(Direccion.NORTE, fabricarPared());
        h1.setLado(Direccion.SUR, puerta3);
        h1.setLado(Direccion.ESTE, puerta2);
        h1.setLado(Direccion.OESTE, fabricarPared());
        
        h2.setLado(Direccion.NORTE, fabricarPared());
        h2.setLado(Direccion.SUR, puerta4);
        h2.setLado(Direccion.ESTE, fabricarPared());
        h2.setLado(Direccion.OESTE, puerta1);
        
        h3.setLado(Direccion.NORTE, puerta1);
        h3.setLado(Direccion.SUR, fabricarPared());
        h3.setLado(Direccion.ESTE, puerta4);
        h3.setLado(Direccion.OESTE, fabricarPared());
        
        h4.setLado(Direccion.NORTE, puerta2);
        h4.setLado(Direccion.SUR, puerta6);
        h4.setLado(Direccion.ESTE, fabricarPared());
        h4.setLado(Direccion.OESTE, puerta3);
        
        h5.setLado(Direccion.NORTE, fabricarPared());
        h5.setLado(Direccion.SUR, fabricarPared());
        h5.setLado(Direccion.ESTE, puerta6);
        h5.setLado(Direccion.OESTE, fabricarPared());
        
        h6.setLado(Direccion.NORTE, puerta4);
        h6.setLado(Direccion.SUR, fabricarPared());
        h6.setLado(Direccion.ESTE, fabricarPared());
        h6.setLado(Direccion.OESTE, puerta5);
        
        return unLaberinto;
        
    }
    
    public final Laberinto crearLaberintoDificil()
    {
        Laberinto unLaberinto = fabricarLaberinto();
        
        Room h1  = fabricarRoom(1,false);
        Room h2  = fabricarRoom(2,false);
        Room h3  = fabricarRoom(3,false);      
        Room h4  = fabricarRoom(4,false);      
        Room h5  = fabricarRoom(1,false);
        Room h6  = fabricarRoom(2,false);
        Room h7  = fabricarRoom(3,false);      
        Room h8  = fabricarRoom(4,false);      
        Room h9  = fabricarRoom(1,false);
        Room h10 = fabricarRoom(2,true);
        Room h11 = fabricarRoom(3,false);      
        Room h12 = fabricarRoom(4,false);      
        
        
        
        unLaberinto.addRoom(h1);
        unLaberinto.addRoom(h2);
        unLaberinto.addRoom(h3);
        unLaberinto.addRoom(h4);
        unLaberinto.addRoom(h5);
        unLaberinto.addRoom(h6);
        unLaberinto.addRoom(h7);
        unLaberinto.addRoom(h8);
        unLaberinto.addRoom(h9);
        unLaberinto.addRoom(h10);
        unLaberinto.addRoom(h11);
        unLaberinto.addRoom(h12);

        
        Puerta puerta1 = fabricarPuerta(h1);
        Puerta puerta2 = fabricarPuerta(h2);
        Puerta puerta3 = fabricarPuerta(h3);
        Puerta puerta4 = fabricarPuerta(h4);
        Puerta puerta5 = fabricarPuerta(h5);
        Puerta puerta6 = fabricarPuerta(h6);
        Puerta puerta7 = fabricarPuerta(h7);
        Puerta puerta8 = fabricarPuerta(h8);
        Puerta puerta9 = fabricarPuerta(h9);
        Puerta puerta10 = fabricarPuerta(h10);
        Puerta puerta11 = fabricarPuerta(h11);
        Puerta puerta12 = fabricarPuerta(h12);
        
        
        h1.setLado(Direccion.NORTE, fabricarPared());
        h1.setLado(Direccion.SUR, fabricarPared());
        h1.setLado(Direccion.ESTE, puerta4);
        h1.setLado(Direccion.OESTE, fabricarPared());
        
        h2.setLado(Direccion.NORTE, fabricarPared());
        h2.setLado(Direccion.SUR, puerta3);
        h2.setLado(Direccion.ESTE, puerta5);
        h2.setLado(Direccion.OESTE, fabricarPared());
        
        h3.setLado(Direccion.NORTE, puerta2);
        h3.setLado(Direccion.SUR, fabricarPared());
        h3.setLado(Direccion.ESTE, fabricarPared());
        h3.setLado(Direccion.OESTE, fabricarPared());
    
        h4.setLado(Direccion.NORTE, fabricarPared());
        h4.setLado(Direccion.SUR, puerta5);
        h4.setLado(Direccion.ESTE, puerta7);
        h4.setLado(Direccion.OESTE, puerta1);
        
        h5.setLado(Direccion.NORTE, puerta4);
        h5.setLado(Direccion.SUR, fabricarPared());
        h5.setLado(Direccion.ESTE, fabricarPared());
        h5.setLado(Direccion.OESTE, puerta2);
        
        h6.setLado(Direccion.NORTE, fabricarPared());
        h6.setLado(Direccion.SUR, fabricarPared());
        h6.setLado(Direccion.ESTE, puerta9);
        h6.setLado(Direccion.OESTE, fabricarPared());
        
        h7.setLado(Direccion.NORTE, fabricarPared());
        h7.setLado(Direccion.SUR, puerta8);
        h7.setLado(Direccion.ESTE, fabricarPared());
        h7.setLado(Direccion.OESTE, puerta4);
        
        h8.setLado(Direccion.NORTE, puerta7);
        h8.setLado(Direccion.SUR, puerta9);
        h8.setLado(Direccion.ESTE, puerta11);
        h8.setLado(Direccion.OESTE, fabricarPared());
        
        h9.setLado(Direccion.NORTE, puerta8);
        h9.setLado(Direccion.SUR, fabricarPared());
        h9.setLado(Direccion.ESTE, fabricarPared());
        h9.setLado(Direccion.OESTE, puerta6);
        
        h10.setLado(Direccion.NORTE, fabricarPared());
        h10.setLado(Direccion.SUR, puerta11);
        h10.setLado(Direccion.ESTE, fabricarPared());
        h10.setLado(Direccion.OESTE, fabricarPared());
        
        h11.setLado(Direccion.NORTE, puerta10);
        h11.setLado(Direccion.SUR, puerta12);
        h11.setLado(Direccion.ESTE, fabricarPared());
        h11.setLado(Direccion.OESTE, puerta8);
        
        h12.setLado(Direccion.NORTE, puerta11);
        h12.setLado(Direccion.SUR, fabricarPared());
        h12.setLado(Direccion.ESTE, fabricarPared());
        h12.setLado(Direccion.OESTE, fabricarPared());
        
        return unLaberinto;
        
    }
    
    public final Laberinto crearLaberintoTest()
    {
        Laberinto unLaberinto = fabricarLaberinto();
        
        Room h1 = fabricarRoom(1,false,false);
        Room h2 = fabricarRoom(2,false,true);
        Room h3 = fabricarRoom(3,false,false);      
        Room h4 = fabricarRoom(4,false,false);
        Room h5 = fabricarRoom(5,false,false);
        Room h6 = fabricarRoom(6,false,false);
        Room h7 = fabricarRoom(7,false,false);
        Room h8 = fabricarRoom(8,false,true);
        
        unLaberinto.addRoom(h1);
        unLaberinto.addRoom(h2);
        unLaberinto.addRoom(h3);
        unLaberinto.addRoom(h4);
        unLaberinto.addRoom(h5);
        unLaberinto.addRoom(h6);
        unLaberinto.addRoom(h7);
        unLaberinto.addRoom(h8);
        
        Puerta puerta1 = fabricarPuerta(h1);
        Puerta puerta2 = fabricarPuerta(h2);
        Puerta puerta3 = fabricarPuerta(h3);
        Puerta puerta4 = fabricarPuerta(h4);
        Puerta puerta5 = fabricarPuerta(h5);
        Puerta puerta6 = fabricarPuerta(h6);
        Puerta puerta7 = fabricarPuerta(h7);
        Puerta puerta8 = fabricarPuerta(h8);
        
        h1.setLado(Direccion.NORTE, fabricarPared());
        h1.setLado(Direccion.SUR,   fabricarPared());
        h1.setLado(Direccion.ESTE,  puerta2);
        h1.setLado(Direccion.OESTE, fabricarPared());
        
        h2.setLado(Direccion.NORTE, fabricarPared());
        h2.setLado(Direccion.SUR,   fabricarPared());
        h2.setLado(Direccion.ESTE,  puerta3);
        h2.setLado(Direccion.OESTE, puerta1);
        
        h3.setLado(Direccion.NORTE, fabricarPared());
        h3.setLado(Direccion.SUR, puerta4);
        h3.setLado(Direccion.ESTE, fabricarPared());
        h3.setLado(Direccion.OESTE, puerta2);
        
        h4.setLado(Direccion.NORTE, puerta3);
        h4.setLado(Direccion.SUR, puerta5);
        h4.setLado(Direccion.ESTE, fabricarPared());
        h4.setLado(Direccion.OESTE, fabricarPared());
        
        h5.setLado(Direccion.NORTE, puerta4);
        h5.setLado(Direccion.SUR, fabricarPared());
        h5.setLado(Direccion.ESTE, fabricarPared());
        h5.setLado(Direccion.OESTE, puerta6);
        
        h6.setLado(Direccion.NORTE, fabricarPared());
        h6.setLado(Direccion.SUR, fabricarPared());
        h6.setLado(Direccion.ESTE, puerta5);
        h6.setLado(Direccion.OESTE, puerta7);
        
        h7.setLado(Direccion.NORTE, puerta8);
        h7.setLado(Direccion.SUR, fabricarPared());
        h7.setLado(Direccion.ESTE, puerta6);
        h7.setLado(Direccion.OESTE, fabricarPared());
        
        h8.setLado(Direccion.NORTE, fabricarPared());
        h8.setLado(Direccion.SUR, puerta7);
        h8.setLado(Direccion.ESTE, fabricarPared());
        h8.setLado(Direccion.OESTE, fabricarPared());
        
        return unLaberinto;
        
    }
    
}
