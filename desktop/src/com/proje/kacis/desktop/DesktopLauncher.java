package com.proje.kacis.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.proje.kacis.KacisOyunu;

public class DesktopLauncher {
	public static void main (String[] arg) {
		//Oyunun yükseklik genişlik isim gibi özelliklerinin tutulduğu yer
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		//bu değişkene kendi oluşturduğumuz değerleri eşitledik
		config.title=KacisOyunu.TITLE;
		config.height=KacisOyunu.HEIGHT;
		config.width=KacisOyunu.WIDTH;
		new LwjglApplication(new KacisOyunu(), config);
	}
}
