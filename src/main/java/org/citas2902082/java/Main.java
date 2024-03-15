package org.citas2902082.java;

import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Usuario;
import org.citas2902082.java.entities.enums.*;


public class Main {
    public static void main(String[] args) {
     
        Medico m = new Medico(1, "Cristhian", "Garcia" , TipoIdentificacion.CC, 1032677592L, 1312L, Especialidad.PEDIATRIA);
        System.out.println(m.toString());

        
        




    }
}