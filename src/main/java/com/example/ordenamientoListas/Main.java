package com.example.ordenamientoListas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);


        OrderLogic ran1 = new OrderLogic();


        System.out.println("========== Ordenamiento de numeros ===========");

        List<Integer> numerosRandom = new ArrayList<>();
        numerosRandom.add(ran1.randomNumber());
        numerosRandom.add(ran1.randomNumber());
        numerosRandom.add(ran1.randomNumber());
        numerosRandom.add(ran1.randomNumber());
        numerosRandom.add(ran1.randomNumber());

        System.out.println("1.- Creacion de la lista");
        System.out.println("Lista de numeros: " + numerosRandom);

        Collections.sort(numerosRandom);

        System.out.println("2.- Despues del ordenamiento");
        System.out.println("Lista de numeros: " + numerosRandom);

        Collections.sort(numerosRandom,Collections.reverseOrder());

        System.out.println("3.- Reversa del ordenamiento");
        System.out.println("Lista de numeros: " + numerosRandom);

        System.out.println("4.- Crear dos listas de Strings");

        List<String> listaUno = new ArrayList<>();
        List<String> listaDos = new ArrayList<>();

        listaUno.add("A");
        listaUno.add("B");
        listaUno.add("C");
        listaUno.add("D");
        listaUno.add("E");


        listaDos.add("B");
        listaDos.add("D");
        listaDos.add("F");
        listaDos.add("G");
        listaDos.add("H");


        System.out.println("Lista 1: " + listaUno);
        System.out.println("lista 2: " + listaDos);


        Set<String> listaMezcla = new HashSet<String>();
        listaMezcla.addAll(listaUno);
        listaMezcla.addAll(listaDos);

        System.out.println("Lista mezclada: " + listaMezcla);

    }
}
