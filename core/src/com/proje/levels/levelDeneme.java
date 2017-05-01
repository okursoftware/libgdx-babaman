package com.proje.levels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.proje.GameObject.Bullet;
import com.proje.GameObject.Duvar;
import com.proje.GameObject.GameObject;

import java.util.ArrayList;

/**
 * Created by okur on 31.03.2017.
 */

public class levelDeneme implements GameObject {

  //  private Duvar d;
    private ArrayList<Duvar> duvarlar;
    public levelDeneme(){
        duvarlar = new ArrayList<Duvar>();
        duvarYerlestir();
    }
    @Override
    public void render(SpriteBatch sb) {
        for(int i = 0;i<duvarlar.size();i++){
            duvarlar.get(i).render(sb);
        }

    }

    @Override
    public void update(float delta) {

    }

    public void duvarYerlestir(){
        duvarlar.add(new Duvar(0,Gdx.graphics.getWidth()/32*5,Gdx.graphics.getWidth()/32,Gdx.graphics.getWidth()/8,true));

        duvarlar.add(new Duvar(Gdx.graphics.getWidth()/32*4,Gdx.graphics.getWidth()/32*5,Gdx.graphics.getWidth()/32,Gdx.graphics.getWidth()/8,true));

        duvarlar.add(new Duvar(0,Gdx.graphics.getWidth()/32*4,Gdx.graphics.getWidth()/8,Gdx.graphics.getWidth()/32,false));
        duvarlar.add(new Duvar(Gdx.graphics.getWidth()/8,Gdx.graphics.getWidth()/32*4,Gdx.graphics.getWidth()/8,Gdx.graphics.getWidth()/32,false));

    }

    public ArrayList<Duvar> getDuvarlar() {
        return duvarlar;
    }

    public void setDuvarlar(ArrayList<Duvar> duvarlar) {
        this.duvarlar = duvarlar;
    }
}
