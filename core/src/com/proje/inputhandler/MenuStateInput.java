package com.proje.inputhandler;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.proje.states.*;
import com.proje.states.LevelState;

/**
 * Created by TIKAV4 on 28.03.2017.
 */

public class MenuStateInput implements InputProcessor {

    private MenuState menuState;


    public MenuStateInput(MenuState menuState){
        this.menuState=menuState;

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
        if (menuState.getStart().getButtonRect().contains(screenX,screenY)){
            menuState.setCizStart(false);
        }
        else
        if (menuState.getLevels().getButtonRect().contains(screenX,screenY)){
            menuState.setCizLevel(false);
        }
        else
        if (menuState.getAbout().getButtonRect().contains(screenX,screenY)){
            menuState.setCizAbout(false);
        }
        else
        if (menuState.getExit().getButtonRect().contains(screenX,screenY)){
            menuState.setCizExit(false);
        }
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {

        menuState.setCizStart(true);
        menuState.setCizLevel(true);
        menuState.setCizAbout(true);
        menuState.setCizExit(true);

        if(menuState.getStart().getButtonRect().contains(screenX,screenY)){
            menuState.getSm().pushState(new PlayState(menuState.getSm(),1));
        }
        else
        if (menuState.getLevels().getButtonRect().contains(screenX,screenY)){
            menuState.getSm().pushState(new LevelState(menuState.getSm()));
        }
        else
        if (menuState.getAbout().getButtonRect().contains(screenX,screenY)){
            menuState.getSm().pushState(new com.proje.states.AboutState(menuState.getSm()));
        }
        else
        if (menuState.getExit().getButtonRect().contains(screenX,screenY)){
            Gdx.app.exit();
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
