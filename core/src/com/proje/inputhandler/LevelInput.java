package com.proje.inputhandler;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.proje.states.LevelState;
import com.proje.states.MenuState;

/**
 * Created by TIKAV4 on 3.04.2017.
 */

public class LevelInput implements InputProcessor {
    private LevelState levelState;

    public LevelInput(LevelState levelState){
        this.levelState=levelState;
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
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        if (levelState.getBackbutton().getButtonRect().contains(screenX,screenY)){
            levelState.getSm().pushState(new MenuState(levelState.getSm()));
        }
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
