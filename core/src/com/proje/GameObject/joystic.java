package com.proje.GameObject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.proje.imageloader.ImageLoader;

/**
 * Created by okur on 30.04.2017.
 */

public class joystic implements GameObject {


    private Vector2 position;
    private Vector2 size;
    private Vector2 defaultPosition;
    private boolean ciz;
    private Rectangle colRec;

    public joystic(){

        position= new Vector2((float) ((Gdx.graphics.getWidth())/(2)), (float) (Gdx.graphics.getHeight()/(1.3)));
        size= new Vector2(Gdx.graphics.getWidth()/5,Gdx.graphics.getWidth()/5);
        colRec = new Rectangle(position.x,position.y,size.x,size.y);
        defaultPosition= new Vector2((float) ((Gdx.graphics.getWidth())/(2.5)),(float) (Gdx.graphics.getHeight()/(1.3)));
    }
    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(ImageLoader.joysticReg,position.x,position.y,size.x,size.y);
        sb.end();
    }

    @Override
    public void update(float delta) {
        colRec.x=position.x;
        colRec.y = position.y;

    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public Vector2 getSize() {
        return size;
    }

    public void setSize(Vector2 size) {
        this.size = size;
    }

    public Rectangle getColRec() {
        return colRec;
    }

    public void setColRec(Rectangle colRec) {
        this.colRec = colRec;
    }

    public Vector2 getDefaultPosition() {
        return defaultPosition;
    }

    public void setDefaultPosition(Vector2 defaultPosition) {
        this.defaultPosition = defaultPosition;
    }
}
