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
import model.bean.Aluno;

/**
 *
 * @author MIcro
 */
public class AlunoDao {
    
    public void create(Aluno a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO aluno (ra, nome,turma_id,login,senha) VALUES ( )");
            stat.setInt(1,a.getRa());
            stat.setString(2, a.getNome());
            stat.setInt(3, 8);
            stat.setString(4, a.getLogin());
            stat.setString(5, a.getSenha());
            
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
