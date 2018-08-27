/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import java.sql.SQLException;
import java.util.Set;
import model.Usuario;
import model.dao.UsuarioDao;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ServiceUsuario {

    private UsuarioDao usuarioDao;

    public ServiceUsuario() {
        usuarioDao = new UsuarioDao();
    }

    public void adicionarUsuario(Usuario usuario) throws SQLException {
            usuarioDao.insere(usuario);
    }

    public boolean pesquisarUsuario(String identificacaoUsuario) throws SQLException {
        return usuarioDao.pesquisa(identificacaoUsuario);
    }

    public void deletarUsuario(String nomeUsuario) throws SQLException {
        usuarioDao.deleta(nomeUsuario);
    }

    public Set<Usuario> listarUsuarios() throws SQLException {
        return usuarioDao.getListaUsuarios();
    }

}
