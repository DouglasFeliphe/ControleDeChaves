/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import java.util.Set;
import java.util.HashSet;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Chave {
    
    private String laboratorio_sala;
    private String NrChave;
    
    public void setLaboratorio_Sala(String laboratorio_sala){
        this.laboratorio_sala = laboratorio_sala;
        
    }
    
    public String getLaboratorio_Sala(){
        return laboratorio_sala;
    }
    
    public void setNrChave(String nrChave){
        this.NrChave = nrChave;
    }
    
    public String getNrChave(){
        return NrChave;
    }
        

}
