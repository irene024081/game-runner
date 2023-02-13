package com.example.gaming.game;

public class GameRunner {
    //MarioGame game;
    SuperContractGame game;
//    public GameRunner(MarioGame game){
//        this.game = game;
//    }
    public GameRunner(SuperContractGame game){
        this.game = game;
    }

    public void run() {
        System.out.println("Running game" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
