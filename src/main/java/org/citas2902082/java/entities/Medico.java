package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.*;

public class Medico extends Usuario {

    private Long registroMedico;
    private Especialidad especialidad;

    // constructor parametrizado
    public Medico(Integer id, 
                    String nombres
                    ,String apellidos,
                    TipoIdentificacion tipoIdentificacion,
                    Long numeroIdentificacion,
                     Long registroMedico, 
                     Especialidad especialidad) {

        // constructor de la clase padre
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico [registroMedico=" + registroMedico + ", id=" + id + ", nombres=" + nombres + ", especialidad="
                + especialidad + ", apellidos=" + apellidos + ", tipoIdentificacion=" + tipoIdentificacion
                + ", numeroIdentificacion=" + numeroIdentificacion + "]";
    }






    
    

}
