package com.proje.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.proje.buttons.Button;
import com.proje.imageloader.ImageLoader;
import com.proje.inputhandler.LevelStateInput;
import com.proje.levels.levelBoard;

/**
 * Created by TIKAV4 on 31.03.2017.
 */

public class LevelState extends State {

    private Button backButton;
    private StateManager sm;
    private levelBoard lvl;



    public LevelState(StateManager sm) {
        super(sm);
        this.sm=sm;
        lvl = new levelBoard(1,2);
        Gdx.input.setInputProcessor(new LevelStateInput(this));
        backButton=new Button((Gdx.graphics.getWidth()-Gdx.graphics.getWidth()/6),0,Gdx.graphics.getWidth()/6,Gdx.graphics.getHeight()/15,ImageLoader.backButton);
    }

    @Override
    public void render(SpriteBatch sb) {
        backButton.render(sb);
        lvl.render(sb);
    }

    @Override
    public void update(float delta) {
        lvl.update(delta);

    }
    public Button getBackbutton() {
        return backButton;
    }

    public void setBackbutton(Button backbutton) {
        this.backButton = backbutton;
    }

    public StateManager getSm() {
        return sm;
    }

    public void setSm(StateManager sm) {
        this.sm = sm;
    }

    public levelBoard getLvl() {
        return lvl;
    }

    public void setLvl(levelBoard lvl) {
        this.lvl = lvl;
    }
}
