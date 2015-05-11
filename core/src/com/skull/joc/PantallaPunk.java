package com.skull.joc;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class PantallaPunk extends Pantalla {

	private Texture punk;
	private TextureRegion punkRegion;
	private SpriteBatch batch;
	private int punkAmple=155,punkAlt=6287;
	private Animation punkAnimation;
	private TextureRegion[] punkFrame;
	
	
	public PantallaPunk(Skulljoc joc) {
		super(joc);
		
		
	}
	@Override
	public void show(){
		punk= new Texture("punk_patada.png");
		punkRegion=new TextureRegion(punk,punkAmple,punkAlt);
		TextureRegion[][] punkArray=punkRegion.split(punkAmple, punkAlt/28);
		
		for (int i = 0; i < punkArray.length; i++) {
			
		}
		
		
	}
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub

	}
	 @Override
	 public void dispose(){
		 super.dispose();
		 font.dispose();
	 }

}
