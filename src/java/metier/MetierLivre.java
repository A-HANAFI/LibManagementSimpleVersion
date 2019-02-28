/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import beans.Livre;
import dao.DaoLivre;

/**
 *
 * @author Ahmed_s
 */
public class MetierLivre {
    
    public void ajouterLivre(Livre l){DaoLivre DL = new DaoLivre();DL.ajouterLivre(l);}
    public void modifierLivre(Livre l){DaoLivre DL = new DaoLivre();DL.modifierLivre(l);}
    public void supprimerLivre(Livre l){DaoLivre DL = new DaoLivre();DL.supprimerLivre(l);}
    
}
