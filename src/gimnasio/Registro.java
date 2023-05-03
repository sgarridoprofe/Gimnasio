/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author sergio
 */
public class Registro {
    private Socio socio;
    private LocalDate fecha;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    public Registro(Socio socio, LocalDate fecha, LocalTime horaEntrada) {
        this.socio = socio;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    public String getCsv(char separador){
        //char separador=',';
        
        return "" + this.getSocio().getDni() + separador +
                this.getFecha()+ separador +
                this.getHoraEntrada()+ separador +
                this.getHoraSalida();
    }
    
    
    @Override
    public String toString(){
        //char separador=',';
        
        return "" + this.getSocio().getDni() + ":" +
                this.getFecha()+ ":" +
                this.getHoraEntrada()+ ":" +
                this.getHoraSalida();
    }
}
