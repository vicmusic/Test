package com.victor.examen;

public class Espadachin extends Personaje {
    private Integer ataque = 0;

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Espadachin(Integer ataque) {
        this.ataque = ataque;
    }

    @Override
    public Integer entrenar() {

        for (int index = 0; index < 5; index++) {
            ataque = ataque + 10;

            System.out.println("El espadachin realiza " + ataque + " ataque");
        }

        return ataque;
    }

}
