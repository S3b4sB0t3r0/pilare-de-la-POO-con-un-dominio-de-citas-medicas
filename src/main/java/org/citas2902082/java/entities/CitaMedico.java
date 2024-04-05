package org.citas2902082.java.entities;


import org.citas2902082.java.entities.enums.Estados;
import java.time.*;

public class CitaMedico extends Cita implements IAgendable {

private String motivo;
private Medico medico;
public Estados estados;



public CitaMedico(Integer id,LocalDateTime fecha, Paciente paciente, String motivo, Medico medico ,Estados estados) {
    super(id , fecha, paciente);
    this.motivo = motivo;
    this.medico = medico;
    this.estados = estados;
}



//getters y setters
public String getMotivo() {
    return motivo;
}


public void setMotivo(String motivo) {
    this.motivo = motivo;
}


public Medico getMedico() {
    return medico;
}


public void setMedico(Medico medico) {
    this.medico = medico;
}



public Estados getEstados() {
    return estados;
}



public void setEstados(Estados estados) {
    this.estados = estados;
}


//metodos heredados del padre
@Override
public void agendarCita(LocalDateTime fecha) {
    super.setFecha(fecha);
}



@Override
public void cancelarCita() {
this.estados = Estados.CANCELADA;
}



@Override
public void reAgendarCita(LocalDateTime fecha) {
    super.setFecha(fecha);
}



@Override
public String toString() {
    return "CitaMedico [motivo=" + motivo + ", medico=" + medico + ", estados=" + getEstados() + "]";
}



















  
}
