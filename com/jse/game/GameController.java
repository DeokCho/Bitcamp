package com.jse.game;

import javax.swing.JOptionPane;

import com.jse.util.Constants;

public class GameController { // r 로컬변수 중 외부에서 들어오는 것: 파라미터
	public static void main(String[] args) {
		GameService gameService = new GameServiceImpl();
		Game game = null;
		while (true) {
			switch (JOptionPane.showInputDialog(Constants.GAME_MENU)) {
			case "0":
				return;
			case "1":
				game = new Game();
				Game[] games = gameService.list();
				for (int i = 0; i < games.length; i++) {
					String[] value = JOptionPane.showInputDialog(Constants.GAME_DICE_START).split(",");
					
				}
				break;
			}

		}
	}
}
