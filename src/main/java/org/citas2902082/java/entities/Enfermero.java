package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.*;


public class Enfermero extends Usuario {




    public Enfermero(Integer id,
                     String nombres, 
                     String apellidos, 
                     TipoIdentificacion tipoIdentificacion,
                    Long numeroIdentificacion) {
        // constructor de la clase padre
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
    }


    @Override
    public String toString() {
        return "Enferemero [id=" + id + ", nombre=" + nombres + ", apellidos=" + apellidos + ", tipo de identificacion="
                + tipoIdentificacion + ", Numero de identificacion=" + numeroIdentificacion +  "]";
    }



//getter y seter











}
