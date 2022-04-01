package com.grizz.game;

import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.Controllers;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class ControllerSteuerung extends Steuerung {
    public void inputUpdate() {
        Controller controller = Controllers.getCurrent();
        controller.getButton(0);
        if (controller.canVibrate()) {
            controller.startVibration(10000000, 1.0f);
        }
    }
}
