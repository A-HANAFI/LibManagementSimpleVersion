/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.Date;

/**
 *
 * @author Ahmed_s
 */
public class Emprunt {
    
    private int idEmprunt;
    private Livre livreEmprunt;
    private Client clientEmprunt;
    private Date dateEmprunt;
    private Adherent adherentEmprunt;
    private String etatEmprunt;

    public Emprunt(int idEmprunt, Livre livreEmprunt, Client clientEmprunt, Date dateEmprunt, Adherent adherentEmprunt, String etatEmprunt) {
        this.idEmprunt = idEmprunt;
        this.livreEmprunt = livreEmprunt;
        this.clientEmprunt = clientEmprunt;
        this.dateEmprunt = dateEmprunt;
        this.adherentEmprunt = adherentEmprunt;
        this.etatEmprunt = etatEmprunt;
    }

    public int getIdEmprunt() {
        return idEmprunt;
    }

    public Livre getLivreEmprunt() {
        return livreEmprunt;
    }

    public Client getClientEmprunt() {
        return clientEmprunt;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public Adherent getAdherentEmprunt() {
        return adherentEmprunt;
    }

    public String getEtatEmprunt() {
        return etatEmprunt;
    }

    public void setIdEmprunt(int idEmprunt) {
        this.idEmprunt = idEmprunt;
    }

    public void setLivreEmprunt(Livre livreEmprunt) {
        this.livreEmprunt = livreEmprunt;
    }

    public void setClientEmprunt(Client clientEmprunt) {
        this.clientEmprunt = clientEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public void setAdherentEmprunt(Adherent adherentEmprunt) {
        this.adherentEmprunt = adherentEmprunt;
    }

    public void setEtatEmprunt(String etatEmprunt) {
        this.etatEmprunt = etatEmprunt;
    }
    
    
}
