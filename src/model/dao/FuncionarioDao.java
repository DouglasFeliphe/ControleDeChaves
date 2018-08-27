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
public class FuncionarioDao {

    private static Connection conexao;
    private PreparedStatement ps;
    private ResultSet rs;
    private Funcionario funcionario;
    private String sql;

    public FuncionarioDao() {
        conexao = new ConnectionFactory().criarConexao();
    }

    public void insere(Funcionario funcionario) throws SQLException {

        sql = "insert into funcionario (nome_func,sobrenome_func,identificacao_func,email_func,senha_func) values (?,?,?,?,?);";

        ps = conexao.prepareStatement(sql);
        ps.setString(1, funcionario.getNome_Funcionario());
        ps.setString(2, funcionario.getSobrenomeFuncionario());
        ps.setString(3, funcionario.getNumeroIdentificacao());
        ps.setString(4, funcionario.getEmail());
        ps.setString(5, funcionario.getSenha());
        ps.execute();
        
//        ps.close();
//        conexao.close();
    }

    public Funcionario pesquisa(String cpf) throws SQLException {

        sql = " SELECT * FROM funcionario WHERE identificacao_func = "+cpf+"; ";
        rs = conexao.prepareStatement(sql).executeQuery();
        
        while (rs.next()) {
            //se houver dados do usuário no banco
            funcionario = new Funcionario();
            funcionario.setNomeFuncionario(rs.getString("nome_func"));
            funcionario.setSobrenomeFuncionario(rs.getString("sobrenome_func"));
            funcionario.setNumeroIdentificacao(rs.getString("identificacao_func"));
            funcionario.setEmail(rs.getString("email_func"));
            funcionario.setSenha(rs.getString("senha_func"));

        }

//        rs.close();
//        ps.close();
        return funcionario;

    }

    public boolean pesquisaPorCPF(String cpf) throws SQLException {

        sql = " SELECT * FROM funcionario WHERE identificacao_func = " + cpf + "; ";
        return conexao.prepareStatement(sql).executeQuery().next();

    }

    public void deleta(String cpf) throws SQLException {
        sql = "DELETE FROM funcionario WHERE identificacao_func = "+cpf+"; ";
        conexao.prepareStatement(sql).executeUpdate();
//        ps.setString(1, cpf);
//        ps.executeUpdate();

    }

    public Set<Funcionario> getListaFuncionarios() throws SQLException {

        sql = "SELECT * FROM funcionario ORDER BY nome_func ASC;";
        rs = conexao.prepareStatement(sql).executeQuery();
        Set funcionarios = new HashSet<>();

        while (rs.next()) {

            funcionario = new Funcionario();
            funcionario.setNomeFuncionario(rs.getString("nome_func"));
            funcionario.setNumeroIdentificacao(rs.getString("identificacao_func"));
            funcionarios.add(funcionario);

        }

//        rs.close();
//        ps.close();
        return funcionarios;

    }


    /*
   O método logar recebe como argumentos as Strings login, senha e o objeto da classe funcionario.
   faz uma pesquisa no banco de dados. caso o login e a senha existirem no banco, 
    pega o nome do funcionario referente a número de identificação encontrado, e passa true como 
    
     */
    public Funcionario logar(String identificacao, String senha) throws SQLException {

        sql = "SELECT * FROM funcionario";

        rs = conexao.prepareStatement(sql).executeQuery();

        while (rs.next()) {
            
            funcionario = new Funcionario();

            if (identificacao.equals(rs.getString("identificacao_func")) && senha.equals(rs.getString("senha_func"))) {
                funcionario.setNomeFuncionario(rs.getString("nome_func"));
                funcionario.setLogado(true);
                break;
            }

        }

//        ps.close();
//        rs.close();
        return funcionario;

    }

}
