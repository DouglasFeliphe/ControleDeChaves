/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.service;

import java.sql.SQLException;
import java.util.Set;
import model.Funcionario;
import model.dao.FuncionarioDao;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ServiceFuncionario {
    
    private FuncionarioDao funcionarioDao;
    
    public ServiceFuncionario(){
        funcionarioDao = new FuncionarioDao();
    }
    
    public void adicionarNovoFuncionario(Funcionario funcionario) throws SQLException{
        funcionarioDao.insere(funcionario);
    }
    
    public Funcionario pesquisaFuncionario(String nomeFuncionario) throws SQLException{
        return funcionarioDao.pesquisa(nomeFuncionario);
    }
    
    public Boolean pesquisarFuncionarioPorCpf(String cpf) throws SQLException{
        return funcionarioDao.pesquisaPorCPF(cpf);
    }
    
    public void deletarFuncionario(String nomeFuncionario) throws SQLException{
        funcionarioDao.deleta(nomeFuncionario);
    }
    
    public Set<Funcionario> listarFuncionarios() throws SQLException{
        return funcionarioDao.getListaFuncionarios();
    }
    
    public Funcionario logarFuncionario(String identificacao, String senha) throws SQLException{
        return funcionarioDao.logar(identificacao, senha);
    }
    
}
