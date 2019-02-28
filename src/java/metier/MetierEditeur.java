/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import beans.Editeur;
import beans.Editeur;
import dao.DaoEditeur;
import java.util.List;

/**
 *
 * @author Ahmed_s
 */
public class MetierEditeur {
    
    DaoEditeur de = new DaoEditeur();
    
    public void addEditeur(Editeur e){de.addEditeur(e);}
    public Editeur getEditById(int id){Editeur e = de.getEditeurById(id);return e;}
    public List<Editeur>getAllEditeurs(){List <Editeur> lst = de.getAllEditeurs();return lst;}
}
