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
import model.bean.Turma;

/**
 *
 * @author MIcro
 */
public class TurmaDao {
    private Connection con = null;

    public TurmaDao() {
        con = ConnectionFactory.getConnection();
    }

        public List<Turma> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Turma> turmas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM turmas");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Turma t = new Turma();

                t.setId(rs.getInt("id"));
                t.setSerie(rs.getString("serie"));
                t.setLetra(rs.getString("letra"));
                t.setPeriodo(rs.getString("periodo"));
                turmas.add(t);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return turmas;

    }
    }

   
    
