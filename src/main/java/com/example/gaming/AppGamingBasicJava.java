package com.example.gaming;

import com.example.gaming.game.GameRunner;
import com.example.gaming.game.MarioGame;
import com.example.gaming.game.SuperContractGame;

public class AppGamingBasicJava {
public static void main(String[] args){
    //var marioGame = new MarioGame();
    var superContractGame = new SuperContractGame();
    //var gameRunner = new GameRunner(marioGame);
    var gameRunner = new GameRunner(superContractGame);

    gameRunner.run();

}
}
