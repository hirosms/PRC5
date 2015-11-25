/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;
import Mapa.*;
import Personaje.Robot;
import Personaje.*;

/**
 *
 * @author Sergio
 */
public class Inicio {
    public static void main(String a[])
    {
        JuegoDelLaberinto main = new JuegoDelLaberinto();
        Laberinto lab = main.crearLaberintoAbiertoCerrado();
        boolean win = false;
        boolean lost = false;
        Robot r1 = new Robot(lab.getInicial());
        while (!win || !lost){
            if (r1.getRoom().isIs_end()){
                    r1.setComportamiento(new WinBehaviour());
                }
//            else if (!r1.getRoom().isCan_exit()){
//                    r1.setComportamiento(new LostBehaviour());
//            }
           if ((r1.getComp().getClass() != Personaje.LostBehaviour.class)){
               

                /*if(!r1.getRoom().isCan_exit()){
                    r1.setComportamiento(new LostBehaviour());
                }*/
                
                r1.move();
                win = r1.winStatus();
                
           }
//           r1.move();
//           lost = r1.lostStatus();
//           
//               
        }
 
    } 
}
