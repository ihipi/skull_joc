package com.skull.joc;

import java.util.Comparator;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.Animation.PlayMode;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;
import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

public class Skulljoc extends Game {
	
	
	//creem spritebach per tenir-lo per totes les pantalles
	SpriteBatch batch;
	private Screen pantalla;
	
	@Override
	public void create() {
		batch=new SpriteBatch();
		pantalla = new PantallaPunk(this);
		
	}

	

	@Override
	public void dispose(){
		super.dispose();
		this.batch=batch;
	}
	
}
