package com.proje.GameObject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.proje.collision.Collision;
import com.proje.imageloader.ImageLoader;



public class Player implements GameObject {

    private Vector2 position;
    private Vector2 size;
    private Vector2 direction;
    private int speed;

    private float xKord;
    private float yKord;

    private Animation runSag;
    private Animation runSol;
    private Animation runYukari;
    private Animation runAsagi;

    private float time = 0;

    private int ciz,hareket;
    private boolean hareketEt;
    private boolean moveWithDirection;

    private Rectangle colRec;

    public Player(){

        position = new Vector2((float) (Gdx.graphics.getWidth()-Gdx.graphics.getWidth()/8.4), (float) (Gdx.graphics.getHeight()/9.4));

        //position = new Vector2((float) (Gdx.graphics.getWidth()),Gdx.graphics.getHeight()/2);
        size = new Vector2(Gdx.graphics.getWidth()/12,Gdx.graphics.getWidth()/12);
        hareketEt = false;
        hareket = 0;
        speed  = Gdx.graphics.getWidth()/200;


        ciz=0;

        Array<TextureRegion> sag = new Array<TextureRegion>();  //animasyon oluşturma;
        sag.add(ImageLoader.karakterSag1);
        sag.add(ImageLoader.karakterSag2);
        runSag = new Animation(0.1f, sag);

        Array<TextureRegion> sol = new Array<TextureRegion>();  //animasyon oluşturma;
        sol.add(ImageLoader.karakterSol1);
        sol.add(ImageLoader.karakterSol2);
        runSol = new Animation(0.1f, sol);

        Array<TextureRegion> yukari = new Array<TextureRegion>();  //animasyon oluşturma;
        yukari.add(ImageLoader.karakterYukarı1);
        yukari.add(ImageLoader.karakterYukarı2);
        runYukari = new Animation(0.1f, yukari);

        Array<TextureRegion> asagi = new Array<TextureRegion>();  //animasyon oluşturma;
        asagi.add(ImageLoader.karakterAsagı1);
        asagi.add(ImageLoader.karakterAsagı2);
        runAsagi = new Animation(0.1f, asagi);

        colRec = new Rectangle(position.x,position.y,size.x,size.y);

        direction=new Vector2();
    }



    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        time += Gdx.graphics.getDeltaTime();//her telefon için aynı hız
        if(ciz==0)
            sb.draw((TextureRegion) runSag.getKeyFrame(time,true),position.x,position.y,size.x,size.y);
        else if(ciz == 1)
            sb.draw((TextureRegion) runSol.getKeyFrame(time,true),position.x,position.y,size.x,size.y);
        else if(ciz == 2)
            sb.draw((TextureRegion) runYukari.getKeyFrame(time,true),position.x,position.y,size.x,size.y);
        else if(ciz == 3)
            sb.draw((TextureRegion) runAsagi.getKeyFrame(time,true),position.x,position.y,size.x,size.y);
        // sb.draw(ImageLoader.karakter1,position.x,position.y,size.x,size.y);

        sb.end();


    }

    @Override
    public void update(float delta) {

        if(hareketEt){
            if(hareket == 1){//SAG
                position.add(speed,0);
                ciz = 0;
            } else if (hareket == 2){//sol
                position.add(-speed,0);
                ciz = 1;
            }else if (hareket == 3){//yukari
                position.add(0,-speed);
                ciz = 2;
            }else  if(hareket == 4 ){//asagı
                position.add(0,speed);
               ciz = 3;
            }else if(hareket == 0){
                position.add(0,0);
            }
        }
        colRec.x=position.x;
        colRec.y = position.y;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public Vector2 getSize() {
        return size;
    }

    public void setSize(Vector2 size) {
        this.size = size;
    }

    public int getCiz() {
        return ciz;
    }

    public void setCiz(int ciz) {
        this.ciz = ciz;
    }

    public int getHareket() {
        return hareket;
    }

    public void setHareket(int hareket) {
        this.hareket = hareket;
    }

    public boolean isHareketEt() {
        return hareketEt;
    }

    public void setHareketEt(boolean hareketEt) {
        this.hareketEt = hareketEt;
    }

    public Rectangle getColRec() {
        return colRec;
    }

    public void setColRec(Rectangle colRec) {
        this.colRec = colRec;
    }

    public boolean isMoveWithDirection() {
        return moveWithDirection;
    }

    public void setMoveWithDirection(boolean moveWithDirection) {
        this.moveWithDirection = moveWithDirection;
    }
}