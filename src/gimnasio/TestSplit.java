/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio;

/**
 *
 * @author sergio
 */
public class TestSplit {
   public static void main(String[] args) {
       String cadena="juanan;yahoo;es";
       
       String[] datos=cadena.split(";");
       
       for(int i=0;i<datos.length;i++)
           System.out.println("campo:"+datos[i]);
       
   } 
}
