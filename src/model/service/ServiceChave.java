/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.service;

import java.sql.SQLException;
import java.util.Set;
import model.Chave;
import model.dao.ChaveDao;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ServiceChave {
    
    private ChaveDao chaveDao;
    
    public ServiceChave(){
        chaveDao = new ChaveDao();
    }
    
    public void adicionarNovaChave(Chave chave) throws SQLException{
        chaveDao.insere(chave);
    }
    
    public boolean pesquisarChave(Chave chave) throws SQLException{
        return chaveDao.pesquisa(chave);
    }
    
    public void deletarChave(String nomeDaChave) throws SQLException{
        chaveDao.deleta(nomeDaChave);
    }
    
    public Set<Chave> listarChaves() throws SQLException{
        return chaveDao.getListaChaves();
    }
        

}
