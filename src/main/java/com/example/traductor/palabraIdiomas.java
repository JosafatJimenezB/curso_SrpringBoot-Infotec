package com.example.traductor;

public class palabraIdiomas {

    private String español;
    private String ingles;
    private String frances;

    public palabraIdiomas(String español, String ingles, String frances) {
        this.español = español;
        this.ingles = ingles;
        this.frances = frances;
    }

    public String getEspañol() {
        return español;
    }

    public void setEspañol(String español) {
        this.español = español;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getFrances() {
        return frances;
    }

    public void setFrances(String frances) {
        this.frances = frances;
    }

    @Override
    public String toString() {
        return "palabraIdiomas{" +
                "español='" + español + '\'' +
                ", ingles='" + ingles + '\'' +
                ", frances='" + frances + '\'' +
                '}';
    }
}
