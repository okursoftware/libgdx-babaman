package com.proje.inputhandler;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.proje.states.*;
import com.proje.states.AboutState;

/**
 * Created by TIKAV4 on 2.04.2017.
 */

public class AboutInput implements InputProcessor {

    private AboutState aboutState;

    public AboutInput(AboutState aboutState){
        this.aboutState=aboutState;
    }
    @Override
    public boolean keyDown(int keycode) {

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        if(keycode == Input.Keys.BACK){
            aboutState.getSm().pushState(new MenuState(aboutState.getSm()));

        }
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        if (aboutState.getBackButton().getButtonRect().contains(screenX,screenY)){
            aboutState.setCizBack(false);
        }
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        aboutState.setCizBack(true);
        if (aboutState.getBackButton().getButtonRect().contains(screenX,screenY)){
            aboutState.getSm().pushState(new MenuState(aboutState.getSm()));
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
