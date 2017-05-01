package com.proje.imageloader;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by TIKAV4 on 7.03.2017.
 */

//Görüntülerin yüklenme işlemi halledilecek
public class ImageLoader {
public static Texture back,textMenu, karakterler,nesneler,text,aboutA;

public static TextureRegion aboutAs,karakterSag1,karakterSag2,duvar1,duvar2,karakterSol1,karakterSol2,karakterAsagı1,karakterAsagı2,karakterYukarı1,karakterYukarı2,kursun,playButtonRegion;
        public static TextureRegion dusman1,yem,levelBox;
        public static TextureRegion arkaPlan,start,levels,about,exit,start2,levels2,about2,exit2;
        public static TextureRegion backButton,backButton2,joysticReg,don;


        public static BitmapFont font;
        public  static Texture fontTexture,joystic;
        public static void Load(){

                joystic = new Texture(Gdx.files.internal("joystic.png"));
                joysticReg = new TextureRegion(joystic,0,0,joystic.getWidth(),joystic.getHeight());

                font = new BitmapFont(Gdx.files.internal("font.fnt"),true);
                //font.getData().setScale((float) 2);
                fontTexture = new Texture(Gdx.files.internal("font.png"));
                fontTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

                nesneler = new Texture(Gdx.files.internal("nesneler.png"));
                aboutA=new Texture(Gdx.files.internal("about.png"));
                aboutAs = new TextureRegion(aboutA,0,0,480,800);
                aboutAs.flip(false,true);
                levelBox = new TextureRegion(nesneler,8,8,80,80);

                kursun = new TextureRegion(nesneler,260,60,36,36);

        karakterler = new Texture(Gdx.files.internal("karakterler.png"));

        karakterSag1 = new TextureRegion(karakterler, 352,0,32,32);
        //  karakter1.setRegionHeight(Gdx.graphics.getWidth()/12);
        karakterSag1.flip(false,true);

        karakterSag2 = new TextureRegion(karakterler, 320,0,32,32);
        //   karakter2.setRegionHeight(Gdx.graphics.getWidth()/12);
        karakterSag2.flip(false,true);

        karakterSol1 = new TextureRegion(karakterler,320,64,32,32);
        karakterSol1.flip(false,true);

        karakterSol2 = new TextureRegion(karakterler,352,64,32,32);
        karakterSol2.flip(false,true);

        karakterYukarı1 = new TextureRegion(karakterler,320,96,32,32);
        karakterYukarı1.flip(false,true);

        karakterYukarı2 = new TextureRegion(karakterler,352,96,32,32);
        karakterYukarı2.flip(false,true);

        karakterAsagı1 = new TextureRegion(karakterler,320,32,32,32);
        karakterAsagı1.flip(false,true);

        karakterAsagı2 = new TextureRegion(karakterler,352,32,32,32);
        karakterAsagı2.flip(false,true);


        nesneler = new Texture(Gdx.files.internal("nesne.png"));

        duvar1 = new TextureRegion(nesneler,195,0,15,95);
        duvar1.flip(false,true);

        duvar2 = new TextureRegion(nesneler,0,98,93,15);
        duvar2.flip(false,true);

        yem = new TextureRegion(nesneler,100,99,14,15);
        don = new TextureRegion(nesneler,116,99,15,15);
        dusman1 = new TextureRegion(karakterler,0,0,32,32);
        dusman1.flip(false,true);



        //Menunun arkaplanÄ±nÄ± Ã§izdirdik
        textMenu = new Texture("menu.png");
        //butonlarÄ± Ã§izdirdik
        back = new Texture("back.png");

        //Butona tÄ±klanmadan Ã¶nceki buton gÃ¶rsellerini Ã§izdirdik
        arkaPlan= new TextureRegion(textMenu,1250,13,1755,3052);
        arkaPlan.flip(false,true);
        start=new TextureRegion(textMenu,0,0,609,762);
        start.flip(false,true);
        levels=new TextureRegion(textMenu,0,765,603,757);
        levels.flip(false,true);
        about=new TextureRegion(textMenu,0,1528,601,756);
        about.flip(false,true);
        exit=new TextureRegion(textMenu,0,2292,601,758);
        exit.flip(false,true);

        //Butona basÄ±lÄ± tutulduÄŸunu belirtmek iÃ§in butonun benzer grselleri Ã§izdirildi.
        start2=new TextureRegion(textMenu,609,0,609,762);
        start2.flip(false,true);
        levels2=new TextureRegion(textMenu,603,765,603,757);
        levels2.flip(false,true);
        about2=new TextureRegion(textMenu,601,1528,601,756);
        about2.flip(false,true);
        exit2=new TextureRegion(textMenu,601,2292,601,758);
        exit2.flip(false,true);

        backButton = new TextureRegion(back,0,0,258,84);
        backButton.flip(false,true);
        backButton2 = new TextureRegion(back,0,86,316,168);
        backButton2.flip(false,true);





        text = new Texture("red.png");
        playButtonRegion= new TextureRegion(text,0,0,300,80);
        playButtonRegion.flip(false,true);

        }

public static void dispose(){

        karakterler.dispose();
        nesneler.dispose();


        }
        }
