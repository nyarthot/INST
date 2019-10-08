/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ins;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.write.WriteException;

/**
 *
 * @author User
 */
public class GenerarExcel {

   public static Generador g=new Generador();
    
    public static void main (String[] args) {
        
        String [][] entrada=new String[5][5];
        entrada[0][0]="nombre";
        entrada[0][1]="Ap.paterno";
        entrada[0][2]="Ap.materno";
        entrada[0][3]="Edad";
        entrada[0][4]="nombre";
        
        String ruta="C:\\Users\\User\\Desktop/salida.xls";
        
       try {
           g.GenerarExcel(entrada, ruta);
       } catch (IOException ex) {
           Logger.getLogger(GenerarExcel.class.getName()).log(Level.SEVERE, null, ex);
       } catch (WriteException ex) {
           Logger.getLogger(GenerarExcel.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
}
