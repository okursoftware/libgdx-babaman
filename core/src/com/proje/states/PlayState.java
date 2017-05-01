package com.proje.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.proje.GameObject.Bullet;
import com.proje.GameObject.Player;
import com.proje.GameObject.joystic;
import com.proje.collision.Collision;
import com.proje.imageloader.ImageLoader;
import com.proje.inputhandler.PlayerInput;
import com.proje.levels.level1;
import com.proje.levels.level2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by TIKAV4 on 7.03.2017.
 */
//bu state de ise oyun başladığı andan itibaren kullanıcı karakterinin hareketlerini çizdirecek
public class PlayState extends State {
    Player player;


    private level1 lvl1;
    private level2 lvl2;
    private int hareketYonu ;
    private StateManager sm;
    Random rnd ;
    public int mermiAdet = 30;
    public int score = 0;
    String mermiYazi = "Kalan Kursun :";
    String scoreYazi = "Puan :";
    int zorluk;
    public joystic jystc;




    // Bullet kursun;
    private ArrayList<Bullet> mermiler;


    public PlayState(StateManager sm,int zorluk) {
        super(sm);
        this.sm = sm;
        jystc = new joystic();

        this.zorluk = zorluk;
        player = new Player();

        lvl1 = new level1();
        lvl2 = new level2();



        hareketYonu = 0;
        rnd = new Random();

        mermiler = new ArrayList<Bullet>();
        Gdx.input.setInputProcessor(new PlayerInput(player,this));




    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);


        for(int i = 0;i<mermiler.size();i++){
            mermiler.get(i).render(sb);
        }
        int sayi = rnd.nextInt(20000);
        if(zorluk==1){
            if(sayi<25){
                lvl1.setEkle(1);
            }else if (sayi <50){
                lvl1.setEkle(2);
            }else if (sayi <75){
                lvl1.setEkle(3);
            }
        }else if(zorluk==2){
            if(sayi<25){
               // lvl2.setEkle(1);
            }else if (sayi <50){
                lvl2.setEkle(2);
            }else if (sayi <75){
                lvl2.setEkle(3);
            }
        }



        player.render(sb);
        if(zorluk==1){
            lvl1.render(sb);
        }else if( zorluk == 2){
            lvl2.render(sb);
        }


        sb.begin();
        ImageLoader.font.draw(sb, mermiYazi + Integer.toString(mermiAdet),Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/100);
        ImageLoader.font.draw(sb, scoreYazi + Integer.toString(score),Gdx.graphics.getWidth()/100,Gdx.graphics.getHeight()/100);

        sb.end();
        jystc.render(sb);



    }

    @Override
    public void update(float delta) {
        player.update(delta);
        if(zorluk ==1 ){
            lvl1.update(delta);
            if(Collision.carpmaKontrol(player,lvl1.getDuvarlar())){

                if(hareketYonu==1){
                    player.getPosition().add(-3,0);
                }else if(hareketYonu==2){
                    player.getPosition().add(3,0);

                }else if(hareketYonu==3){
                    player.getPosition().add(0,3);

                }else if(hareketYonu==4){
                    player.getPosition().add(0,-3);
                }

            }
            if(Collision.kontrolDusmanPlayer(lvl1.getDusmanlar(),player)){
                sm.pushState(new GameOver(sm));
            }
            if(Collision.kontrolPlayerYem(lvl1.getYemler(),player)){
                score +=10;
                if(lvl1.getYemler().size()==0){
                    sm.pushState(new WinState(sm,score));
                }
            }
        }else if(zorluk ==2){
            lvl2.update(delta);
            if(Collision.carpmaKontrol(player,lvl2.getDuvarlar())){
               // player.setHareket(0);
                if(hareketYonu==1){
                    player.getPosition().add(-3,0);
                }else if(hareketYonu==2){
                    player.getPosition().add(3,0);

                }else if(hareketYonu==3){
                    player.getPosition().add(0,3);

                }else if(hareketYonu==4){
                    player.getPosition().add(0,-3);
                }

            }
            if(Collision.kontrolDusmanPlayer(lvl2.getDusmanlar(),player)){
                sm.pushState(new GameOver(sm));
            }
            if(Collision.kontrolPlayerYem(lvl2.getYemler(),player)){
                score +=10;
                if(lvl2.getYemler().size()==0){
                    sm.pushState(new WinState(sm,score));
                }
            }
        }


        for(int i = 0;i<mermiler.size();i++){
            mermiler.get(i).update(delta);
        }

        jystc.update(delta);
    }

    public Player getPlayer(){
        return player;
    }




    public void kursunAt(int yon){
        if(zorluk == 1)
            mermiler.add(new Bullet(player.getPosition().x+Gdx.graphics.getWidth()/24,player.getPosition().y+Gdx.graphics.getWidth()/24,yon,lvl1.getDusmanlar(),lvl1.getDuvarlar(),this));
        else if(zorluk ==2)
            mermiler.add(new Bullet(player.getPosition().x+Gdx.graphics.getWidth()/24,player.getPosition().y+Gdx.graphics.getWidth()/24,yon,lvl2.getDusmanlar(),lvl2.getDuvarlar(),this));
    }

    public int getHareketYonu() {
        return hareketYonu;
    }

    public void setHareketYonu(int hareketYonu) {
        this.hareketYonu = hareketYonu;
    }

    public ArrayList<Bullet> getMermiler() {
        return mermiler;
    }

    public void setMermiler(ArrayList<Bullet> mermiler) {
        this.mermiler = mermiler;
    }

    public level1 getLvl1() {
        return lvl1;
    }

    public void setLvl1(level1 lvl1) {
        this.lvl1 = lvl1;
    }

    public level2 getLvl2() {
        return lvl2;
    }

    public void setLvl2(level2 lvl2) {
        this.lvl2 = lvl2;
    }
}
