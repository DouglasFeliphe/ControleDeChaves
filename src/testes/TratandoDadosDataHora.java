/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.time.*;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TratandoDadosDataHora {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje); //2014-04-08 (formato ISO-8601)

        LocalTime agora = LocalTime.now();
        System.out.println(agora);
        
    }

}
