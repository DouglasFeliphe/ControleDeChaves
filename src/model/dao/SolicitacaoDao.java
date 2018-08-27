/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexaoBD.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import model.*;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class SolicitacaoDao {

    private final Connection conexao;
    
    private String campo1 = "data_solicitacao";
    private String campo2 = "laboratorio_sala";
    private String campo3 = "nr_chave";
    private String campo4 = "usuario";
    private String campo5 = "horario_retirada";
    private String campo6 = "entregue_por";
    private String campo7 = "horario_devolucao";
    private String campo8 = "recebido_por";
    private String campo9 = "status_chave";
    
    private DateFormat df;
    
    String sql;

    private PreparedStatement ps;

    ResultSet rs;

    public SolicitacaoDao() {
        conexao = new ConnectionFactory().criarConexao();
//        df = new SimpleDateFormat("HH:mm:ss");
    }

    public void insere(Solicitacao solicitacao) throws SQLException {
        sql = "insert into solicitacao (" + campo1 + "," + campo2 + "," + campo3 + "," + campo4 + "," + campo5 + "," + campo6 + "," + campo7 + "," + campo8 + "," + campo9 + ") values (?,?,?,?,?,?,?,?,?) ; ";

        ps = conexao.prepareStatement(sql);
        
        ps.setString(1, solicitacao.getData());
        ps.setString(2, solicitacao.getLaboratorioSala());
        ps.setString(3, solicitacao.getNrChave());
        ps.setString(4, solicitacao.getUsuario());
        ps.setString(5, solicitacao.getHorarioRetirada());
        ps.setString(6, solicitacao.getEntreguePor());
        ps.setString(7, solicitacao.getHorarioDevolucao());
        ps.setString(8, solicitacao.getRecebidoPor());
        ps.setBoolean(9, solicitacao.getStatus());
        ps.execute();
//        ps.close();
        //conexao.close();

    }
    // pesquisa se a chave esta na lista de solicitações
    public boolean pesquisa(String laboratorio_sala) throws SQLException{
        ps = conexao.prepareStatement("SELECT * FROM solicitacao WHERE "+campo2+" = ? AND "+campo9+" = false");
        ps.setString(1, laboratorio_sala);
        rs = ps.executeQuery();
        return rs.next();
    }
    
    public boolean pesquisaUsuarioChave(String usuarioChave) throws SQLException{
         ps = conexao.prepareStatement("SELECT * FROM solicitacao WHERE "+campo4+" = ? AND "+campo9+" = false");
        ps.setString(1, usuarioChave);
        rs = ps.executeQuery();
        return rs.next();
    }

    public void atualiza(Solicitacao solicitacao, String chaveDevolvida) throws SQLException {

    sql = "update solicitacao"
            + " set horario_devolucao = ?, recebido_por = ?, status_chave = ?"
            + " where nr_chave = ?;"; 
    

        ps = conexao.prepareStatement(sql);
        
        ps.setString(1, solicitacao.getHorarioDevolucao());
        ps.setString(2, solicitacao.getRecebidoPor());
        ps.setBoolean(3, solicitacao.getStatus());
        ps.setInt(4, Integer.parseInt(chaveDevolvida));
        
        ps.executeUpdate();
        
//        ps.close();
        //conexao.close();
        
    }

    public Set<Solicitacao> getListaSolicitacoes(boolean filtro) throws SQLException, ParseException {

        Date dataAtualBanco, horaRetiradaBanco, horaDevolucaoBanco;
        
        
        if (filtro) {
            //listar todas as solicitacoes com status não devolvida
            ps = conexao.prepareStatement(" SELECT * FROM solicitacao WHERE " + campo9 + " = ?; ");
            ps.setBoolean(1, false);
        } else {
            ps = conexao.prepareStatement(" SELECT * FROM solicitacao ");
        }
        
        rs = ps.executeQuery();
        Set solicitacoes = new HashSet<>();
        
        while (rs.next()) {

            Solicitacao solicitacao = new Solicitacao();
            
            //convertendo a Data da solicitacao no banco de String para Date
            
            dataAtualBanco = new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(campo1));
            solicitacao.setData(dataAtualBanco);
            
            solicitacao.setLaboratorioSala(rs.getString(campo2));
            solicitacao.setNrChave(rs.getString(campo3));
            solicitacao.setUsuario(rs.getString(campo4));
            
            //convertendo a hora de retirada do banco de String para Date
            horaRetiradaBanco = new SimpleDateFormat("HH:mm:ss").parse(rs.getString(campo5));
            solicitacao.setHorarioRetirada(horaRetiradaBanco);     
           
            solicitacao.setEntreguePor(rs.getString(campo6));
            
            //convertendo a hora de devolução do banco de String para Date
            horaDevolucaoBanco = new SimpleDateFormat("HH:mm:ss").parse(rs.getString(campo7));
            solicitacao.setHorarioDevolucao(horaDevolucaoBanco);

            solicitacao.setRecebidoPor(rs.getString(campo8));
            solicitacao.setStatus(rs.getBoolean(campo9));

            solicitacoes.add(solicitacao);

        }

//        rs.close();
//        ps.close();
            return solicitacoes;

    }


}
