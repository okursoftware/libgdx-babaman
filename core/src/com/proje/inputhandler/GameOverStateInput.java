package com.proje.inputhandler;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.InputProcessor;
import com.proje.states.GameOver;
import com.proje.states.MenuState;

/**
 * Created by okur on 21.04.2017.
 */

public class GameOverStateInput implements InputProcessor {
    GameOver go;
    public GameOverStateInput(GameOver go){
        this.go = go;

    }
    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        if (go.getBackButton().getButtonRect().contains(screenX,screenY)){
            go.getSm().pushState(new MenuState(go.getSm()));

        }
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
