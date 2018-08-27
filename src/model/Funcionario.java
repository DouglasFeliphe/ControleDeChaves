/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Funcionario {
    
    private static String nomeFuncionario;
    private static String sobrenomeFuncionario;
    private String numeroIdentificacao;
    private static String email;
    private String senha; 
    private static boolean logado;

    public String getNome_Funcionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
         Funcionario.nomeFuncionario = nomeFuncionario;
    }

    public String getSobrenomeFuncionario() {
        return sobrenomeFuncionario;
    }

    public void setSobrenomeFuncionario(String sobrenomeFuncionario) {
         Funcionario.sobrenomeFuncionario = sobrenomeFuncionario;
    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
         this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Funcionario.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
   
   public void setLogado(boolean logado){
       Funcionario.logado = logado;
   }
   
   public boolean isLogado(){
       return logado;
   }
    
   
    

  

}
