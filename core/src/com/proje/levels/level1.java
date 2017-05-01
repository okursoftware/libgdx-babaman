package com.proje.levels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.proje.GameObject.Dusman;
import com.proje.GameObject.Duvar;
import com.proje.GameObject.Yem;

import java.util.ArrayList;

/**
 * Created by ekinci on 7.04.2017.
 */

public class level1 extends level {


    protected ArrayList<Duvar> duvarlar;
    private Vector2 oran;
    private ArrayList<Dusman> dusmanlar;
    private ArrayList<Yem> yemler;
    private int ekle;

    public level1() {

        oran = new Vector2(Gdx.graphics.getWidth()/8,Gdx.graphics.getWidth()/32);
        duvarlar = new ArrayList<Duvar>();
        dusmanlar = new ArrayList<Dusman>();
        yemler = new ArrayList<Yem>();
        duvarYerlestir();
        ekle = 0;

    }

    @Override
    public void render(SpriteBatch sb) {
        super.render(sb);
        for(int i = 0;i<duvarlar.size();i++){
            duvarlar.get(i).render(sb);
        }
        for(int i = 0;i<yemler.size();i++){
            yemler.get(i).render(sb);
        }
        for(int i = 0;i<dusmanlar.size();i++){
            dusmanlar.get(i).render(sb);
        }

    }

    @Override
    public void update(float delta) {
        super.update(delta);
        for(int i = 0;i<dusmanlar.size();i++){
            dusmanlar.get(i).update(delta);
        }
        rasgeleDusman();
    }

