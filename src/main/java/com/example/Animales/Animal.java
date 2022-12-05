package com.example.Animales;

public class Animal {

    private int idAnimal;
    private String tipo;

    public Animal(int idAnimal) {
        this.idAnimal = idAnimal;
        String tiposAnimal[] = {"leon", "Gato", "Perro", "venado", "Elefante"};
        int i = (int) (Math.random()* 5);
        tipo = tiposAnimal[i];
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idAnimal=" + this.idAnimal +
                ", tipo='" + this.tipo + '\'' +
                '}';
    }
}
