package org.citas2902082.java.entities;
 import java.time.*;
import org.citas2902082.java.entities.Paciente;

public class Cita {
    private LocalDateTime fecha;
    private Paciente paciente;


    //constructor
    public Cita(LocalDateTime fecha, Paciente paciente) {
        this.fecha = fecha;
        this.paciente = paciente;
    }


    //getters y setters
    public LocalDateTime getFecha() {
        return fecha;
    }


    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public Paciente getPaciente() {
        return paciente;
    }


    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    


    
    


}
