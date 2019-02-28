
import beans.Adherent;
import beans.Categorie;
import beans.Editeur;
import beans.Livre;
import dao.DaoLivre;

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
        Categorie c = new Categorie(1,"Roman");
        Adherent a = new Adherent(1,"ali","salah");
        Editeur e = new Editeur(1,"mohamed","bachir","1 rue aziza othmana");
        Livre l  = new Livre(1,"test3",(float)10.5,c,a,e);
        dl.supprimerLivre(l);
    }
    
}
