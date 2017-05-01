package com.proje.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by TIKAV4 on 7.03.2017.
 */
//Burada state ler kontrol edilecel
public class StateManager {

    //bu state ler stack yapısı ile  çalışacak örneğin menuler
    private Stack<State> states;

    public StateManager(){

        states=new Stack<State>();

    }
    public void render(SpriteBatch sb){
        states.peek().render(sb);

    }
    public void update(float delta){
        states.peek().update(delta);

    }
    public void pushState(State state){
        states.push(state);
    }
    public void popState(State state){
        states.pop();
    }
}
