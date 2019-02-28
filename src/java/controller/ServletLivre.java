/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Adherent;
import beans.Categorie;
import beans.Editeur;
import beans.Livre;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.MetierAdherent;
import metier.MetierCategorie;
import metier.MetierEditeur;
import metier.MetierLivre;

/**
 *
 * @author Ahmed_s
 */
public class ServletLivre extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
           MetierLivre ML = new MetierLivre();
           MetierCategorie MC = new MetierCategorie();
           MetierAdherent MA = new MetierAdherent();
           MetierEditeur ME = new MetierEditeur();
           
          int id = (Integer.parseInt(request.getParameter("id")));
          request.setAttribute("id", id);
          String lib  = (request.getParameter("libelle"));
          request.setAttribute("libelle", lib);
          Float pu = (Float.parseFloat(request.getParameter("pu")));
          request.setAttribute("pu", pu);
          Categorie cat = MC.getCatById(Integer.parseInt(request.getParameter("categorie")));
          request.setAttribute("categorie", cat);
          Adherent adh = MA.getAdhById(Integer.parseInt(request.getParameter("adherent")));
          request.setAttribute("adherent", adh);
          Editeur ed = ME.getEditById(Integer.parseInt(request.getParameter("editeur")));
          request.setAttribute("editeur", ed);
          
          
          if(request.getParameter("ajouter") != null )
            {
            Livre l = new Livre(id,lib,pu,cat,adh,ed);
                ML.ajouterLivre(l);
            }
          
          if (request.getParameter("supprimer") != null)
            {
                Livre l ;
                l = ML.getLivById(Integer.parseInt(request.getParameter("id")));
                ML.supprimerLivre(l);
            }
          
          if(request.getParameter("modifier") != null )
            {
            Livre l = new Livre(id,lib,pu,cat,adh,ed);
            
                ML.modifierLivre(l);
            }
          
            List <Livre> lstLivre = new ArrayList<>();
            lstLivre = ML.getAllLivres();
            request.setAttribute("lstLivre",(List) lstLivre);
            
            List <Categorie> lstCategorie = new ArrayList<>();
            lstCategorie = MC.getAllCategories();
            request.setAttribute("lstCategorie", lstCategorie);
            
            List <Adherent> lstAdherent = new ArrayList<>();
            lstAdherent = MA.getAllAdherent();
            request.setAttribute("lstAdherent", lstAdherent);
            
            List <Editeur> lstEditeur = new ArrayList<>();
            lstEditeur = ME.getAllEditeurs();
            request.setAttribute("lstEditeur", lstEditeur);
            
          request.getRequestDispatcher("/Livre.jsp").forward(request, response);      
    }}

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

