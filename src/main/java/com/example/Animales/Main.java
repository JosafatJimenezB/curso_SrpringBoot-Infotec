package com.example.Animales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws InterruptedException {

        SpringApplication.run(Main.class,args);

        List<Animal> animales = new ArrayList<>();

        List<Animal> multiplos = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            Animal x = new Animal(i);
            animales.add(x);
            if(i%1000==0) multiplos.add(x);
        }

        for (Animal animal:multiplos
        ) {
            System.out.println(animal.toString());
            System.out.println("Esperando "+formatearFecha(LocalDateTime.now())+"...");
            Thread.sleep(2000);
        }

        int leones = animales.stream().filter(animal -> animal.getTipo().equals("León")).toArray().length;
        int gatos = animales.stream().filter(animal -> animal.getTipo().equals("Gato")).toArray().length;
        int perros = animales.stream().filter(animal -> animal.getTipo().equals("Perro")).toArray().length;
        int venados = animales.stream().filter(animal -> animal.getTipo().equals("Venado")).toArray().length;
        int elefantes = animales.stream().filter(animal -> animal.getTipo().equals("Elefante")).toArray().length;

        System.out.printf("Resumen: hay %d Leones, %d Gatos, %d Perros, %d Venados, %d Elefantes",
                leones, gatos, perros, venados, elefantes);
        }
        public static String formatearFecha(LocalDateTime currentDate){
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("HH:mm:ss");
            return  formatDate.format(currentDate);
    }

}
