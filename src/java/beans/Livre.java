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
public class Livre {
    
    private int idLivre;
    private String libelleLivre;
    private Float prUnLivre;

    /**
     *
     */
    private Categorie catLivre;
    private Adherent adhLivre;
    private Editeur editLivre;

    public Livre(int idLivre, String libelleLivre, Float prUnLivre) {
        this.idLivre = idLivre;
        this.libelleLivre = libelleLivre;
        this.prUnLivre = prUnLivre;
    }
    
    
    
    public Livre(int idLivre, String libelleLivre, Float prUnLivre, Categorie catLivre, Adherent adhLivre,Editeur editeur) {
        this.idLivre = idLivre;
        this.libelleLivre = libelleLivre;
        this.prUnLivre = prUnLivre;
        this.catLivre = catLivre;
        this.adhLivre = adhLivre;
        this.editLivre = editeur;
    }

    public Editeur getEditLivre() {
        return editLivre;
    }

    public void setEditLivre(Editeur editLivre) {
        this.editLivre = editLivre;
    }

    public int getIdLivre() {
        return idLivre;
    }

    public String getLibelleLivre() {
        return libelleLivre;
    }

    public Float getPrUnLivre() {
        return prUnLivre;
    }

    public Categorie getCatLivre() {
        return catLivre;
    }

    public Adherent getAdhLivre() {
        return adhLivre;
    }

    public void setIdLivre(int idLivre) {
        this.idLivre = idLivre;
    }

    public void setLibelleLivre(String libelleLivre) {
        this.libelleLivre = libelleLivre;
    }

    public void setPrUnLivre(Float prUnLivre) {
        this.prUnLivre = prUnLivre;
    }

    public void setCatLivre(Categorie catLivre) {
        this.catLivre = catLivre;
    }

    public void setAdhLivre(Adherent adhLivre) {
        this.adhLivre = adhLivre;
    }
    
    
    
    
}
