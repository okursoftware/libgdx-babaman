package com.proje.buttons;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.proje.GameObject.GameObject;
import com.proje.imageloader.ImageLoader;

/**
 * Created by TIKAV4 on 28.03.2017.
 */

public class Button implements GameObject{

    private TextureRegion buttonImage;
    private float xKord,yKord,width,height;
    private Rectangle buttonRect;
    //private  TextureRegion textureRegion;

    public Button(float xKord,float yKord,float width,float height, TextureRegion textureRegion){
        this.xKord=xKord;
        this.yKord=yKord;
        this.width=width;
        this.height=height;
        this.buttonImage=textureRegion;

        buttonRect = new Rectangle(xKord,yKord,width,height);
    }
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(buttonImage,xKord,yKord,width,height);
        sb.end();

    }

    public void update(float delta) {

    }

    public Rectangle getButtonRect(){
        return buttonRect;
    }
}
