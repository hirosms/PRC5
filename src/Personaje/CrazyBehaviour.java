/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje;

/**
 *
 * @author Sergio
 */
public class CrazyBehaviour implements iBehaviour {
    private String retorno;

    @Override
    public void respuesta() {
        retorno = "ESTOY CONFUSO";
    }

    @Override
    public String getComportamiento() {
        return retorno;
    }
    
    
}
