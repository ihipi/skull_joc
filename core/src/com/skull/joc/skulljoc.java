package com.skull.joc;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class skulljoc extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
	private Sprite skull;
	private int altura ,amplada;
	private BitmapFont text;
	private int  x1, y1,x2,y2;
	
	@Override
	public void create () {
		 batch = new SpriteBatch();
		img = new Texture("Skullduino.png");
		skull= new Sprite(img,0,0,349,315);
		altura = Gdx.graphics.getHeight();
		amplada = Gdx.graphics.getWidth();
		text = new BitmapFont();
		
	}

	@Override
	public void render () {
		entrada();
		Gdx.gl.glClearColor(0.4f, 0.4f, 0.3f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
//		batch.draw(img, 50, 50);
		skull.draw(batch);
		text.draw(batch, "Skull Joc", 50, altura-10);
		batch.end();
	}
	
	private void entrada(){
		boolean boto=Gdx.input.isTouched(0);
		if(boto){
		  x1=Gdx.input.getX(0);
		  y1=altura-Gdx.input.getY(0);
		  
		  skull.setPosition(x1-175, y1-157);
		}
	}
}
