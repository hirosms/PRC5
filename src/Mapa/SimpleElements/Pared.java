/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa.SimpleElements;

import Mapa.Interfaces.iLugarDelMapa;
import Personaje.Robot;
/**
 *
 * @author Sergio
 */
public class Pared implements iLugarDelMapa {

    
    @Override
    public void Entrar(Robot robot) 
    {
        System.out.println("Esto es una Pared.");

    }

}
    

