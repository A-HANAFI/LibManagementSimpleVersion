/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import beans.Categorie;
import dao.DaoCategorie;
import java.util.List;

/**
 *
 * @author Ahmed_s
 */
public class MetierCategorie {
    
    DaoCategorie dc = new DaoCategorie();
    
    public void addCategorie(Categorie c){dc.addCategorie(c);}
    public Categorie getCatById(int id){Categorie c = dc.getCategorieById(id);return c;}
    public List<Categorie>getAllCategories(){List <Categorie> lst = dc.getAllCategories();return lst;}
    }
