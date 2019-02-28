/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import beans.Adherent;
import dao.DaoAdherent;
import java.util.List;

/**
 *
 * @author Ahmed_s
 */
public class MetierAdherent {
    
    DaoAdherent da = new DaoAdherent();
    
    public void addAdherent(Adherent a){da.addAdherent(a);}
    public Adherent getAdhById(int id){Adherent a = da.getAdherentById(id);return a;}
    public List<Adherent> getAllAdherent(){List lst = da.getAllAdherents();return lst;}
}
