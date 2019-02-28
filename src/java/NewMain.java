
import beans.Adherent;
import beans.Categorie;
import beans.Editeur;
import beans.Livre;
import dao.DaoAdherent;
import dao.DaoCategorie;
import dao.DaoEditeur;
import dao.DaoLivre;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed_s
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DaoLivre dl = new DaoLivre();
        DaoCategorie dc= new DaoCategorie();
        DaoEditeur de= new DaoEditeur();
        DaoAdherent da = new DaoAdherent();
        
        List<Categorie> lst = dc.getAllCategories();
        for(int i=0;i < 2 ;i++){
            System.out.println(lst.get(i).getIdCategorie());
            System.out.println(lst.get(i).getLibelleCategorie());
        }
    
}}

