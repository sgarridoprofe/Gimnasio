/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author sergio
 */
public class Socio {
    private String dni;
    private String nombre;
    private String telefono;
    private LocalDate fMatricula;
    private char sexo; 

    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        
    }

    public LocalDate getfMatricula() {
        return fMatricula;
    }

    public void setfMatricula(LocalDate fMatricula) {
        this.fMatricula = fMatricula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getCsv(char separador){
        //char separador=',';
        
        return "" + this.getDni() + separador +
                this.getNombre() + separador +
                this.getTelefono() + separador +
                this.getfMatricula() + separador +
                this.getSexo(); 
    }
    
    @Override
    public String toString(){
    return "" + this.getDni() + ":" +
                this.getNombre() + ":" +
                this.getTelefono() + ":" +
                this.getfMatricula() + ":" +
                this.getSexo(); 
    }

   /* @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.dni);
        return hash;
    }*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Socio other = (Socio) obj;
        return Objects.equals(this.dni, other.dni);
    }
    
    
    
    
}
