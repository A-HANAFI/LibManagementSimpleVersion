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
public class Client {
    
    private int idClient;
    private int numCinClient;
    private String nomClient;
    private String prenomClient;
    private String adresseClient;

    public Client(int idClient, int numCinClient, String nomClient, String prenomClient, String adresseClient) {
        this.idClient = idClient;
        this.numCinClient = numCinClient;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.adresseClient = adresseClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public int getNumCinClient() {
        return numCinClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setNumCinClient(int numCinClient) {
        this.numCinClient = numCinClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }
    
    
    
}
