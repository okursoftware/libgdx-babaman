package com.proje.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

//her oyunda "State" olur (durum). Bu state sürekli güncellenir ve çizilir
public abstract class State {

    protected OrthographicCamera camera;

    public State(StateManager sm){

        camera = new OrthographicCamera();
        camera.setToOrtho(true, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());


    }
    public abstract void render(SpriteBatch sb);
    public abstract void update(float delta);

}
