/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.service;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Set;
import model.Solicitacao;
import model.dao.SolicitacaoDao;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ServiceSolicitacao {

    private SolicitacaoDao solicitacaoDao;
    
    public ServiceSolicitacao(){
        solicitacaoDao = new SolicitacaoDao();
    }
    
    public void registrarSolicitacao(Solicitacao solicitacao) throws SQLException{
        solicitacaoDao.insere(solicitacao);
    }
    
    public Boolean pesquisarSolicitacao(String laboratorio_sala) throws SQLException{
        return solicitacaoDao.pesquisa(laboratorio_sala);
    }
    
    public Boolean pesquisarUsuarioChave( String usuarioChave) throws SQLException{
        return solicitacaoDao.pesquisaUsuarioChave(usuarioChave);
    }
    
    public void registraDevolucao(Solicitacao solicitacao, String chave) throws SQLException{
        solicitacaoDao.atualiza(solicitacao, chave);
    }
    
    public Set<Solicitacao> listarSolicitacoes(boolean filtro) throws SQLException, ParseException{
        return solicitacaoDao.getListaSolicitacoes(filtro);
    }
        
        
    
}
