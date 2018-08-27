/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConnectionFactory {
    
    private String nomeBanco = "controledechaves";
    private String usuarioBanco = "root";
    private String senhaBanco = "admin";
    
    public Connection criarConexao() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3304/"+nomeBanco+"" , usuarioBanco , senhaBanco);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    

}
