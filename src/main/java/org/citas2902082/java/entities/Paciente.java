package org.citas2902082.java.entities;

import java.time.*;
import org.citas2902082.java.entities.enums.*;

public class Paciente extends Usuario {


    public String email;
    public Integer celular;
    public LocalDateTime fechaNacimiento;
    public Double altura;
    public Double peso;
    public TipoSangre sangre;
    public String factorRH;
    
    public Paciente(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion, String email, long l, LocalDateTime fechaNacimiento, Double altura,
            int i, TipoSangre ab, String string) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.email = email;
        this.celular = (int) l;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = (double) i;
        this.sangre = ab;
        this.factorRH = string;
    }

    //public Paciente(int id, String nombres, String apellidos, TipoIdentificacion cc, long numeroIdentificacion,
           // String email2, long l, LocalDateTime of, double altura2, int i, TipoSangre ab, String string) {
        //TODO Auto-generated constructor stub
    //}






    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoSangre getSangre() {
        return sangre;
    }

    public void setSangre(TipoSangre sangre) {
        this.sangre = sangre;
    }

    public String getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(String factorRH) {
        this.factorRH = factorRH;
    }

    @Override
    public String toString() {
        return "Paciente [email=" + email + ", celular=" + celular + ", fechaNacimiento=" + fechaNacimiento
                + ", altura=" + altura + ", peso=" + peso + ", sangre=" + sangre + ", factorRH=" + factorRH + "]";
    }


    }





