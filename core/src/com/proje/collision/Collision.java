package com.proje.collision;

import com.proje.GameObject.Bullet;
import com.proje.GameObject.Dusman;
import com.proje.GameObject.Duvar;
import com.proje.GameObject.Player;
import com.proje.GameObject.Yem;

import java.util.ArrayList;

/**
 * Created by okur on 7.04.2017.
 */

public class Collision {

    public static boolean carpmaKontrol(Player player, ArrayList<Duvar> duvarlar){

        for(int i = 0 ; i<duvarlar.size();i++){
            if(player.getColRec().overlaps(duvarlar.get(i).getColRec())){
                return true;
            }
        }

        return false;
    }
    public static boolean carpmaKontrolDusman(Dusman dusman, ArrayList<Duvar> duvarlar){

        for(int i = 0 ; i<duvarlar.size();i++){
            if(dusman.getColRec().overlaps(duvarlar.get(i).getColRec())){
                System.out.println("carptın");

                return true;
            }
        }


        return false;
    }
    public static boolean carpmaKontrolKursun(ArrayList<Dusman> dusmanlar, Bullet mermi){


        for(int i = 0 ; i<dusmanlar.size();i++){
            if(dusmanlar.get(i).getColRec().overlaps(mermi.getColRec())){
                dusmanlar.remove(i);
                mermi.setCiz(false);
                return true;
            }
        }


        return false;
    }
    public static boolean kontrolDuvarKursun( Bullet mermi, ArrayList<Duvar> duvarlar){

        for(int i = 0 ; i<duvarlar.size();i++){

                if(mermi.getColRec().overlaps(duvarlar.get(i).getColRec())){
                    mermi.setCiz(false);

                    return true;

            }
        }


        return false;
    }
    public static boolean kontrolDusmanPlayer(ArrayList<Dusman> dusmanlar, Player player){
        for(int i = 0 ; i<dusmanlar.size();i++){
            if(dusmanlar.get(i).getColRec().overlaps(player.getColRec())){
                dusmanlar.remove(i);
                return true;
            }
        }


        return false;
    }
    public static boolean kontrolPlayerYem(ArrayList<Yem> yemler, Player player){
        for(int i = 0 ; i<yemler.size();i++){
            if(yemler.get(i).getColRec().overlaps(player.getColRec())){
                yemler.remove(i);
                return true;
            }
        }


        return false;
    }
}
