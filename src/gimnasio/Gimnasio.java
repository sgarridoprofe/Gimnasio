/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gimnasio;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author sergio
 */
public class Gimnasio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlmacenGimnasio al=new AlmacenGimnasio("C:\\ClasesBasicoII\\Gimnasio\\Ficheros");
        
        Socio s=new Socio("4455668", "Juan Gomez Perez");
        s.setTelefono("66655656");
        s.setSexo('M');
        s.setfMatricula(LocalDate.of(1988, 7, 25));
        
        /*Socio s2=new Socio("55889977", "María Fuentes Barrios");
        s2.setTelefono("22132145");
        s2.setSexo('F');
        s2.setfMatricula(LocalDate.of(1991, 11, 6));

        al.add(s);
        al.add(s2);
        
        al.guarda();
        */
        
        al.carga();
        //al.toString();
        System.out.println("Socios en fichero");
        System.out.println(al);
        //al.eliminaSocio(s);
        

        /*al.eliminaSocio("4455668");
        System.out.println("socio eliminado");
        System.out.println(al);
        */
        
        Registro r=new Registro(s, LocalDate.EPOCH, LocalTime.NOON);
        AlmacenRegistro almacenRegistro=new AlmacenRegistro("C:\\ClasesBasicoII\\Gimnasio\\Ficheros");

        almacenRegistro.add(r);
        almacenRegistro.guarda();
        
        
        System.out.println("Registros en fichero");
        System.out.println(al);
        System.out.println(almacenRegistro);

        
    }
    
}
