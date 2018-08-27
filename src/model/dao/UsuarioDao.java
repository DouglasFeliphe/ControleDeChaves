/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.*;
import conexaoBD.*;
import java.util.HashSet;
import java.util.Set;
import model.*;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsuarioDao {

    private static Connection conexao;
    private Usuario usuario;

    public UsuarioDao() {
        conexao = new ConnectionFactory().criarConexao();
    }

    public void insere(Usuario usuario) throws SQLException {

        PreparedStatement ps = conexao.prepareStatement("insert into usuario (nome_usuario, identificacao_usuario) values (?,?);");
        ps.setString(1, usuario.getNomeUsuario());
        ps.setString(2, usuario.getNumeroIdentificacao());
        ps.execute();

    }

    public boolean pesquisa(String identificacaoUsuario) throws SQLException {

        PreparedStatement ps = conexao.prepareStatement("SELECT * FROM usuario WHERE identificacao_usuario = ?");
        ps.setString(1, identificacaoUsuario);
        ResultSet rs = ps.executeQuery();
        return rs.next();

    }

    //deleta o usário do banco e da lista de usuários da combobox
    public void deleta(String nomeUsuario) throws SQLException {

        PreparedStatement ps = conexao.prepareStatement("delete from usuario where nome_usuario = ?;");
        ps.setString(1, nomeUsuario);
        ps.executeUpdate();

    }

    /*
    este método puxa todas os nomes de chave do bando de dados,
    guarda no objeto chave, guarda num Set de chaves e depois o retorna. 
     */
    public Set<Usuario> getListaUsuarios() throws SQLException {

        PreparedStatement ps = conexao.prepareStatement("SELECT * FROM usuario ORDER BY nome_usuario ASC;");
        ResultSet rs = ps.executeQuery();
        Set usuarios = new HashSet<>();

        while (rs.next()) {

            usuario = new Usuario();
            usuario.setNomeUsuario(rs.getString("nome_usuario"));
            usuario.setNumeroIdentificacao(rs.getString("identificacao_usuario"));
            usuarios.add(usuario);

        }

//        rs.close();
//        ps.close();

        return usuarios;

    }

}
