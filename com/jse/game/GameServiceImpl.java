package com.jse.game;

public class GameServiceImpl implements GameService {
	public Game[] game;

	public GameServiceImpl() {
		game = new Game[3];
		this.game = game;
	}

	public Game[] getGame() {
		return game;
	}

	public void setGame(Game[] game) {
		this.game = game;
	}

}
