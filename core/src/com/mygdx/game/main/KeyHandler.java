package com.mygdx.game.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.utils.TimeUtils;

public class KeyHandler {

    int playerX;
    int playerY;
    int playerSpeed;

    long lastDropTime = System.nanoTime();

    public KeyHandler(int playerX, int playerY, int playerSpeed) {
        this.playerX = playerX;
        this.playerY = playerY;
        this.playerSpeed = playerSpeed;
    }

    public void render() {
        if (TimeUtils.nanoTime() - lastDropTime > 1000000000) {
            if (Gdx.input.isKeyPressed(Input.Keys.W)) {
                playerY += playerSpeed;
            } else if (Gdx.input.isKeyPressed(Input.Keys.S)) {
                playerY -= playerSpeed;
            } else if (Gdx.input.isKeyPressed(Input.Keys.D)) {
                playerX += playerSpeed;
            } else if (Gdx.input.isKeyPressed(Input.Keys.A)) {
                playerX -= playerSpeed;
            }
        }
    }

    public int getPlayerX() {
        return playerX;
    }

    public void setPlayerX(int playerX) {
        this.playerX = playerX;
    }

    public int getPlayerY() {
        return playerY;
    }

    public void setPlayerY(int playerY) {
        this.playerY = playerY;
    }

    public int getPlayerSpeed() {
        return playerSpeed;
    }

    public void setPlayerSpeed(int playerSpeed) {
        this.playerSpeed = playerSpeed;
    }
}
