/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Hash {
    
    private static String senhaCriptografada;
    
    public static void setSenhaCriptografada(String senhaCriptografada) throws UnsupportedEncodingException, NoSuchAlgorithmException{
        Hash.senhaCriptografada = Hash.gerarHash(senhaCriptografada);
    }
        
    public static String getSenhaCriptografada(){
        return Hash.senhaCriptografada;
    }

    /*Método estático gerarHash() recebe como argumento uma String representando uma senha,
    a senha passada é criptografada, ou seja, convertida em hash e depois passada devolta como retorno de String   
    */
    
    private static String gerarHash(String senha) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        
        //aqui definimos, através da instancia de objeto, qual será o padrão de criptografia que utilizaremos
        MessageDigest algoritmo = MessageDigest.getInstance("SHA-256");

        //dizemos aqui que a senha faz parte do padrao de codificação de caractere UTF-8 
        //e jogamos a senha codificada em um array de bytes
        byte hash[] = algoritmo.digest(senha.getBytes("UTF-8"));

        //usamos um StringBuilder para concatenar caracteres
        StringBuilder hexString = new StringBuilder();

        //aqui transformamos cada caractere criptografado em byte para hexadecimal
        for (byte b : hash) {
            hexString.append(String.format("%02x", 0xff & b));
        }

        //convertemos StringBuider para String para que seja possível um output
          String senhaHex = hexString.toString();
        
         return senhaHex;
    }
    
    

}
