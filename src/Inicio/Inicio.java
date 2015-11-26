/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;
import Mapa.*;
import Personaje.Robot;
import Personaje.*;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Inicio {
    
    
    public Laberinto Crear_Juego()
    {
        JuegoDelLaberinto tmp = new JuegoDelLaberinto();
        Laberinto lab = new Laberinto();
        
        System.out.println("Seleccione hacia donde desea mover ");
            System.out.println("1. Cargar Laberinto Fácil");
            System.out.println("2. Cargar Laberinto Medio");
            System.out.println("3. Cargar Laberinto Difícil");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            
            switch (a)
            {
                case 1:
                    lab = tmp.crearLaberintoFacil();
                case 2:
                    lab = tmp.crearLaberintoMedio();   
                case 3:
                    lab = tmp.crearLaberintoDificil();
            }
        return lab;    
    }
    public static void main(String a[])
    {
        JuegoDelLaberinto main = new JuegoDelLaberinto();
        Laberinto lab = new Laberinto();
        
        System.out.println("Seleccione hacia donde desea mover ");
        System.out.println("1. Cargar Laberinto Fácil");
        System.out.println("2. Cargar Laberinto Medio");
        System.out.println("3. Cargar Laberinto Difícil");
        Scanner in = new Scanner(System.in);
        int opc = in.nextInt();
        
        switch (opc)
            {
                case 1:
                    lab = main.crearLaberintoFacil();
                case 2:
                    lab = main.crearLaberintoMedio();   
                case 3:
                    lab = main.crearLaberintoDificil();
            }
                
        boolean win = false;
        boolean lost = false;
        Robot r1 = new Robot(lab.getInicial());
        while (!win)
        {
           if ((r1.getComp().getClass() != Personaje.LostBehaviour.class))
           {
                if (r1.getRoom().isIs_end())
                {
                    r1.setComportamiento(new WinBehaviour());
                }
                
                r1.move();
                win = r1.winStatus();
                
           }            
        }
    } 
}
