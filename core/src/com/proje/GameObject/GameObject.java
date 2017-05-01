package com.proje.GameObject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;



public interface GameObject {

    public  void render(SpriteBatch sb);

    public void update(float delta);
}


