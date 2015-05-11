package com.skull.joc;

import com.badlogic.gdx.Screen;


//classe pantall
public abstract class Pantalla implements Screen {

	//cridem al joc principal
	protected Skulljoc joc;

	public Pantalla (Skulljoc joc){
		this.joc=joc;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
