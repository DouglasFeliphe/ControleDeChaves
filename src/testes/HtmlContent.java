/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testes;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class HtmlContent extends JFrame{
    
    public static void main(String[] args) {
        new HtmlContent().start();
        
    }
    
    private void start(){
        
        try{
            String html;
            html= "<html>";
            html+="<head>";
            html+="<title>Página Simples</title>";
            html+="</head>";
            html+= "<body style='background-color: deepskyblue'>";
            html+= "<hr><font size=50>Isto é um conteúdo html</font><hr/>";
            html+= "<input type=button value='oi'/>";
            html+= "</body>";
            html+="</html>";
            
            JEditorPane jep = new JEditorPane("text/html",html);
            
            add(jep);
            setVisible(true);
            setSize(getMaximumSize());
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro no método start()!: \n"+e);
        }
        
    }
    
  
}
