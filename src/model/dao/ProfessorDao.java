/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Professor;

/**
 *
 * @author MIcro
 */
public class ProfessorDao {
    
    public void create(Professor p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO professores (nome, email,login,senha) VALUES (?,?,?,?)");
            
            
            stat.setString(1, p.getNome());
            stat.setString(2, p.getEmail());
            stat.setString(3, p.getLogin());
            stat.setString(4, p.getSenha());
            
            stat.executeUpdate();
                    
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
             
        
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, " Erro - Aluno não cadastrado");
        }
        finally{
            ConnectionFactory.closeConnection(con, stat);
        }
    }

    
}
