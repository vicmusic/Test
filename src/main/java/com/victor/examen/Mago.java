package com.victor.examen;

public class Mago extends Personaje {

    private String magia;

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public Mago(String magia) {
        this.magia = magia;
    }

    @Override
    public Integer entrenar() {
        throw new UnsupportedOperationException("Unimplemented method 'entrenar'");
    }

}
