/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import controller.Hash;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Funcionario;
import model.service.ServiceFuncionario;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TelaDeLogin extends javax.swing.JFrame {

    Connection conexao;
    public static Funcionario funcionario;
    private ServiceFuncionario serviceFuncionario;

    /**
     * Creates new form TelaDeLogin
     */
    public TelaDeLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
//        this.getRootPane().setDefaultButton(botaoEntrar); //setando o 'ENTER' como botão padrão

        funcionario = new Funcionario();
        serviceFuncionario = new ServiceFuncionario();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        botaoEntrar = new javax.swing.JButton();
        campoLogin = new javax.swing.JTextField();
        botaoCriarCadastro = new javax.swing.JButton();
        botaoExlcluirCadastros = new javax.swing.JButton();
        botaoPesquisarCadastros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Senha");

        campoSenha.setText("123");
        campoSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoSenhaMouseClicked(evt);
            }
        });
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Login");

        botaoEntrar.setBackground(new java.awt.Color(255, 153, 102));
        botaoEntrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        campoLogin.setText("cpf");
        campoLogin.setToolTipText("Número de Identificação");
        campoLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoLoginMouseClicked(evt);
            }
        });
        campoLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoLoginKeyPressed(evt);
            }
        });

        botaoCriarCadastro.setBackground(new java.awt.Color(102, 153, 255));
        botaoCriarCadastro.setText("Criar Cadastro");
        botaoCriarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarCadastroActionPerformed(evt);
            }
        });

        botaoExlcluirCadastros.setBackground(new java.awt.Color(102, 153, 255));
        botaoExlcluirCadastros.setText("Excluir Cadastro");
        botaoExlcluirCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExlcluirCadastrosActionPerformed(evt);
            }
        });

        botaoPesquisarCadastros.setBackground(new java.awt.Color(102, 153, 255));
        botaoPesquisarCadastros.setText("Pesquisar Cadastro");
        botaoPesquisarCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarCadastrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoSenha, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(189, 189, 189))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(293, 293, 293))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botaoCriarCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoPesquisarCadastros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoExlcluirCadastros)
                        .addGap(124, 124, 124))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCriarCadastro)
                    .addComponent(botaoExlcluirCadastros)
                    .addComponent(botaoPesquisarCadastros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCriarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarCadastroActionPerformed

        this.dispose();
        TelaDeCadastro tela = new TelaDeCadastro();
        tela.setVisible(true);

    }//GEN-LAST:event_botaoCriarCadastroActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        
        String identificacao = campoLogin.getText();//aqui pegamos o numero de login
        
        try {
            
            //aqui pegamos a senha, convertemos em hash e setamos 
            Hash.setSenhaCriptografada(campoSenha.getText());

        } catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            //chama o método 'logar()' que passa como parâmetro o login, 
           funcionario = serviceFuncionario.logarFuncionario(identificacao, Hash.getSenhaCriptografada());
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (funcionario.isLogado()) {

            JOptionPane.showMessageDialog(null, "Logado com sucesso!");
            ControleDeChaves tela = new ControleDeChaves();
            tela.setVisible(true);
            this.dispose();

        } else {

            JOptionPane.showMessageDialog(null, "Login ou Senha inválidos!");

            try {
                serviceFuncionario.pesquisaFuncionario(identificacao);
            } catch (SQLException ex) {
                Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoExlcluirCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExlcluirCadastrosActionPerformed

        String cpfFuncionario = JOptionPane.showInputDialog("Informe o cpf ou Nº de Identificação do funcionário que deseja deletar: ");

        if (cpfFuncionario != null) {

            try {
                serviceFuncionario.deletarFuncionario(cpfFuncionario);
                JOptionPane.showMessageDialog(null, "Funcionário " + cpfFuncionario + " deletado com sucesso!");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Funcionário informado não existe");
                Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Usuário não informado, por favor digite novamente!");
        }


    }//GEN-LAST:event_botaoExlcluirCadastrosActionPerformed

    private void botaoPesquisarCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarCadastrosActionPerformed

        String cpfFuncionario = JOptionPane.showInputDialog("Informe o cpf do funcionário: ");

        Funcionario func = null;
        
        try {
            func = serviceFuncionario.pesquisaFuncionario(cpfFuncionario);
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (func != null) {

            JOptionPane.showMessageDialog(null, "Funcionario " + cpfFuncionario + " encontrado!");
            JOptionPane.showMessageDialog(null, "Nome: " + func.getNome_Funcionario()
                    + "\nSobrenome: " + func.getSobrenomeFuncionario()
                    + "\nEmail: " + func.getEmail()
                    + "\nID: " + func.getNumeroIdentificacao());

        } else {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
        }


    }//GEN-LAST:event_botaoPesquisarCadastrosActionPerformed

    private void campoLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoLoginMouseClicked
        campoLogin.setText("");
    }//GEN-LAST:event_campoLoginMouseClicked

    private void campoSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoSenhaMouseClicked
        campoSenha.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaMouseClicked

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void campoLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoLoginKeyPressed
     
    }//GEN-LAST:event_campoLoginKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCriarCadastro;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JButton botaoExlcluirCadastros;
    private javax.swing.JButton botaoPesquisarCadastros;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
