package com.proje.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.proje.buttons.Button;
import com.proje.imageloader.ImageLoader;
import com.proje.inputhandler.GameOverStateInput;
import com.proje.inputhandler.LevelStateInput;

/**
 * Created by okur on 21.04.2017.
 */

public class GameOver extends State {
    private Button backButton;
    private StateManager sm;

    public GameOver(StateManager sm) {
        super(sm);
        this.sm = sm;
        Gdx.input.setInputProcessor(new GameOverStateInput(this));
        backButton=new Button((Gdx.graphics.getWidth()-Gdx.graphics.getWidth()/6),0,Gdx.graphics.getWidth()/6,Gdx.graphics.getHeight()/15,ImageLoader.backButton);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        ImageLoader.font.draw(sb,"GAME OVER", Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/3);
        sb.end();
        backButton.render(sb);

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
