package com.proje.kacis;

//her oyunda "State" olur (durum). Bu state sürekli güncellenir ve çizilir

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.proje.imageloader.ImageLoader;
import com.proje.states.MenuState;
import com.proje.states.PlayState;
import com.proje.states.StateManager;

//Game classından kalıtım yaptık ve metodlarını kullandık
public class KacisOyunu extends Game {

	//oyunun temel özelliklerini oluşturduk
	public static int WIDTH=480;
	public static int HEIGHT=800;

	public static String TITLE="KAÇIS";

	private SpriteBatch sb;

	private static StateManager sm;
	//oyunu oluturur (resimler , sesler vs buraya)



	public void create() {
		//Oyun açıldığında ilk iş resimleri sesleri yüklemek olacak
		ImageLoader.Load();

		sm= new StateManager();
		sm.pushState(new MenuState(sm));
		sb= new SpriteBatch();

	}

	//oluşturulan seyler kullanılarak çizilir
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		sm.render(sb);
		sm.update(Gdx.graphics.getDeltaTime());

	}

	//yok edilir
	public void dispose() {

		ImageLoader.dispose();
	}
}
