package com.proje.GameObject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.proje.collision.Collision;
import com.proje.imageloader.ImageLoader;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by okur on 7.04.2017.
 */

public class Dusman implements GameObject {
    private Vector2 position;
    private Vector2 size;
    private Rectangle colRec;
    private int hareket;
    private int speed;
    private boolean ciz;
    public ArrayList<Duvar> duvarlar;
    Random rdn;

    public Dusman(ArrayList<Duvar> duvarlar, float x , float y) {
        this.duvarlar = duvarlar;
        hareket=1;
        ciz =true;
        speed = 3;

        position = new Vector2(x,y);
        size = new Vector2(Gdx.graphics.getWidth()/12,Gdx.graphics.getWidth()/12);
        colRec = new Rectangle(position.x,position.y,size.x,size.y);

        rdn = new Random();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        if(ciz)
        sb.draw(ImageLoader.dusman1,position.x,position.y,size.x,size.y);
        sb.end();

    }

    @Override
    public void update(float delta) {
        dusmanYapayZekasi();
        colRec.x = position.x;
        colRec.y = position.y;


    }

    public void dusmanYapayZekasi(){
        if(Collision.carpmaKontrolDusman(this,duvarlar)){
           if(hareket==1){
               position.add(3,0);
               hareket = rdn.nextInt(4)+1;
           }else if (hareket ==2){
               hareket =rdn.nextInt(4)+1;
               position.add(-3,0);
           }
           else if (hareket ==3){
               hareket =rdn.nextInt(4)+1;
               position.add(0,3);
           }
           else if (hareket ==4){
               hareket =rdn.nextInt(4)+1;
               position.add(0,-3);
           }
        }
        if(hareket==1)
        {
            position.add(-speed,0);
        }else if(hareket==2){
            position.add(speed,0);
        }
        else if(hareket==3){
            position.add(0,-speed);
        }
        else if(hareket==4){
            position.add(0,speed);
        }


    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public Rectangle getColRec() {
        return colRec;
    }

    public void setColRec(Rectangle colRec) {
        this.colRec = colRec;
    }

    public boolean isCiz() {
        return ciz;
    }

    public void setCiz(boolean ciz) {
        this.ciz = ciz;
    }
}
