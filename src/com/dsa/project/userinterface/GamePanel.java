package com.dsa.project.userinterface;


import com.dsa.project.state.State;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements Runnable, KeyListener{

    State gameState;
    Thread gameThread;
    InputManager inputManager;
    public boolean isRunning = true;

    public GamePanel(){

        inputManager = new InputManager(gameState);
    }

    public void startGame(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    int a = 0;
    @Override
    public void run() {

        long previousTime = System.nanoTime();
        long currentTime;
        long sleepTime;

        long period = 1000000000/80;

        while(isRunning){


            repaint();

            currentTime = System.nanoTime();
            sleepTime = period - (currentTime - previousTime);
            try{

                    if(sleepTime > 0)
                            Thread.sleep(sleepTime/1000000);
                    else Thread.sleep(period/2000000);

            }catch(Exception e){}

            previousTime = System.nanoTime();
        }

    }

    public void paint(Graphics g){

        g.drawImage(gameState.getBufferedImage(), 0, 0, this);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
