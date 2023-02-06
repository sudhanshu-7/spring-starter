package com.sudhanshu.learnspringframework;

import com.sudhanshu.learnspringframework.game.GameRunner;
import com.sudhanshu.learnspringframework.game.MarioGame;
import com.sudhanshu.learnspringframework.game.PackmanGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
//		var marioGame = new MarioGame();
		var packmanGame = new PackmanGame();
		var gameRunner = new GameRunner(packmanGame);
		gameRunner.run(); 
	}

}
