/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristian_e_douglas.registro_de_aluno2.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author cristian
 */
public class Properties {
    private static final String PATH = "./.properties";
    
    public static String get(String chave){
        java.util.Properties properties = new java.util.Properties();
        try{
        FileInputStream file = new FileInputStream(PATH);
        properties.load(file);
        file.close();
        }catch(FileNotFoundException fe){
            System.out.println("Arquivo não encontrado");
        }catch(IOException fe){
            System.out.println("Erro ao ler arquivo");
        }
        
        if(!properties.containsKey(chave)){
            throw  new RuntimeException("A chave "+ chave +" não encontrada no arquivo "+PATH);
        }
        return properties.getProperty(chave);
    }
}
