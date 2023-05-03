/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author sergio
 */
public class AlmacenRegistro {
    private ArrayList<Registro> registros;
    private String pathFichero;
    private final String nombreFichero="registro.csv";

    public AlmacenRegistro(String pathFichero) {
        this.pathFichero = pathFichero;
        registros=new ArrayList<>();
        
    }
    
    public void add(Registro r){
        this.registros.add(r);
    }
    
    public void entradaSocio(Socio s, LocalDate fentrada, LocalTime hentrada){
    
        this.registros.add(new Registro(s,fentrada,hentrada));
    }
    
    private void addLineaRegistro(String lineaRegistro, char separador){
        
        String[] datos=lineaRegistro.split(""+separador);
          
        
        Registro r=new Registro( new Socio(datos[0],"") , LocalDate.parse(datos[1]),
            LocalTime.parse(datos[4]));
        r.setHoraSalida(LocalTime.parse(datos[5]));
        add(r);
    }
    
    public void carga(){
    String linea;
    try{
        BufferedReader fileBr=new BufferedReader(new FileReader(this.pathFichero + "\\" + this.nombreFichero));
        while((linea=fileBr.readLine())!=null)
            addLineaRegistro(linea,';');
        fileBr.close();
    }catch(Exception e){
        System.out.println("Error al cargar "+ e.getMessage());
    }
    
    }
    
    public void guarda(){
     
     try{
        PrintWriter file=new PrintWriter(this.pathFichero + "\\" + this.nombreFichero);
        for(Registro r:this.registros){
            file.println(r.getCsv(';'));
        }
        file.close();
     }catch(Exception e){
        System.out.println("Error al guardar "+ e.getMessage());
     }   
    }
    
    
     @Override
    public String toString(){
        String salida="";
        for(Registro r:this.registros){
            salida+=r.toString() + "\n";
        }
        return salida;
    }
}
