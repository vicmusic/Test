package com.victor.examen;

public class Torre extends Personaje {
    private Integer nivel = 0;

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Torre(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public Integer entrenar() {
        for (int index = 0; index < 5; index++) {
            nivel = nivel + 1;

            System.out.println("El nivel de la torre es: " + nivel + " al entenar");
        }

        return nivel;

    }

}
