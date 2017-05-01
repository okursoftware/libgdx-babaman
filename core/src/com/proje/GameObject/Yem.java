package com.proje.GameObject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.proje.collision.Collision;
import com.proje.imageloader.ImageLoader;

/**
 * Created by okur on 21.04.2017.
 */

public class Yem implements GameObject {


    private Vector2 position;
    private Vector2 size;
    private Rectangle colRec;

    public Yem(float xPos, float yPos){
        position= new Vector2(xPos,yPos);
        size= new Vector2(Gdx.graphics.getWidth()/30,Gdx.graphics.getWidth()/30);
        colRec = new Rectangle(position.x,position.y,size.x,size.y);
    }
    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(ImageLoader.yem,position.x,position.y,size.x,size.y);
        sb.end();

    }

    @Override
    public void update(float delta) {

    }

    public Rectangle getColRec() {
        return colRec;
    }

    public void setColRec(Rectangle colRec) {
        this.colRec = colRec;
    }
}
