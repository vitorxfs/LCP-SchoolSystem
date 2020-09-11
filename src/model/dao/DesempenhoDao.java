/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Aluno;
import model.bean.Desempenho;
import model.bean.Session;

/**
 *
 * @author MIcro
 */
public class DesempenhoDao {
       private Connection con = null;

    public DesempenhoDao() {
        con = ConnectionFactory.getConnection();
    }

        public List<Desempenho> read(Desempenho d) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Desempenho> desemp = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM desempenho where aluno_id = ?");
            stmt.setInt(1,d.getAluno_id());
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Desempenho des = new Desempenho();

                des.setId(rs.getInt("id"));
                des.setAluno_id(rs.getInt("aluno_id"));
                des.setDisciplina_id(rs.getInt("disciplina"));
                des.setNota_1bimestre(rs.getFloat("nota_1bimestre"));
                des.setNota_2bimestre(rs.getFloat("nota_2bimestre"));
                des.setNota_3bimestre(rs.getFloat("nota_4bimestre"));
                des.setNota_4bimestre(rs.getFloat("nota_4bimestre"));
                des.setMedia_final(rs.getFloat("media_final"));
                des.setFrequencia(rs.getFloat("frequencia"));
                
                desemp.add(d);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DesempenhoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return desemp;

    }
        
        public void update(Desempenho d) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE desempenhos SET nota_1bimestre = ? ,nota_2bimestre = ?, nota_3bimestre = ?, nota_4bimestre = ?, frequencia = ?, media_final = ? WHERE aluno_id = ? AND professor_id = ?");
            stmt.setFloat(1, d.getNota_1bimestre());
            stmt.setFloat(2, d.getNota_2bimestre());
            stmt.setFloat(3, d.getNota_3bimestre());
            stmt.setFloat(4, d.getNota_4bimestre());
            stmt.setFloat(5, d.getFrequencia());
            stmt.setFloat(6, d.getMedia_final());
            stmt.setInt(7, d.getAluno_id());
            stmt.setInt(8, Session.getSession().getId());
            
          
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

}
    
}
