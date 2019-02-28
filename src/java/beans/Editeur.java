/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Ahmed_s
 */
public class Editeur {
    
    private int idEditeur;
    private String nomEditeur;
    private String PrenomEditeur;
    private String adresseEditeur;

    public Editeur(int idEditeur, String nomEditeur, String PrenomEditeur, String adresseEditeur) {
        this.idEditeur = idEditeur;
        this.nomEditeur = nomEditeur;
        this.PrenomEditeur = PrenomEditeur;
        this.adresseEditeur = adresseEditeur;
    }

    public int getIdEditeur() {
        return idEditeur;
    }

    public String getNomEditeur() {
        return nomEditeur;
    }

    public String getPrenomEditeur() {
        return PrenomEditeur;
    }

    public String getAdresseEditeur() {
        return adresseEditeur;
    }

    public void setIdEditeur(int idEditeur) {
        this.idEditeur = idEditeur;
    }

    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }

    public void setPrenomEditeur(String PrenomEditeur) {
        this.PrenomEditeur = PrenomEditeur;
    }

    public void setAdresseEditeur(String adresseEditeur) {
        this.adresseEditeur = adresseEditeur;
    }
    
    
}
