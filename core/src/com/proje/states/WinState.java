package com.proje.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.proje.buttons.Button;
import com.proje.imageloader.ImageLoader;
import com.proje.inputhandler.GameOverStateInput;
import com.proje.inputhandler.WinStateInput;

/**
 * Created by okur on 21.04.2017.
 */

public class WinState extends State {

    private Button backButton;
    private StateManager sm;
    public int score;
    String scoreYazi = "PUAN : ";
    public WinState(StateManager sm,int score) {
        super(sm);
        this.sm = sm;
        this.score = score;
        Gdx.input.setInputProcessor(new WinStateInput(this));
        backButton=new Button((Gdx.graphics.getWidth()-Gdx.graphics.getWidth()/6),0,Gdx.graphics.getWidth()/6,Gdx.graphics.getHeight()/15, ImageLoader.backButton);
    }



    @Override
    public void render(SpriteBatch sb) {
        backButton.render(sb);
        sb.begin();
        ImageLoader.font.draw(sb, scoreYazi + Integer.toString(score),Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/3);


        sb.end();
    }

    @Override
    public void update(float delta) {

    }

    public Button getBackButton() {
        return backButton;
    }

    public void setBackButton(Button backButton) {
        this.backButton = backButton;
    }

    public StateManager getSm() {
        return sm;
    }

    public void setSm(StateManager sm) {
        this.sm = sm;
    }
}
