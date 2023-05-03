/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sergio
 */
public class AlmacenGimnasio {
    private ArrayList<Socio> socios;
    private String pathFichero;
    private final String nombreFichero="datos.csv";

    public AlmacenGimnasio(String pathFichero) {
        this.pathFichero = pathFichero;
        socios=new ArrayList<>();
    }
    
    public void add(Socio s){
        socios.add(s);
    }
    
    private void addLineaSocio(String lineaSocio, char separador){
        
        String[] datos=lineaSocio.split(""+separador);
        //creamos socio


        Socio s=new Socio(datos[0], datos[1]);
        s.setTelefono(datos[2]);
        s.setfMatricula(LocalDate.parse(datos[3]));
        s.setSexo(datos[4].charAt(0));
        //socios.add(s);
        add(s);
    }
    
    public void carga(){
    String linea;
    try{
        BufferedReader fileBr=new BufferedReader(new FileReader(this.pathFichero + "\\" + this.nombreFichero));
        while((linea=fileBr.readLine())!=null)
            addLineaSocio(linea,';');
        fileBr.close();
    }catch(Exception e){
        System.out.println("Error al cargar "+ e.getMessage());
    }
    
    }
    
    public void guarda(){
     
     try{
        PrintWriter file=new PrintWriter(this.pathFichero + "\\" + this.nombreFichero);
        for(Socio s:socios){
            file.println(s.getCsv(';'));
        }
        file.close();
     }catch(Exception e){
        System.out.println("Error al guardar "+ e.getMessage());
     }   
    }
    
    public int existeSocio(String dni){
        
        for(int i=0;i<socios.size();i++){  
            if (socios.get(i).getDni().equalsIgnoreCase(dni)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean eliminaSocio(String dni){
    
        int pos=existeSocio(dni);
        
        if (pos!=-1){
           socios.remove(pos);
           return true;
        }else{
            return false;
        }
            
    }
    
    
    public boolean eliminaSocio(Socio s){
        socios.remove(s);
        return true;
    }
    
    
    
    @Override
    public String toString(){
        String salida="";
        for(Socio s:socios){
            salida+=s.toString() + "\n";
        }
        return salida;
    }
         
    
    
    
}
  