    @Override
    public void duvarYerlestir() {
        super.duvarYerlestir();
        //1
        duvarlar.add(new Duvar(0,oran.y*4,oran.x,oran.y,false));
        duvarlar.add(new Duvar(0,oran.y*5,oran.y,oran.x,true));
        duvarlar.add(new Duvar(0,oran.y*9,oran.y,oran.x,true));
        duvarlar.add(new Duvar(0,oran.y*13,oran.y,oran.x,true));
        duvarlar.add(new Duvar(0,oran.y*17,oran.y,oran.x,true));
        duvarlar.add(new Duvar(0,oran.y*21,oran.y,oran.x,true));
        duvarlar.add(new Duvar(0,oran.y*25,oran.y,oran.x,true));
        duvarlar.add(new Duvar(0,oran.y*29,oran.y,oran.x,true));
        duvarlar.add(new Duvar(0,oran.y*33,oran.y,oran.x,true));
        duvarlar.add(new Duvar(0,oran.y*37,oran.y,oran.x,true));
        duvarlar.add(new Duvar(0,oran.y*41,oran.y,oran.x,true));
        duvarlar.add(new Duvar(0,oran.y*45,oran.x,oran.y,false));
        //2
        duvarlar.add(new Duvar(oran.x,oran.y*4,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x,oran.y*9,Gdx.graphics.getWidth()/8,oran.y,false));
        duvarlar.add(new Duvar(oran.x,oran.y*9,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x,oran.y*13,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x,oran.y*16,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x,oran.y*21,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x,oran.y*21,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x,oran.y*25,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x,oran.y*28,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x,oran.y*33,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x,oran.y*33,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x,oran.y*37,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x,oran.y*40,oran.x,oran.y,false));
     //   duvarlar.add(new Duvar(oran.x*4,oran.y*37,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x,oran.y*45,oran.x,oran.y,false));
        //3
        duvarlar.add(new Duvar(oran.x*2,oran.y*9,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*2,oran.y*16,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*2,oran.y*21,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*2,oran.y*28,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*2,oran.y*33,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*2,oran.y*40,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*2,oran.y*45,oran.x,oran.y,false));
        //4
        duvarlar.add(new Duvar(oran.x*2,oran.y*4,oran.x,oran.y,false));
        duvarlar.add(new Duvar((float) (oran.x*2.75),oran.y*9,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*2.75),oran.y*13,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*2.75),oran.y*21,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*2.75),oran.y*25,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*2.75),oran.y*33,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*2.75),oran.y*37,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x*3,oran.y*45,oran.x,oran.y,false));
        //
        duvarlar.add(new Duvar(oran.x*3,oran.y*4,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*4,oran.y*45,oran.x,oran.y,false));
        //5
        duvarlar.add(new Duvar(oran.x*4,oran.y*4,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*4,oran.y*9,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*4,oran.y*9,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x*4,oran.y*13,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x*4,oran.y*17,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x*4,oran.y*21,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x*4,oran.y*25,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x*4,oran.y*29,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x*4,oran.y*33,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x*4,oran.y*37,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x*4,oran.y*40,oran.x,oran.y,false));
        //6
        duvarlar.add(new Duvar(oran.x*5,oran.y*4,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*5,oran.y*9,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*5,oran.y*40,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*5,oran.y*45,oran.x,oran.y,false));
        //7
        duvarlar.add(new Duvar(oran.x*6,oran.y*4,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*6,oran.y*9,oran.x,oran.y,false));
        duvarlar.add(new Duvar((float) (oran.x*6.75),oran.y*9,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*6.75),oran.y*13,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*6.75),oran.y*17,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*6.75),oran.y*21,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*6.75),oran.y*25,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*6.75),oran.y*29,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*6.75),oran.y*33,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*6.75),oran.y*37,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x*6,oran.y*40,oran.x,oran.y,false));
        duvarlar.add(new Duvar(oran.x*6,oran.y*45,oran.x,oran.y,false));
        //6
        duvarlar.add(new Duvar(oran.x*7,oran.y*4,oran.x,oran.y,false));

        duvarlar.add(new Duvar((float) (oran.x*7.75),oran.y*5,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*7.75),oran.y*9,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*7.75),oran.y*13,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*7.75),oran.y*17,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*7.75),oran.y*21,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*7.75),oran.y*25,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*7.75),oran.y*29,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*7.75),oran.y*33,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*7.75),oran.y*37,oran.y,oran.x,true));
        duvarlar.add(new Duvar((float) (oran.x*7.75),oran.y*41,oran.y,oran.x,true));
        duvarlar.add(new Duvar(oran.x*7,oran.y*45,oran.x,oran.y,false));

        // duvarlar.add(new Duvar(Gdx.graphics.getWidth()/8*3,Gdx.graphics.getWidth()/32*4,Gdx.graphics.getWidth()/8,Gdx.graphics.getWidth()/32,false));
        //duvarlar.add(new Duvar(Gdx.graphics.getWidth()/8*4,Gdx.graphics.getWidth()/32*4,Gdx.graphics.getWidth()/8,Gdx.graphics.getWidth()/32,false));
        //duvarlar.add(new Duvar(Gdx.graphics.getWidth()/8*5,Gdx.graphics.getWidth()/32*4,Gdx.graphics.getWidth()/8,Gdx.graphics.getWidth()/32,false));
       // duvarlar.add(new Duvar(Gdx.graphics.getWidth()/8*6,Gdx.graphics.getWidth()/32*4,Gdx.graphics.getWidth()/8,Gdx.graphics.getWidth()/32,false));
       // duvarlar.add(new Duvar(Gdx.graphics.getWidth()/8*7,Gdx.graphics.getWidth()/32*4,Gdx.graphics.getWidth()/8,Gdx.graphics.getWidth()/32,false));
        dusmanEkle();
        yemEkle();


    }

    public void dusmanEkle(){

        dusmanlar.add(new Dusman(duvarlar,oran.x*2,oran.y*5+5));
        dusmanlar.add(new Dusman(duvarlar,oran.x*7,oran.y*18+5));
    }
    public void rasgeleDusman (){
        if(ekle == 1){
            dusmanlar.add(new Dusman(duvarlar,oran.x*2,oran.y*18+5));
        }else if(ekle == 2){
            dusmanlar.add(new Dusman(duvarlar,oran.x*2,oran.y*5+5));
        }else if(ekle == 3){
            dusmanlar.add(new Dusman(duvarlar,oran.x*7,oran.y*18+5));
        }
        ekle = 0;
    }
    public void yemEkle(){
        yemler.add(new Yem(oran.x*1/2,oran.y*6));
        yemler.add(new Yem(oran.x*3/2,oran.y*6));
        yemler.add(new Yem(oran.x*5/2,oran.y*6));
        yemler.add(new Yem(oran.x*7/2,oran.y*6));
        yemler.add(new Yem(oran.x*9/2,oran.y*6));
        yemler.add(new Yem(oran.x*11/2,oran.y*6));
        yemler.add(new Yem(oran.x*13/2,oran.y*6));

        yemler.add(new Yem(oran.x*7/2,oran.y*10));
        yemler.add(new Yem(oran.x*7/2,oran.y*14));
        yemler.add(new Yem(oran.x*7/2,oran.y*18));
        yemler.add(new Yem(oran.x*7/2,oran.y*22));
        yemler.add(new Yem(oran.x*7/2,oran.y*26));
        yemler.add(new Yem(oran.x*7/2,oran.y*30));
        yemler.add(new Yem(oran.x*7/2,oran.y*34));
        yemler.add(new Yem(oran.x*7/2,oran.y*38));


        yemler.add(new Yem((float) (oran.x*7.3),oran.y*10));
        yemler.add(new Yem((float) (oran.x*7.3),oran.y*14));
        yemler.add(new Yem((float) (oran.x*7.3),oran.y*18));
        yemler.add(new Yem((float) (oran.x*7.3),oran.y*22));
        yemler.add(new Yem((float) (oran.x*7.3),oran.y*26));
        yemler.add(new Yem((float) (oran.x*7.3),oran.y*30));
        yemler.add(new Yem((float) (oran.x*7.3),oran.y*34));
        yemler.add(new Yem((float) (oran.x*7.3),oran.y*38));
        yemler.add(new Yem((float) (oran.x*7.3),oran.y*42));


        yemler.add(new Yem(25,oran.y*10));
        yemler.add(new Yem(25,oran.y*14));
        yemler.add(new Yem(25,oran.y*18));
        yemler.add(new Yem(25,oran.y*22));
        yemler.add(new Yem(25,oran.y*26));
        yemler.add(new Yem(25,oran.y*30));
        yemler.add(new Yem(25,oran.y*34));
        yemler.add(new Yem(25,oran.y*38));
        yemler.add(new Yem(25,oran.y*42));

        //yemler.add(new Yem(oran.x*1/2,oran.y*42));
        yemler.add(new Yem(oran.x*3/2,oran.y*42));
        yemler.add(new Yem(oran.x*5/2,oran.y*42));
        yemler.add(new Yem(oran.x*7/2,oran.y*42));
        yemler.add(new Yem(oran.x*9/2,oran.y*42));
        yemler.add(new Yem(oran.x*11/2,oran.y*42));
        yemler.add(new Yem(oran.x*13/2,oran.y*42));
        //yemler.add(new Yem(oran.x*15/2,oran.y*42));

        System.out.println(oran.x+"aa");
    }

    public ArrayList<Dusman> getDusmanlar() {
        return dusmanlar;
    }

    public void setDusmanlar(ArrayList<Dusman> dusmanlar) {
        this.dusmanlar = dusmanlar;
    }

    public int getEkle() {
        return ekle;
    }

    public void setEkle(int ekle) {
        this.ekle = ekle;
    }

    public ArrayList<Duvar> getDuvarlar() {
        return duvarlar;
    }

    public void setDuvarlar(ArrayList<Duvar> duvarlar) {
        this.duvarlar = duvarlar;
    }

    public ArrayList<Yem> getYemler() {
        return yemler;
    }

    public void setYemler(ArrayList<Yem> yemler) {
        this.yemler = yemler;
    }
}
