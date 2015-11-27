/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import Personaje.Robot;
import Mapa.SimpleElements.*;
import Mapa.Interfaces.iLugarDelMapa;

/**
 *
 * @author Sergio
 */
public class Room implements iLugarDelMapa{
    
    public static final int NUMLADOS = 4;
    private int numeroHabitacion;
    private boolean is_end;
    private boolean is_crazy;
//    private boolean can_exit;
    
    private final iLugarDelMapa lados[] = new iLugarDelMapa[NUMLADOS];

    public Room(int numHabitacion, boolean end) 
    {
            numeroHabitacion = numHabitacion;
            is_end = end;
            is_crazy = false;
            //can_exit = exit;
    }
    
        public Room(int numHabitacion, boolean end, boolean crazy) 
    {
            numeroHabitacion = numHabitacion;
            is_end = end;
            is_crazy = crazy;
            //can_exit = exit;
    }

//    public boolean isCan_exit() {
//        return can_exit;
//    }
        
    public boolean isIS_Crazy() {
        return is_crazy;
    }   
    
    public boolean isIs_end() {
        return is_end;
    }

    public final iLugarDelMapa obtenerLado(Direccion direccion)
    {
        iLugarDelMapa i = new Pared();
        return i;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public iLugarDelMapa getLado (int a){
        return lados[a];
    }
    
    public final void setLado(Direccion direccion, iLugarDelMapa lugarDelMapa) 
    {
        int a = getDireccion(direccion);
        lados[a] = lugarDelMapa;
    }
    
        public int getDireccion(Direccion dir)
    {
        switch(dir)
        {
            case NORTE: return 0;
            case SUR: return 1;
            case ESTE: return 2;
            case OESTE: return 3;
            default:
                break;
        }
        return 0;
    }

    @Override
    public void Entrar(Robot robot) 
    {
        System.out.println("Habitación Normal");
    }

}
