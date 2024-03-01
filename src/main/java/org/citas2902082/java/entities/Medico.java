package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Medico {

 public Integer id;
 public String nombre;
 public String apellido;
 public TipoIdentificacion tipoIdentificacion;
 public Integer numeroIdentificacion;
 public Integer registroMedico;
 public Especialidad especialidad;

 //constructores
public Medico(String nombre, String apellido, TipoIdentificacion tipoIdentificacion, Integer numeroIdentificacion,
        Integer registroMedico, Especialidad especialidad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.tipoIdentificacion = tipoIdentificacion;
    this.numeroIdentificacion = numeroIdentificacion;
    this.registroMedico = registroMedico;
    this.especialidad = especialidad;
}

}
