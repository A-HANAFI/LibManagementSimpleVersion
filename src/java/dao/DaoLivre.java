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
import beans.Categorie;

/**
 *
 * @author Ahmed_s
 */
public class DaoLivre {
    private Connection cx = Singleton.getCx();
            
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
            
            System.out.println("ligne modifier");
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
}
