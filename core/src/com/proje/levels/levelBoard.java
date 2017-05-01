package com.proje.levels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.proje.imageloader.ImageLoader;

/**
 * Created by okur on 21.04.2017.
 */

public class levelBoard {
    private int row,col;

    private levelBox[][] levels;

    private float bosluk;
    private float xKord,yKord,width,height;


    public levelBoard(int row,int col)
    {
        this.row=row;
        this.col=col;
        bosluk=Gdx.graphics.getWidth()/10;
        xKord=bosluk;
        yKord=bosluk;
        width =(Gdx.graphics.getWidth()-((col+1)*bosluk))/col;
        height=width;
        levels = new levelBox[row][col];
        initLevelBox();
    }
    public void render(SpriteBatch sb)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0; j<col;j++)
            {
                levels[i][j].render(sb);
                sb.begin();
                ImageLoader.font.draw(sb,Integer.toString((i*col+(j+1))) ,levels[i][j].getxKord()+30,levels[i][j].getyKord()+30);
                sb.end();
            }
        }
    }
    public void update(float delta)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0; j<col;j++)
            {
                levels[i][j].update(delta);
            }
        }
    }

    public void initLevelBox()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0; j<col;j++)
            {
                levels[i][j] = new levelBox(xKord, yKord, width, height);
                xKord+=(bosluk+width);
            }
            xKord=bosluk;
            yKord+=(bosluk+height);
        }
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getCol() {
        return col;
    }
    public void setCol(int col) {
        this.col = col;
    }
    public levelBox[][] getLevels() {
        return levels;
    }
    public void setLevels(levelBox[][] levels) {
        this.levels = levels;
    }
}
