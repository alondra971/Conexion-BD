
import Controlador.ClsCategoria;
import Controlador.ConexionBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       ClsCategoria c=new ClsCategoria();
       try{
           c.createCategoria("23", "Azucar", "1");
       c.reporteCategoria();
       } catch (SQLException ex) {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
 }  
            

