/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Categorie;
import beans.Livre;
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
public class DaoCategorie {
    private Connection cx = Singleton.getCx();
    
    public void addCategorie(Categorie c)
    {
        try {
            String sql = "insert into categorie values(?,?)";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1,c.getIdCategorie() );
            ps.setString(2, c.getLibelleCategorie());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public Categorie getCategorieById(int id)
    {
        Categorie c = null;
        try{
            String sql = "select * from categorie where idCategorie=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                 c = new Categorie(rs.getInt(1),rs.getString(2));
            }
        }catch(SQLException ex){
            ex.printStackTrace();}
        
        return c;
    }
    public List<Categorie> getAllCategories(){
    
    String sql ="select * from Categorie";
    List <Categorie> lstCategorie = new ArrayList<> ();
        try {
            Statement st = cx.createStatement();
            ResultSet res = st.executeQuery(sql);
            while(res.next()){
                Categorie c = this.getCategorieById(res.getInt(1));
                lstCategorie.add(c);
            }
            
        } catch (SQLException ex) {
               ex.printStackTrace();
        }
    return lstCategorie;
}
}
