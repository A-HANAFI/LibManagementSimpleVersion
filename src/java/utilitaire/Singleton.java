/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ahmed_s
 */
public class Singleton {
     private static Connection cx; 
    
    static
    {
       try{
           System.out.println("connexion en cours ...");
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Pilote chargé");
       }
       catch(ClassNotFoundException e){
           System.out.println("Erreur de chargement de pilote");
           
           
           e.printStackTrace();
       }
       //ClassNotFoundException
       
       try{
           cx=DriverManager.getConnection("jdbc:mysql://localhost:3306/libmanagementsimpleversion","root","");
           System.out.println("Connexion effectué");
       }
       catch(SQLException e){
           System.out.println("Problème de connection");
           System.out.println("Nb: si erreur 'performance_schema' il faut effectuer:");
           System.out.println("'set @@global.show_compatibility_56=ON' => comme requete SQL sur la base donnee");
           e.printStackTrace();
       };
    }
    
    public static Connection getCx(){
        return cx;
    }
}
