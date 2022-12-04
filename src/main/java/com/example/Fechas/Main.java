package com.example.Fechas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

        System.out.println("\n=============== Ejercicio Fechas ================");


        System.out.println("1.- La fecha y hora actuales son: "+ LocalDateTime.now());
        System.out.println("\n2.- Formateo de fecha");

        LocalDateTime currentDateTime = LocalDateTime.now();

        // Formateo de la fecha al formato dado
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
        String formatDateTime = currentDateTime.format(format1);
        System.out.println(formatDateTime);

        /// Usando la propiedad LocalDateTime.now()
        LocalDateTime ahora = LocalDateTime.now();
        String formatDateTime2 = ahora.format(format1);
        System.out.println("ahora = " + formatDateTime2);

        /// Agregando 5 horas a la fecha actual y dando formato
        System.out.println("\nSuma de 5 horas");
        LocalDateTime fechaModificada = LocalDateTime.now();
        LocalDateTime newDate = fechaModificada.plusHours(5);
        String formartDateTime3 = newDate.format(format1);
        System.out.println("Fecha modificada: "+ formartDateTime3);


        // Comparacion entre las dos horas creadas anteriormente
        System.out.println("\nComparacion de las dos fechas");
        System.out.println("Diferencia en la duracion es de: "+ ChronoUnit.MINUTES.between(ahora,newDate) + " Minutos");

    }

}
