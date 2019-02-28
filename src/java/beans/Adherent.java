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
public class Adherent {
    
    private int idAdherent;
    private String nomAdherent;
    private String prenomAdherent;
    

    public Adherent(int idAdherent, String nomAdherent, String prenomAdherent) {
        this.idAdherent = idAdherent;
        this.nomAdherent = nomAdherent;
        this.prenomAdherent = prenomAdherent;
        
    }

    public int getIdAdherent() {
        return idAdherent;
    }

    public String getNomAdherent() {
        return nomAdherent;
    }

    public String getPrenomAdherent() {
        return prenomAdherent;
    }

    public void setIdAdherent(int idAdherent) {
        this.idAdherent = idAdherent;
    }

    public void setNomAdherent(String nomAdherent) {
        this.nomAdherent = nomAdherent;
    }

    public void setPrenomAdherent(String prenomAdherent) {
        this.prenomAdherent = prenomAdherent;
    }
    
    
}
