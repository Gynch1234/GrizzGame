package com.grizz.game;

public abstract class Steuerung {
    public boolean springen, greifen, links, rechts, unten, oben, rollen, trommeln;

    public abstract void inputUpdate();
}
