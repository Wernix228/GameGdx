package com.mygdx.game.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class Study3Day extends ApplicationAdapter {

    KeyHandler keyH;
    Player player;
    OrthographicCamera camera;

    @Override
    public void create() {

        camera = new OrthographicCamera();
        keyH = new KeyHandler(100, 100, 4);
        player = new Player(keyH);

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(.01f, .01f, .01f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        camera.translate(keyH.playerX, keyH.playerY);
        camera.setToOrtho(true,1536f,864f);
        keyH.render();
        player.render();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void dispose() {
        player.dispose();
        
    }
}
