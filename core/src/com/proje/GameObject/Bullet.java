package com.proje.GameObject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.proje.collision.Collision;
import com.proje.imageloader.ImageLoader;
import com.proje.collision.Collision;
import com.proje.states.PlayState;

import java.util.ArrayList;


public class Bullet implements GameObject {
    private Vector2 position;
    private Vector2 size;
    private int yon;
    private Rectangle colRec;
    private boolean ciz;
    private ArrayList<Dusman> dusmanlar;
    private ArrayList<Duvar> duvarlar;
    PlayState ps;

    public Bullet(float xPos, float yPos, int yon, ArrayList<Dusman> dusmanlar, ArrayList<Duvar> duvarlar, PlayState ps){
        this.dusmanlar = dusmanlar;
        position= new Vector2(xPos,yPos);
        size= new Vector2(Gdx.graphics.getWidth()/50,Gdx.graphics.getWidth()/50);
        this.yon = yon;
        this.duvarlar = duvarlar;
        ciz=true;
        colRec = new Rectangle(position.x,position.y,size.x,size.y);
        this.ps = ps;


    }


    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        if(ciz)
        sb.draw(ImageLoader.kursun,position.x,position.y,size.x,size.y);
        sb.end();


    }

    @Override
    public void update(float delta) {
        hareket();
        colRec.x=position.x;
        colRec.y = position.y;
        carpısma();



    }

    public void hareket(){

        if(yon==1){
            position.add(5,0);
        }else if (yon == 2){
            position.add(-5,0);
        }else if (yon == 3){
            position.add(0,-5);
        }else if (yon == 4){
            position.add(0,5);
        }else if (yon == 0){
            position.add(0,0);
        }
    }
    public void carpısma(){
        if(Collision.carpmaKontrolKursun(dusmanlar,this) && ciz== false ){
            ps.score +=15;
        }

        Collision.kontrolDuvarKursun(this,duvarlar);
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