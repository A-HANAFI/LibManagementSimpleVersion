<%-- 
    Document   : Livre
    Created on : 28 févr. 2019, 16:19:03
    Author     : Ahmed_s
--%>

<%@page import="beans.Categorie"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="beans.Livre"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body id="body">
        <h3>Gestion Livre</h3>
        
        <form action="ServletLivre" method="Post">
            <table>
                
                <tr><td>ID:</td><td><input type="text" name="id" id="id" autofocus onchange="affiche()"></td> </tr>
                <tr><td>Libellé:</td><td><input type="text" name="libelle" id="libelle" onchange=""  ></td></tr>
                <tr><td>Prix unitaire:</td><td>  <input type="text" name="pu" id="PrUnitaire" ></td><td></td></tr>
                <tr><td>Catégorie:</td><td> <select name="categories">
                            <% List<Categorie> lstCategorie = new ArrayList<>();
               lstCategorie = (List)request.getAttribute("lstCategorie"); %>
              <% if(lstCategorie != null){ 
                    for(Categorie c : lstCategorie){  %>
                    
                    <% i++; %>
                    <tr >        
                        <option value=<%= c.getLibelleCategorie() %>><%= c.getLibelleCategorie() %></option>
                    </tr>
                    
                 <% }};%>        
                          </select></td></tr>
                <tr><td>Adherent:</td><td> <input type="text" name="adherent"id="Adherent" ></td></tr>
                <tr><td>Editeur:</td><td> <input type="text" name="editeur"id="Editeur" ></td></tr>
                <tr><td>    </td></tr>
                <tr>
                    <td><input type="submit" value="Ajouter" name="ajouter"></td>
                    <td><input type="submit" value="Supprimer" name="supprimer"></td>
                    <td><input type="submit" value="Modifier" name="modifier"></td>
                </tr>
                
            </table><br><br>
         
        </form>
        <br>
        
    
    
         <table style="width:30%;border: 1px solid black;" id="mytable" >
             
            <tr>
                <th style="width:30%;border:1px solid black">ID</th>
                <th style="width:30%;border:1px solid black">Libelle</th>
                <th style="width:30%;border:1px solid black">Prix Unitaire</th>
                <th style="width:30%;border:1px solid black">Categorie</th>
                <th style="width:30%;border:1px solid black">Adherent</th>
                <th style="width:30%;border:1px solid black">Editeur</th>
            </tr>  
            <%! int i ; %>
            <% i=0;%>
            <% List<Livre> lstLivre = new ArrayList<>();
               lstLivre = (List)request.getAttribute("lstLivre"); %>
            <% if(lstLivre != null){ 
                    for(Livre l:lstLivre){  %>
                    
                    <% i++; %>
                    <tr >        
                        <td style="width:30%;border:1px solid black" ><%= l.getIdLivre() %></td>
                        <td style="width:30%;border:1px solid black" ><%= l.getLibelleLivre() %></td>
                        <td style="width:30%;border:1px solid black" ><%= l.getPrUnLivre() %></td>
                        <td style="width:30%;border:1px solid black" ><%= l.getCatLivre().getLibelleCategorie() %></td>
                        <td style="width:30%;border:1px solid black" ><%= l.getAdhLivre().getNomAdherent() %> <%= l.getAdhLivre().getPrenomAdherent() %></td>
                        <td style="width:30%;border:1px solid black" ><%= l.getEditLivre().getNomEditeur() %> <%= l.getEditLivre().getPrenomEditeur()  %></td>
                    </tr>
                    
                 <% }};%>
                 
                 <script>
                     
                  function affiche(){
                      
                     var table = document.getElementById('mytable');
                        for (var r = 0, n = table.rows.length; r < n; r++) {
                        for (var c = 0, m = table.rows[r].cells.length; c < m; c++) {
                        console.log(table.rows[r].cells[c].innerHTML);
                        let t = table.rows[r].cells[c].innerHTML;
                        if (t == document.getElementById("id").value){
                            
                            document.getElementById("libelle").value= table.rows[r].cells[c+1].innerHTML;
                            document.getElementById("PrUnitaire").value= table.rows[r].cells[c+2].innerHTML;
                            document.getElementById("Categorie").value=  table.rows[r].cells[c+3].innerHTML;
                            document.getElementById("Adherent").value=  table.rows[r].cells[c+4].innerHTML;
                            document.getElementById("Editeur").value=  table.rows[r].cells[c+5].innerHTML;
                            
                        }
        }
    }

              
            
            }
                </script>
                
    </body>
</html>
