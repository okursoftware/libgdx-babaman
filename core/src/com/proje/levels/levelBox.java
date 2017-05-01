package com.proje.levels;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.proje.imageloader.ImageLoader;

/**
 * Created by okur on 21.04.2017.
 */

public class levelBox {

    private float xKord;
    private float yKord;
    private float width;
    private float height;
    private Rectangle collisionRect;


    public levelBox(float xKord, float yKord, float width, float height)
    {
        this.xKord=xKord;
        this.yKord=yKord;
        this.width=width;
        this.height=height;
        collisionRect = new Rectangle(xKord, yKord, width, height);
    }

    public void render(SpriteBatch sb)
    {
        sb.begin();

        sb.draw(ImageLoader.levelBox, xKord, yKord, width, height);

        sb.end();
    }
    public void update(float delta)
    {
        collisionRect.x=xKord;
        collisionRect.y=yKord;
        collisionRect.width=width;
        collisionRect.height=height;
    }

    public Rectangle getCollisionRect() {
        return collisionRect;
    }

    public void setCollisionRect(Rectangle collisionRect) {
        this.collisionRect = collisionRect;
    }

    public float getxKord() {
        return xKord;
    }

    public void setxKord(float xKord) {
        this.xKord = xKord;
    }

    public float getyKord() {
        return yKord;
    }

    public void setyKord(float yKord) {
        this.yKord = yKord;
    }
}
