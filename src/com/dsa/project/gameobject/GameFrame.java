package com.dsa.project.gameobject;


import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameFrame extends JFrame{

    public static final int SCREEN_WIDTH = 1000;
    public static final int SCREEN_HEIGHT = 600;


    public GameFrame(){

        super("Mega Man java game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = this.getToolkit();
        Dimension solution = toolkit.getScreenSize();
        this.setBounds((solution.width -SCREEN_WIDTH)/2, (solution.height -SCREEN_HEIGHT)/2, SCREEN_WIDTH, SCREEN_HEIGHT);


    }

    public void startGame(){

    }

    public static void main(String arg[]){

            GameFrame gameFrame = new GameFrame();
            gameFrame.setVisible(true);

    }
        
}
