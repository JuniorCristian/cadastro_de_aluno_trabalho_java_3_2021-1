/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristian_e_douglas.registro_de_aluno2.model.dao;

import com.cristian_e_douglas.registro_de_aluno2.model.Aluno;
import com.cristian_e_douglas.registro_de_aluno2.model.Curso;
import com.cristian_e_douglas.registro_de_aluno2.model.DAO;
import com.cristian_e_douglas.registro_de_aluno2.view.Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cristian
 */
public class AlunoDAO implements DAO<Aluno>{

    @Override
    public Aluno create(Aluno obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> read() {
        Connection conn = JDBC.getConnection();
        List<Aluno> alunos = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM alunos");
            while (rs.next()) {
                int id = rs.getInt("idalunos");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                LocalDate ldata = rs.getDate("data_nascimento").toLocalDate();
                Date data_nascimento = Date.from(ldata.atStartOfDay(ZoneId.systemDefault()).toInstant());
                char sexo = rs.getString("sexo").toCharArray()[0];
                boolean aceita_msg = rs.getBoolean("aceita_msg");
                String observacao = rs.getString("obs");
                CursoDAO cursoDAO = new CursoDAO();
                Curso curso = cursoDAO.read(rs.getInt("idcurso"));

                alunos.add(new Aluno(id, nome,email, data_nascimento, sexo, aceita_msg, observacao, curso));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alunos;
    }

    @Override
    public Aluno read(int id) {
        Connection conn = JDBC.getConnection();
        List<Aluno> alunos = new ArrayList<>();
        try {

            String sql = "SELECT * FROM alunos WHERE id_alunos = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                LocalDate ldata = rs.getDate("data_nascimento").toLocalDate();
                Date data_nascimento = Date.from(ldata.atStartOfDay(ZoneId.systemDefault()).toInstant());
                char sexo = rs.getString("sexo").toCharArray()[0];
                boolean aceita_msg = rs.getBoolean("aceita_msg");
                String observacao = rs.getString("obs");
                CursoDAO cursoDAO = new CursoDAO();
                Curso curso = cursoDAO.read(rs.getInt("curso"));

                return new Aluno(id, nome,email, data_nascimento, sexo, aceita_msg, observacao, curso);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return new Aluno();
    }

    @Override
    public void update(Aluno obj) {
        Connection conn = JDBC.getConnection();
        try {
            String sql = "UPDATE alunos SET nome = ? sexo = ? data_nascimento = ? curso = ? email = ? aceita_msg = ? obs = ? foto = ? WHERE id_aluno = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, obj.getNome());
            st.setString(2, obj.getSexo()+"");
            st.setDate(3, new java.sql.Date(obj.getData_nasciemnto().getTime()));
            st.setInt(4, obj.getCurso().getId_curso());
            st.setString(5, obj.getEmail());
            st.setBoolean(6, obj.isAceita_msg());
            st.setString(7, obj.getObs());
            st.setString(8, obj.getFoto());
            st.setInt(9, obj.getId_aluno());
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        Connection conn = JDBC.getConnection();
        try {
            String sql = "DELETE * FROM alunos WHERE id_alunos = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, id);
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Aluno obj) {
        Connection conn = JDBC.getConnection();
        try {
            String sql = "DELETE * FROM alunos WHERE id_alunos = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, obj.getId_aluno());
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
