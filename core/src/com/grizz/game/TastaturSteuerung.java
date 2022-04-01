package com.grizz.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class TastaturSteuerung extends Steuerung {
    public void inputUpdate() {
        links = Gdx.input.isButtonPressed(Input.Keys.A);
        rechts = Gdx.input.isButtonPressed(Input.Keys.D);
        unten = Gdx.input.isButtonPressed(Input.Keys.S);
        oben = Gdx.input.isButtonPressed(Input.Keys.W);
        springen = Gdx.input.isButtonPressed(Input.Keys.SPACE);
        greifen = Gdx.input.isButtonPressed(Input.Keys.J);
        trommeln = Gdx.input.isButtonPressed(Input.Keys.K);
        rollen = trommeln && (rechts || links);
    }
}
