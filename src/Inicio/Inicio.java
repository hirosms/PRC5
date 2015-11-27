/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;
import Mapa.*;
import Personaje.*;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Inicio {
    
    public static void main(String a[])
    {
        JuegoDelLaberinto main = new JuegoDelLaberinto();
        Laberinto lab = new Laberinto();
        
        System.out.println("Seleccione Laberinto: ");
        System.out.println("1. Cargar Laberinto Fácil");
        System.out.println("2. Cargar Laberinto Medio");
        System.out.println("3. Cargar Laberinto Difícil");
        System.out.println("4. Cargar Laberinto Test");
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
                case 4:
                    lab = main.crearLaberintoTest();
            }
                
        boolean win = false;
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
