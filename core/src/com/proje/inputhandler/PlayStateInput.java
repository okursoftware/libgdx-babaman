package com.proje.inputhandler;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.proje.states.PlayState;

/**
 * Created by TIKAV4 on 7.03.2017.
 */

public class PlayStateInput implements InputProcessor{
    PlayState playState;

    public PlayStateInput(PlayState playState){

        this.playState = playState;
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
