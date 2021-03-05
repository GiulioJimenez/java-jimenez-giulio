package com.engim;

import java.awt.*;

public class Rettangolo extends Poligono{

    private int larghezza;
    private int altezza;

    public Rettangolo(int l, int a){
        this.larghezza = l;
        this.altezza = a;
    }

    @Override
    public void disegna(Graphics g, int x, int y) {
        int m_altezza = altezza / 2;
        int m_larghezza = larghezza / 2;
        g.drawLine(x-m_larghezza, y-m_altezza, x+m_larghezza, y-m_altezza);
        g.drawLine(x-m_larghezza, y+m_altezza, x+m_larghezza, y+m_altezza);
        g.drawLine(x-m_larghezza, y-m_altezza, x-m_larghezza, y+m_altezza);
        g.drawLine(x+m_larghezza, y-m_altezza, x+m_larghezza, y+m_altezza);

    }
}
