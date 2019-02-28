/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Livre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utilitaire.Singleton;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Ahmed_s
 */
public class DaoLivre {
    private Connection cx = Singleton.getCx();
    private DaoCategorie dc = new DaoCategorie();
    private DaoEditeur de = new DaoEditeur();
    private DaoAdherent da = new DaoAdherent();
    
    public void ajouterLivre(Livre l)
    {
        try{
            String sql="insert into livre values(?,?,?,?,?,?)";
            
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, l.getIdLivre());
            ps.setString(2,l.getLibelleLivre());
            ps.setFloat(3, l.getPrUnLivre());
            ps.setInt(4,(int)l.getCatLivre().getIdCategorie());
            ps.setInt(5,l.getAdhLivre().getIdAdherent());
            ps.setInt(6,l.getEditLivre().getIdEditeur());
            ps.executeUpdate();
            System.out.println("ligne ajouter");
        }catch(SQLException e){e.printStackTrace();}
    }
    
    public void modifierLivre(Livre l)
    {
        try{
            String sql ="update livre set idLivre=?, libelleLivre=?, prUnLivre=?, catLivre=?, adhLivre=?, editLivre=? where idLivre =?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1,l.getIdLivre() );
            ps.setString(2,l.getLibelleLivre() );
            ps.setFloat(3,l.getPrUnLivre() );
            ps.setInt(4,l.getCatLivre().getIdCategorie() );
            ps.setInt(5,l.getAdhLivre().getIdAdherent() );
            ps.setInt(6,l.getEditLivre().getIdEditeur() );
            ps.setInt(7,l.getIdLivre() );
            
            ps.executeUpdate();
            
        }catch(SQLException e){e.printStackTrace();}
    }
    public void supprimerLivre(Livre l)
    {
        try{
            String sql="delete from livre where idLivre=?";
            
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, l.getIdLivre());
            
            ps.executeUpdate();
            System.out.println("ligne supprimer");
        }catch(SQLException e){e.printStackTrace();}
    }
    public int getIdCategorie(int id){ 
        int idcat = 0;
        try {
            
            String sql="select catLivre from Livre where idLivre=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                 idcat = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("l id du categorie = "+idcat);
        return idcat;
    }
        public int getIdAdherent(int id){ 
        int id1 = 0;
        try {
            
            String sql="select adhLivre from Livre where idLivre=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                 id1 = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("l id du adherent = "+id1);
        return id1;
    }
            public int getIdEditeur(int id){ 
        int id1 = 0;
        try {
            
            String sql="select editLivre from Livre where idLivre=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                 id1 = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("l id du categorie = "+id1);
        return id1;
    }
            
    public Livre getLivreById(int id){
        
        Livre l = null;
        try {
            String sql = "select * from livre where idLivre=?";
            
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                
                l = new Livre(rs.getInt(1),rs.getString(2),rs.getFloat(3),dc.getCategorieById(rs.getInt(4)),da.getAdherentById(rs.getInt(5)),de.getEditeurById(rs.getInt(6)));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
     return  l;  
    }
    public List<Livre> getAllLivre(){
    
    String sql ="select * from Livre";
    List <Livre> lstLivre = new ArrayList<> ();
        try {
            Statement st = cx.createStatement();
            ResultSet res = st.executeQuery(sql);
            while(res.next()){
                Livre l = this.getLivreById(res.getInt(1));
                lstLivre.add(l);
            }
            
        } catch (SQLException ex) {
               ex.printStackTrace();
        }
    return lstLivre;
}
}
