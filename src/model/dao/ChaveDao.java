/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Set;
import java.util.HashSet;
import conexaoBD.ConnectionFactory;
import model.Chave;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ChaveDao {

    private final Connection conexao;
    private Chave chave;
    private String campo1 = "laboratorio_sala";
    private String campo2 = "nr_chave";
    
   public enum Campo  {
    laboratorio_sala, nr_chave;
    }
        

    public ChaveDao() {
        conexao = new ConnectionFactory().criarConexao();
    }

    public void insere(Chave chave) throws SQLException {

        PreparedStatement ps = conexao.prepareStatement("insert into chave ("+campo1+","+campo2+") values (?,?);");
        ps.setString(1, chave.getLaboratorio_Sala());
        ps.setString(2, chave.getNrChave());
        ps.executeUpdate();

    }

    public boolean pesquisa(Chave chave) throws SQLException {

        PreparedStatement ps = conexao.prepareStatement("SELECT * FROM chave WHERE "+campo1+" = ? or "+campo2+" = ?");
        ps.setString(1, chave.getLaboratorio_Sala());
        ps.setString(2, chave.getNrChave());
        ResultSet rs = ps.executeQuery();
        return rs.next();

    }

    /*
    este método recebe uma String representando o nome da chave a ser excluída
    verifica no bando
    
     */
    public void deleta(String nomeDaChave) throws SQLException {

            PreparedStatement ps = conexao.prepareStatement("delete from chave where "+campo2+" = ?;");
            ps.setString(1, nomeDaChave);
            ps.executeUpdate();
            
    }

    /*
    este método puxa todas os nomes de chave do bando de dados,
    guarda no objeto chave, guarda num Set de chaves e depois o retorna. 
     */
    public Set<Chave> getListaChaves() throws SQLException {

        PreparedStatement ps = conexao.prepareStatement("select * from chave ORDER BY "+campo1+" ASC");
        ResultSet rs = ps.executeQuery();
        Set chaves = new HashSet<>();

        while (rs.next()) {

            chave = new Chave();
            chave.setLaboratorio_Sala(rs.getString(""+campo1+""));
            chave.setNrChave(rs.getString(""+campo2+""));
            chaves.add(chave);

        }

        return chaves;

    }
    

}
