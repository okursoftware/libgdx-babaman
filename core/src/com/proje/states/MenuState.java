package com.proje.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.proje.buttons.Button;
import com.proje.imageloader.ImageLoader;
import com.proje.inputhandler.MenuStateInput;
import com.proje.inputhandler.PlayerInput;

/**
 * Created by TIKAV4 on 7.03.2017.
 */

//bu state de menu, butonlar vs Ã§izdirecek
//abstact olarak belirlediÄŸimiz iÃ§in burada o metodlarÄ± implement etmek zorundayÄ±z.
public class MenuState extends State{

    private Button start,levels,about,exit;
    private Button start2,levels2,about2,exit2;
    private StateManager sm;
    private boolean cizStart,cizLevel,cizAbout,cizExit;

    public MenuState(StateManager sm) {
        super(sm);
        this.sm = sm;
        cizStart = true; cizAbout = true; cizLevel = true; cizExit = true;
        Gdx.input.setInputProcessor(new MenuStateInput(this));
        start = new Button((float) (Gdx.graphics.getWidth()/7.5),Gdx.graphics.getHeight()/10*2,Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/3,ImageLoader.start);
        levels = new Button((float)(Gdx.graphics.getWidth()/2),Gdx.graphics.getHeight()/10*2, Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/3,ImageLoader.levels);
        about = new Button((float)(Gdx.graphics.getWidth()/7.5), (float) (Gdx.graphics.getHeight()/10*5.4), Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/3,ImageLoader.about);
        exit = new Button((float)(Gdx.graphics.getWidth()/2), (float) (Gdx.graphics.getHeight()/10*5.4), Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/3,ImageLoader.exit);
        start2 = new Button((float) (Gdx.graphics.getWidth()/7.5),Gdx.graphics.getHeight()/10*2,Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/3,ImageLoader.start2);
        levels2 = new Button((float)(Gdx.graphics.getWidth()/2),Gdx.graphics.getHeight()/10*2, Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/3,ImageLoader.levels2);
        about2 = new Button((float)(Gdx.graphics.getWidth()/7.5), (float) (Gdx.graphics.getHeight()/10*5.4), Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/3,ImageLoader.about2);
        exit2 = new Button((float)(Gdx.graphics.getWidth()/2), (float) (Gdx.graphics.getHeight()/10*5.4), Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/3,ImageLoader.exit2);
    }

    public boolean isCizStart() {
        return cizStart;
    }

    public void setCizStart(boolean cizStart) {
        this.cizStart = cizStart;
    }

    public boolean isCizExit() {
        return cizExit;
    }

    public void setCizExit(boolean cizExit) {
        this.cizExit = cizExit;
    }

    public boolean isCizAbout() {
        return cizAbout;
    }

    public void setCizAbout(boolean cizAbout) {
        this.cizAbout = cizAbout;
    }

    public boolean isCizLevel() {
        return cizLevel;
    }

    public void setCizLevel(boolean cizLevel) {
        this.cizLevel = cizLevel;
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();

        sb.draw(ImageLoader.arkaPlan,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
      //  sb.draw(ImageLoader.yem,50,50,Gdx.graphics.getWidth()/15,Gdx.graphics.getWidth()/15);
        sb.end();

        if(cizStart)
            start.render(sb);
        else
            start2.render(sb);
        if(cizLevel)
            levels.render(sb);
        else
            levels2.render(sb);
        if(cizAbout)
            about.render(sb);
        else
            about2.render(sb);
        if(cizExit)
            exit.render(sb);
        else
            exit2.render(sb);

    }

    @Override
    public void update(float delta) {

    }

    public Button getStart() {
        return start;
    }

    public void setStart(Button start) {
        this.start = start;
    }

    public Button getLevels() {
        return levels;
    }

    public void setLevels(Button levels) {
        this.levels = levels;
    }

    public Button getAbout() {
        return about;
    }

    public void setAbout(Button about) {
        this.about = about;
    }

    public Button getExit() {
        return exit;
    }

    public void setExit(Button exit) {
        this.exit = exit;
    }

    public StateManager getSm() {
        return sm;
    }

    public void setSm(StateManager sm) {
        this.sm = sm;
    }

    public Button getStart2() {
        return start2;
    }

    public void setStart2(Button start2) {
        this.start2 = start2;
    }

    public Button getExit2() {
        return exit2;
    }

    public void setExit2(Button exit2) {
        this.exit2 = exit2;
    }

    public Button getAbout2() {
        return about2;
    }

    public void setAbout2(Button about2) {
        this.about2 = about2;
    }

    public Button getLevels2() {
        return levels2;
    }

    public void setLevels2(Button levels2) {
        this.levels2 = levels2;
    }
}
