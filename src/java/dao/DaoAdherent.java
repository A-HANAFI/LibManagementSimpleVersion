/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Adherent;
import beans.Adherent;
import beans.Categorie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utilitaire.Singleton;

/**
 *
 * @author Ahmed_s
 */
public class DaoAdherent {
    private Connection cx = Singleton.getCx();
    
    public void addAdherent(Adherent a)
    {
        try {
            String sql = "insert into adherent values(?,?,?)";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1,a.getIdAdherent() );
            ps.setString(2, a.getNomAdherent());
            ps.setString(3, a.getPrenomAdherent());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public Adherent getAdherentById(int id)
    {
        Adherent a = null;
        try{
            String sql = "select * from Adherent where idAdherent=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                 a = new Adherent(rs.getInt(1),rs.getString(2),rs.getString(3));
            }
        }catch(SQLException ex){
            ex.printStackTrace();}
        
        return a;
    }
    
    public List<Adherent> getAllAdherents(){
    
    String sql ="select * from Adherent";
    List <Adherent> lstAdherent = new ArrayList<> ();
        try {
            Statement st = cx.createStatement();
            ResultSet res = st.executeQuery(sql);
            while(res.next()){
                Adherent a = this.getAdherentById(res.getInt(1));
                lstAdherent.add(a);
            }
            
        } catch (SQLException ex) {
               ex.printStackTrace();
        }
    return lstAdherent;
}
}
