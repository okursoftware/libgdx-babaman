package com.proje.levels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.proje.GameObject.Donus;
import com.proje.GameObject.Dusman;
import com.proje.GameObject.Duvar;
import com.proje.GameObject.Yem;

import java.util.ArrayList;

/**
 * Created by okur on 7.04.2017.
 */

public class level2 extends level {

    protected ArrayList<Duvar> duvarlar;
    private Vector2 oran;
    private ArrayList<Dusman> dusmanlar;
    private ArrayList<Yem> yemler;
    //private ArrayList<Donus> donusler;
    private int ekle;

    public level2() {
        oran = new Vector2(Gdx.graphics.getWidth()/8,Gdx.graphics.getWidth()/32);
        duvarlar = new ArrayList<Duvar>();
        dusmanlar = new ArrayList<Dusman>();
        yemler = new ArrayList<Yem>();
       // donusler = new ArrayList<Donus>();
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
        /*for(int i = 0;i<donusler.size();i++){
            donusler.get(i).render(sb);
        }*/
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

        for(int i=0;i<=7;i++){
            duvarlar.add(new Duvar(oran.x*i,oran.y*4,oran.x,oran.y,false));
            duvarlar.add(new Duvar(oran.x*i,oran.y*48,oran.x,oran.y,false));
            if (0<i && i<7) {
                duvarlar.add(new Duvar(oran.x * i , oran.y * 8, oran.x, oran.y, false));
                duvarlar.add(new Duvar(oran.x * i , oran.y * 44, oran.x, oran.y, false));
                duvarlar.add(new Duvar(oran.x * i , oran.y * 16, oran.x, oran.y, false));
                duvarlar.add(new Duvar(oran.x * i , oran.y * 36, oran.x, oran.y, false));
                duvarlar.add(new Duvar(oran.x * i , oran.x*5, oran.x, oran.y, false));
                duvarlar.add(new Duvar(oran.x * i , oran.x*8-oran.y, oran.x, oran.y, false));
            }
        }
        for (int j=1;j<12;j++) {
            duvarlar.add(new Duvar(0,oran.x*j,oran.y,oran.x,true));
            duvarlar.add(new Duvar(oran.x*8-oran.y,oran.x*j,oran.y,oran.x,true));
            if (1<j && j<4){
                duvarlar.add(new Duvar(oran.x,oran.x*j,oran.y,oran.x,true));
                duvarlar.add(new Duvar(oran.x*7-oran.y,oran.x*j,oran.y,oran.x,true));
            }
            if (4<j && j<8){
                duvarlar.add(new Duvar(oran.x,oran.x*j,oran.y,oran.x,true));
                duvarlar.add(new Duvar(oran.x*7-oran.y,oran.x*j,oran.y,oran.x,true));
            }
            if (8<j && j<11){
                duvarlar.add(new Duvar(oran.x,oran.x*j,oran.y,oran.x,true));
                duvarlar.add(new Duvar(oran.x*7-oran.y,oran.x*j,oran.y,oran.x,true));
            }
        }

        dusmanEkle();
        yemEkle();
       // donusEkle();

    }

    public void dusmanEkle(){

        dusmanlar.add(new Dusman(duvarlar,oran.x*2,oran.y*5+5));
        dusmanlar.add(new Dusman(duvarlar,oran.x*4,oran.y*33));
    }
    public void rasgeleDusman (){
        if(ekle == 1){
            dusmanlar.add(new Dusman(duvarlar,oran.x*2,oran.y*18+5));
        }else if(ekle == 2){
            dusmanlar.add(new Dusman(duvarlar,oran.x,oran.y*33));
        }else if(ekle == 3){
            dusmanlar.add(new Dusman(duvarlar,oran.x*4,oran.y*33));
        }
        ekle = 0;
    }
    public void yemEkle(){
        for (int i=3 ;i<=27;i+=4) {
            yemler.add(new Yem(oran.y * i, oran.y * 6));
        }
        for (int j=9 ; j<=45 ;j+=4) {
            yemler.add(new Yem(oran.y * 2, oran.y * j));
            yemler.add(new Yem(oran.y * 29, oran.y * j));
        }
        for (int k=6;k<29;k+=4) {
            yemler.add(new Yem(oran.y * k, oran.y * 33 + 15));
            yemler.add(new Yem(oran.y * k, oran.y * 18));
            yemler.add(new Yem(oran.y * k, oran.y * 46));
        }
    }
 /*   public void donusEkle(){
        donusler.add(new Donus(oran.x *1/ 2, (float) (oran.x * 1.5)));
        donusler.add(new Donus((float) (oran.x *14.5/ 2), (float) (oran.x * 1.5)));

        donusler.add(new Donus(oran.x *1/ 2, (float) (oran.x * 11.5)));
        donusler.add(new Donus((float) (oran.x *14.5/ 2), (float) (oran.x * 11.5)));

        donusler.add(new Donus(oran.x *1/ 2, (float) (oran.x * 4.5)));
        donusler.add(new Donus((float) (oran.x *14.5/ 2), (float) (oran.x * 4.5)));

        donusler.add(new Donus(oran.x *1/ 2, (float) (oran.x * 8.3)));
        donusler.add(new Donus((float) (oran.x *14.5/ 2), (float) (oran.x * 8.3)));


    }*/

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

    public Vector2 getOran() {
        return oran;
    }

    public void setOran(Vector2 oran) {
        this.oran = oran;
    }

}
