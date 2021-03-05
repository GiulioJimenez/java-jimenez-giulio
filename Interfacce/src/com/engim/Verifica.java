package com.engim;

public class Verifica implements Comparable<Verifica>{
    private int voto;

    public Verifica(int voto) {
        this.voto = voto;
    }

    @Override
    public int compareTo(Verifica o) {
        if (voto < o.voto)
            return -1;
        else if (voto == o.voto)
            return 0;
        else return 1;
    }
}
