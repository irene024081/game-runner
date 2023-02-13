package com.example.gaming;

import com.example.gaming.game.GameRunner;
import com.example.gaming.game.MarioGame;
import com.example.gaming.game.PacmanGame;
import com.example.gaming.game.SuperContractGame;

public class AppGamingBasicJava {
public static void main(String[] args){
    //var game = new MarioGame();
    //var game = new SuperContractGame();
    var game = new PacmanGame();
    var gameRunner = new GameRunner(game);

    gameRunner.run();

}
}
