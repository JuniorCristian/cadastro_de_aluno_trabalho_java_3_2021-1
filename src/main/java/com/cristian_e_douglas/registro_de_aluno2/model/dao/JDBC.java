/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristian_e_douglas.registro_de_aluno2.model.dao;

import com.cristian_e_douglas.registro_de_aluno2.controller.Properties;
import com.cristian_e_douglas.registro_de_aluno2.view.Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBC {

    private static final String DRIVER = Properties.get("bd.driver");
    private static final String URL = Properties.get("bd.url");
    private static final String USER = Properties.get("bd.user");
    private static final String PASSWORD = Properties.get("bd.pass");

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
