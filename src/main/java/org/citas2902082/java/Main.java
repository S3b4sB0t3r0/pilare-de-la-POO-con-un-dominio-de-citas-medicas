package org.citas2902082.java;

import java.time.LocalDateTime;
import java.time.Month;

import org.citas2902082.java.entities.Cita;
import org.citas2902082.java.entities.CitaMedico;
import org.citas2902082.java.entities.Enfermero;
import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Paciente;
import org.citas2902082.java.entities.Usuario;
import org.citas2902082.java.entities.enums.*;


public class Main {
    public static void main(String[] args) {
     
        Medico m = new Medico(1, "Cristhian", "Garcia" , TipoIdentificacion.CC, 1032677592L, 1312L, Especialidad.PEDIATRIA);
        System.out.println(m.toString());

        Medico m1 = new Medico(2, "Sebastian", "Botero" , TipoIdentificacion.TI, 1029144151L, 5598L, Especialidad.ODONTOLOGIA);
        System.out.println(m1.toString());

        Medico m2 = new Medico(3, "Valeria", "Arias" , TipoIdentificacion.TI, 1014865417L, 2008L, Especialidad.MEDICINA_GENERAL);
        System.out.println(m2.toString());


        Paciente p1 = new Paciente(1, "Juan", "Perez", TipoIdentificacion.CC, 1025864596L,
         "juanperez@gmail.com", 3208419466L, LocalDateTime.of(2024, Month.JANUARY ,15 , 1 , 30, (int) 35L), 1.80, 80 ,
          TipoSangre.AB, "+" );
          System.out.println(p1.toString());

         Paciente p2 = new Paciente(2, "Julian", "Gordo", TipoIdentificacion.CC, 1085468475L,
         "juliangordo10@gmail.com", 3228649336L, LocalDateTime.of(2024, Month.APRIL ,28 , 8 , 30, (int) 50L), 1.82, 75 ,
          TipoSangre.O, "+" );
          System.out.println(p2.toString());

        Paciente p3 = new Paciente(3, "Maria", "guerrero", TipoIdentificacion.CC, 1025234852L,
         "mariguerrero@gmail.com", 320847596L, LocalDateTime.of(2024, Month.DECEMBER ,10 , 5 , 37, (int) 55L), 1.65, 58 ,
          TipoSangre.A, "+" );
          System.out.println(p3.toString());
        
        Paciente p4 = new Paciente(4, "Nicolas", "Botero", TipoIdentificacion.TI, 1025852496L,
          "micolasbotero12@gmail.com", 3206219466L, LocalDateTime.of(2024, Month.MAY ,12 , 6 , 27, (int) 5L), 1.78, 65 ,
           TipoSangre.O, "-" );
           System.out.println(p4.toString());
        
        Paciente p5 = new Paciente(5, "Evelio", "Rodriguez", TipoIdentificacion.CC, 1025862656L,
           "eelio12@gmail.com", 3208418876L, LocalDateTime.of(2024, Month.SEPTEMBER ,8 , 2 , 39, (int) 55L), 1.75, 85 ,
            TipoSangre.AB, "-" );
            System.out.println(p5.toString());

           
        


        Enfermero e1 = new Enfermero(1, "sebastian", "Botero", TipoIdentificacion.CC, 1029144151L);
        System.out.println(e1.toString());



        Enfermero e2 = new Enfermero(2, "Evelio", "Botero", TipoIdentificacion.CC, 79854164L);
        System.out.println(e2.toString());

        Enfermero e3 = new Enfermero(3, "Gladys", "Omaira", TipoIdentificacion.CC, 875946241L);
        System.out.println(e3.toString());


 
        CitaMedico ct1 = new CitaMedico(1, LocalDateTime.of(2024, Month.APRIL, 5, 9, 25, 30), p2, "Gripa", m1, Estados.REASIGNADA);
        System.out.println(ct1.toString());

         
        CitaMedico ct2 = new CitaMedico(2, LocalDateTime.of(2024, Month.APRIL, 5, 9, 2, 30), p5, "Escolopia", m2, Estados.CANCELADA);
        System.out.println(ct2.toString());


    }
}