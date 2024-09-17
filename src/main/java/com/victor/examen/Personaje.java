package com.victor.examen;

public abstract class Personaje {
    private Integer salud;

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Personaje(Integer salud) {
        this.salud = salud;
    }

    public abstract Integer entrenar();

}
