package com.proje.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.proje.buttons.Button;
import com.proje.imageloader.ImageLoader;
import com.proje.inputhandler.AboutInput;
import com.proje.states.State;
import com.proje.states.StateManager;

/**
 * Created by TIKAV4 on 31.03.2017.
 */

public class AboutState extends State {

    private Button backButton,backbutton2;
    private StateManager sm;
    private boolean cizBack;

    public AboutState(StateManager sm) {
        super(sm);
        this.sm=sm;
        cizBack=true;
        Gdx.input.setInputProcessor(new AboutInput(this));
        backButton = new Button((Gdx.graphics.getWidth()-Gdx.graphics.getWidth()/6),0,Gdx.graphics.getWidth()/6,Gdx.graphics.getHeight()/15,ImageLoader.backButton);
        backbutton2 = new Button((Gdx.graphics.getWidth()-Gdx.graphics.getWidth()/6),0,Gdx.graphics.getWidth()/6,Gdx.graphics.getHeight()/15,ImageLoader.backButton);
    }
    public boolean isCizBack() {
        return cizBack;
    }

    public void setCizBack(boolean cizBack) {
        this.cizBack = cizBack;
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(ImageLoader.aboutAs,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        sb.end();
        sb.setProjectionMatrix(camera.combined);
        if (cizBack)
        backButton.render(sb);
        else
        backbutton2.render(sb);

    }

    @Override
    public void update(float delta) {

    }
    public StateManager getSm(){
        return sm;
    }

    public Button getBackButton() {
        return backButton;
    }

    public void setBackButton(Button backButton) {
        this.backButton = backButton;
    }


}
