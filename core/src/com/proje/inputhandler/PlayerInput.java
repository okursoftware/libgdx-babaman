package com.proje.inputhandler;

/**
 * Created by TIKAV4 on 8.03.2017.
 */

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector2;
import com.proje.GameObject.Player;
import com.proje.collision.Collision;
import com.proje.states.PlayState;


/**
 * Created by okur on 28.02.2017.
 */

public class PlayerInput implements InputProcessor{
    Player player;
    PlayState playScreen;
    int kursunYon=1;
    float x,y,x1,y1;
    int speed = Gdx.graphics.getWidth()/100;



    public PlayerInput(Player player,PlayState playScreen){
        this.player = player;
        this.playScreen = playScreen;
        x = playScreen.jystc.getDefaultPosition().x;
        y = playScreen.jystc.getDefaultPosition().y;


    }

    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.D){
            player.setHareketEt(true);
            kursunYon=1;
            player.setHareket(kursunYon);
            playScreen.setHareketYonu(1);


        }
        if(keycode == Input.Keys.A){
            player.setHareketEt(true);
            kursunYon=2;
            player.setHareket(kursunYon);
            playScreen.setHareketYonu(2);

        }
        if(keycode == Input.Keys.W){
            player.setHareketEt(true);
            kursunYon=3;
            player.setHareket(kursunYon);
            playScreen.setHareketYonu(3);

        }
        if(keycode == Input.Keys.S){
            player.setHareketEt(true);
            kursunYon=4;
            player.setHareket(kursunYon);
            playScreen.setHareketYonu(4);

        }
        if (keycode == Input.Keys.SPACE){
            if(playScreen.getMermiler().size()<30){
                playScreen.kursunAt(kursunYon);
                playScreen.mermiAdet--;
            }


        }

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {

        playScreen.kursunAt(kursunYon);
        playScreen.mermiAdet--;

        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {

            playScreen.jystc.setPosition(new Vector2(playScreen.jystc.getDefaultPosition()));




        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {


        if(playScreen.jystc.getColRec().contains(screenX,screenY)){
                playScreen.jystc.setPosition(new Vector2(screenX-playScreen.jystc.getSize().x/2,screenY-playScreen.jystc.getSize().y/2));


           // player.getPosition().add((playScreen.jystc.getPosition().x-playScreen.jystc.getDefaultPosition().x)/10,(playScreen.jystc.getPosition().y-playScreen.jystc.getDefaultPosition().y)/10);


        }
        x1 = playScreen.jystc.getPosition().x;
        y1 = playScreen.jystc.getPosition().y;
        float uzaklik = (float) Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));

      /*  if(y-y1<x-x1){
            player.setHareketEt(true);
            kursunYon=2;
            player.setHareket(kursunYon);
            playScreen.setHareketYonu(2);
        }
        if(y-y1>x-x1){
            player.setHareketEt(true);
            kursunYon=1;
            player.setHareket(kursunYon);
            playScreen.setHareketYonu(1);
        }*/
     if(x1<x){
         if((x-x1)*(x-x1)<(y-y1)*(y-y1)){
             if((y1-y)<0){
                 player.setHareketEt(true);
                 kursunYon=3;
                 player.setHareket(kursunYon);
                 playScreen.setHareketYonu(3);
             }else
             {
                 player.setHareketEt(true);
                 kursunYon=4;
                 player.setHareket(kursunYon);
                 playScreen.setHareketYonu(4);
             }

         }

         else{
             player.setHareketEt(true);
             kursunYon=2;
             player.setHareket(kursunYon);
             playScreen.setHareketYonu(2);
         }

     }
        if(x1>x){
            if((x-x1)*(x-x1)<(y-y1)*(y-y1)){
                if((y1-y)<0){
                    player.setHareketEt(true);
                    kursunYon=3;
                    player.setHareket(kursunYon);
                    playScreen.setHareketYonu(3);
                }else
                {
                    player.setHareketEt(true);
                    kursunYon=4;
                    player.setHareket(kursunYon);
                    playScreen.setHareketYonu(4);
                }

            }

            else{
                player.setHareketEt(true);
                kursunYon=1;
                player.setHareket(kursunYon);
                playScreen.setHareketYonu(1);
            }

        }
        Collision.carpmaKontrol(playScreen.getPlayer(),playScreen.getLvl2().getDuvarlar());

        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}