/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristian_e_douglas.registro_de_aluno2.model;

/**
 *
 * @author cristian
 */
public class Curso {
    
    private int id_curso;
    private String nome;
    private String professor;
    private String foto_professor;

    /**
     * @return the id_curso
     */
    public int getId_curso() {
        return id_curso;
    }

    /**
     * @param id_curso the id_curso to set
     */
    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
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
     * @return the professor
     */
    public String getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    /**
     * @return the foto_professor
     */
    public String getFoto_professor() {
        return foto_professor;
    }

    /**
     * @param foto_professor the foto_professor to set
     */
    public void setFoto_professor(String foto_professor) {
        this.foto_professor = foto_professor;
    }
}
