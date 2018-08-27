/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Solicitacao {
    
    private String data;
    private String laboratorioSala;
    private String nrChave;
    private String usuario;
    private String entreguePor;
    private String horarioRetirada;
    private String horarioDevolucao;
    private String recebidoPor;
    private boolean status;
    
    public void setData(Date data){
        this.data = formataData(data);
    }
    
    public String getData(){
        return data;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setHorarioRetirada(Date horario) {
        horarioRetirada = formataHorario(horario);
    }

    public String getHorarioRetirada() {
        return horarioRetirada;
    }

    public void setHorarioDevolucao(Date horario) {
        horarioDevolucao = formataHorario(horario);
    }

    public String getHorarioDevolucao() {
        return horarioDevolucao;
    }

    public String getLaboratorioSala() {
        return laboratorioSala;
    }

    public void setLaboratorioSala(String laboratorioSala) {
        this.laboratorioSala = laboratorioSala;
    }

    public String getNrChave() {
        return nrChave;
    }

    public void setNrChave(String nrChave) {
        this.nrChave = nrChave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEntreguePor() {
        return entreguePor;
    }

    public void setEntreguePor(String entreguePor) {
        this.entreguePor = entreguePor;
    }

    public String getRecebidoPor() {
        return recebidoPor;
    }

    public void setRecebidoPor(String recebidoPor) {
        this.recebidoPor = recebidoPor;
    }
    
        //Método para formatar o horário de entrada e saída
    private static String formataHorario(java.util.Date horario) {
//        DateFormat df = new SimpleDateFormat("HH:mm:ss dd/MMMM/yyyy", local); // horas,min seg, dia,mes,ano
        //formata a data para h,m,s e depois converte o horário para fuso horário do brazil 
        DateFormat df = new SimpleDateFormat("HH:mm:ss", new Locale("pt", "BR"));
        return df.format(horario);
    }
    
        private static String formataData(java.util.Date data) {
//        DateFormat df = new SimpleDateFormat("HH:mm:ss dd/MMMM/yyyy", local); // horas,min seg, dia,mes,ano
        //formata a data para d,m,a e depois converte a data para portugues... 
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(data);
    }
    
    

}
