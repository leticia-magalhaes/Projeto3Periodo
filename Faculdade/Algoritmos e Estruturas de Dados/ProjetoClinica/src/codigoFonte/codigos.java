/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoFonte;

import Utils.Enums;

/**
 *
 * @author Letícia Magalhães
 */
public class codigos {
    
     private String DiaDaSemana(Enums.DiasDaSemana diaDaSemana){
    
        switch(diaDaSemana){
            case SEGUNDA:
                return "Segunda-feira";
            case TERCA:
                return "Terça-feira";
            default:
                return "Dia inválido";
        }
    }
    
    
}
