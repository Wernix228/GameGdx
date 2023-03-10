package com.mygdx.game.main;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import jdk.nashorn.internal.codegen.MapCreator;

public class Player {

    SpriteBatch batch;
    Texture img;
    KeyHandler keyH;

    public  Player(KeyHandler keyH){
        this.img = new Texture("player.png");
        this.batch = new SpriteBatch();
        this.keyH = keyH;
    }
    public void render(){
        batch.begin();
        batch.draw(img,keyH.playerX,keyH.playerY,96,96);
        batch.end();
    }
    public void dispose(){
        batch.dispose();
        img.dispose();
    }


}
