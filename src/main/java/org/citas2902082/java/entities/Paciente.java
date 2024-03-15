package org.citas2902082.java.entities;

import java.time.*;
import org.citas2902082.java.entities.enums.*;

public class Paciente extends Usuario {

    
    private String email;
    private Integer celular;
    private LocalDateTime fechaNacimiento;
    private Double altura;
    private Double peso;
    private Sangre sangre;
    private char factorRH;
    
    public Paciente(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion, String email, Integer celular, LocalDateTime fechaNacimiento, Double altura,
            Double peso, Sangre sangre, char factorRH) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.email = email;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.sangre = sangre;
        this.factorRH = factorRH;
    }

    // constructor
    
    
}
