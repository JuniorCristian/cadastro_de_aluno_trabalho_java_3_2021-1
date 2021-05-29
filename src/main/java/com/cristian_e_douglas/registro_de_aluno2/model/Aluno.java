/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristian_e_douglas.registro_de_aluno2.model;

import java.util.Date;

/**
 *
 * @author cristian
 */
public class Aluno {
    private int id_aluno;
    private String nome;
    private char sexo;
    private Date data_nasciemnto;
    private Curso curso;
    private String email;
    private boolean aceita_msg;
    private String obs;
    private String foto;

    public Aluno(int id, String nome, String email, Date data_nascimento, char sexo, boolean aceita_msg, String observacao, Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id_aluno
     */
    public int getId_aluno() {
        return id_aluno;
    }

    /**
     * @param id_aluno the id_aluno to set
     */
    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the data_nasciemnto
     */
    public Date getData_nasciemnto() {
        return data_nasciemnto;
    }

    /**
     * @param data_nasciemnto the data_nasciemnto to set
     */
    public void setData_nasciemnto(Date data_nasciemnto) {
        this.data_nasciemnto = data_nasciemnto;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the aceita_msg
     */
    public boolean isAceita_msg() {
        return aceita_msg;
    }

    /**
     * @param aceita_msg the aceita_msg to set
     */
    public void setAceita_msg(boolean aceita_msg) {
        this.aceita_msg = aceita_msg;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
}
