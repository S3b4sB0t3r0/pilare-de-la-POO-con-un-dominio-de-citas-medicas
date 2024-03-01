package org.citas2902082.java.entities;

import java.time.LocalDate;
import org.citas2902082.java.entities.enums.TipoIdentificacion;
import org.citas2902082.java.entities.enums.TipoSangre;



public class Paciente {

    public Integer id;
    public String nombre;
    public String apeliido;
    public TipoIdentificacion tipoIdentificacion;
    public Integer numeroIdentificacion;
    public String correoElectronico;
    public Integer celular;
    public LocalDate fechaNacimiento;
    public Double altura;
    public Double peso;
    public TipoSangre tipoSangre;
    public char factorRH;

    //constructores
    public Paciente(String nombre, String apeliido, TipoIdentificacion tipoIdentificacion, Integer numeroIdentificacion,
            String correoElectronico, Integer celular, LocalDate fechaNacimiento, Double altura, Double peso,
            TipoSangre tipoSangre, char factorRH) {
        this.nombre = nombre;
        this.apeliido = apeliido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }



}
