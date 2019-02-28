/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Adherent;
import beans.Editeur;
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
public class DaoEditeur {
    
    private Connection cx = Singleton.getCx();
    
    public void addEditeur(Editeur e)
    {
        try {
            String sql = "insert into editeur values(?,?,?,?)";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1,e.getIdEditeur() );
            ps.setString(2, e.getNomEditeur());
            ps.setString(3, e.getPrenomEditeur());
            ps.setString(4, e.getAdresseEditeur());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public Editeur getEditeurById(int id)
    {
        Editeur e = null;
        try{
            String sql = "select * from Editeur where idEditeur=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                 e = new Editeur(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
            }
        }catch(SQLException ex){
            ex.printStackTrace();}
        
        return e;
    }
    
    public List<Editeur> getAllEditeurs(){
    
    String sql ="select * from Editeur";
    List <Editeur> lstEditeur = new ArrayList<> ();
        try {
            Statement st = cx.createStatement();
            ResultSet res = st.executeQuery(sql);
            while(res.next()){
                Editeur a = this.getEditeurById(res.getInt(1));
                lstEditeur.add(a);
            }
            
        } catch (SQLException ex) {
               ex.printStackTrace();
        }
    return lstEditeur;
}
}
