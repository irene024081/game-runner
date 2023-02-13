package com.example.gaming.game;

public class MarioGame implements GameConsole{
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go into a hole");
    }
    public void left(){
        System.out.println("Move back");
    }
    public void right(){
        System.out.println("Accelerate");
    }
}
