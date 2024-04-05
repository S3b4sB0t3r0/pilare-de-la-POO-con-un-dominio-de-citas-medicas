package org.citas2902082.java.entities;
 import java.time.*;


public class Cita {
    protected Integer id;
    protected LocalDateTime fecha;
    protected Paciente paciente;
    protected Consultorio consultorio;


    //constructor
    public Cita(Integer id, LocalDateTime fecha, Paciente paciente) {
        this.fecha = fecha;
        this.paciente = paciente;
    }


    //getters y setters
    public LocalDateTime getFecha() {
        return fecha;
    }

    public Cita(Consultorio consultorio) {
        this.consultorio = consultorio;
    }


    public Consultorio getConsultorio() {
        return consultorio;
    }


    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
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


    @Override
    public String toString() {
        return "Cita [id=" + id + ", fecha=" + fecha + ", paciente=" + paciente + ", consultorio=" + consultorio + "]";
    }



    


    
    


}
