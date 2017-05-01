package com.proje.inputhandler;

import com.badlogic.gdx.InputProcessor;
import com.proje.levels.levelBoard;
import com.proje.states.LevelState;
import com.proje.states.MenuState;
import com.proje.states.PlayState;

/**
 * Created by okur on 21.04.2017.
 */

public class LevelStateInput implements InputProcessor {
   LevelState ls;
    int zorluk;

    public LevelStateInput(LevelState ls){
        this.ls = ls;
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
        for(int i = 0;i<ls.getLvl().getRow();i++){
            for(int j =0;j<ls.getLvl().getCol();j++){
                if(ls.getLvl().getLevels()[i][j].getCollisionRect().contains(screenX,screenY)){
                   zorluk = (i*ls.getLvl().getCol()+(j+1));
                    ls.getSm().pushState(new PlayState(ls.getSm(),zorluk));
                    System.out.println(zorluk);
                }
            }
        }
        if (ls.getBackbutton().getButtonRect().contains(screenX,screenY)){
            ls.getSm().pushState(new MenuState(ls.getSm()));
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
