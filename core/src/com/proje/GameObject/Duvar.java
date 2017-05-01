package com.proje.GameObject;

import com.badlogic.gdx.graphics.g2d.PixmapPackerIO;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.proje.imageloader.ImageLoader;

/**
 * Created by okur on 31.03.2017.
 */

public class Duvar implements GameObject {
    private Vector2 position;
    private Vector2 size;
    private boolean ciz;
    private Rectangle colRec;
    public Duvar(float xPos, float yPos,float xSize , float ySize,boolean ciz){
        position = new Vector2(xPos,yPos);
        size = new Vector2(xSize,ySize);
        this.ciz = ciz;
        colRec = new Rectangle(position.x,position.y,size.x,size.y);

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        if(ciz){
            sb.draw(ImageLoader.duvar1,position.x,position.y,size.x,size.y);
        } else{
            sb.draw(ImageLoader.duvar2,position.x,position.y,size.x,size.y);
        }

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
