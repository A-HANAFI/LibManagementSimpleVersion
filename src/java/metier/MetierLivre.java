/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import beans.Livre;
import dao.DaoLivre;
import java.util.List;

/**
 *
 * @author Ahmed_s
 */
public class MetierLivre {
    DaoLivre DL = new DaoLivre();
    public void ajouterLivre(Livre l){DL.ajouterLivre(l);}
    public void modifierLivre(Livre l){DL.modifierLivre(l);}
    public void supprimerLivre(Livre l){DL.supprimerLivre(l);}
    public List<Livre> getAllLivres(){List<Livre> lst = DL.getAllLivre();return lst;}
    public Livre getLivById(int id){Livre l = DL.getLivreById(id);return l;}
}
